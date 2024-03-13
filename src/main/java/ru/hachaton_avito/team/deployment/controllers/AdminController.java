package ru.hachaton_avito.team.deployment.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import ru.hachaton_avito.team.deployment.dto.*;
import ru.hachaton_avito.team.deployment.models.BaseData;
import ru.hachaton_avito.team.deployment.models.NewPrice;
import ru.hachaton_avito.team.deployment.models.User;
import ru.hachaton_avito.team.deployment.repository.*;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

@RestController
@RequestMapping("data")
@RequiredArgsConstructor
public class AdminController {

    CategoryRepository categoryRepo;
    LocationRepository locationRepo;
    LocationGraphRepository locationGraphRepo;
    CategoryGraphRepository categoryGraphRepo;
    DiscountRepository discountRepo;
    UserRepository userRepo;
    PriceRepository priceRepo;

    @Scheduled
    @GetMapping("/location")
    public List<LocationDto> getLocation() {
        return locationRepo.findAll();
    }

    @Scheduled
    @GetMapping("/category")
    public List<CategoryDto> getCategories() {
        return categoryRepo.findAll();
    }

    @Scheduled
    @GetMapping("/location/{id}")
    public LocationDto findLocation(@PathVariable Long id) {
        return locationRepo.findById(id).orElse(null);
    }

    @Scheduled
    @GetMapping("/category/{id}")
    public CategoryDto findCategories(@PathVariable Long id) {
        return categoryRepo.findById(id).orElse(null);
    }

    @Scheduled
    @GetMapping("/user")
    public List<User> getUsers() {
        List<User> usersNew = new ArrayList<>();
        List<UserDto> userDto = userRepo.findAll();
        userDto.forEach(item -> {
            List<DiscountDto> discountDto = discountRepo.findByIdUser(item.getId());
            List<Integer> discounts = discountDto.stream()
                    .map(DiscountDto::getDiscount)
                    .collect(Collectors.toList());
            User newUser = new User();
            newUser.setId(item.getId());
            newUser.setName(item.getName());
            newUser.setDiscount(discounts);
            usersNew.add(newUser);
        });
        return usersNew;
    }

    @Scheduled
    @GetMapping("/user/{id}")
    public User findUser(@PathVariable Long id) {
        return userRepo.findById(id).map(userDto -> {
            List<DiscountDto> discountDto = discountRepo.findByIdUser(userDto.getId());
            List<Integer> discounts = discountDto.stream()
                    .map(DiscountDto::getDiscount)
                    .collect(Collectors.toList());
            User newUser = new User();
            newUser.setId(userDto.getId());
            newUser.setName(userDto.getName());
            newUser.setDiscount(discounts);
            return newUser;
        }).orElse(null);
    }

    @Scheduled
    @GetMapping("/price/{idLocation}/{idCategory}")
    public BaseData generatePrice(@PathVariable Long idLocation, @PathVariable Long idCategory) {
        List<PriceDto> prices = priceRepo.findByLocationIdAndCategoryId(idLocation, idCategory);
        if (prices == null) return null;
        LocationDto location = findLocation(idLocation);
        if (location == null) return null;
        CategoryDto category = findCategories(idCategory);
        if (category == null) return null;
        List<User> users = new ArrayList<>();
        prices.forEach(price -> {
            User user = findUser(price.getIdUser());
            users.add(user);
        });
        BaseData baseData = new BaseData();
        baseData.setCategory(category);
        baseData.setLocation(location);
        baseData.setUserAndPrice(users);
        OptionalDouble averagePrice = prices.stream().mapToLong(PriceDto::getPrice).average();
        baseData.setPrice(averagePrice.isPresent() ? (long) averagePrice.getAsDouble() : 0L);
        return baseData;
    }

    @Scheduled
    @PostMapping("/priсe")
    public BaseData priceCreate(@RequestBody NewPrice newPrice) {
        PriceDto priceSendInDto = new PriceDto();
        priceSendInDto.setIdCategory(newPrice.getIdCategory());
        priceSendInDto.setIdLocation(newPrice.getIdLocation());
        priceSendInDto.setPrice(newPrice.getPrice());

        PriceDto priceDto = priceRepo.save(priceSendInDto);
        LocationDto location = findLocation(priceDto.getIdLocation());
        if (location == null) return null;
        CategoryDto category = findCategories(priceDto.getIdCategory());
        if (category == null) return null;
        List<PriceDto> prices = priceRepo.findByLocationIdAndCategoryId(location.getId(), category.getId());
        if (prices == null) return null;
        List<User> users = new ArrayList<>();
        prices.forEach(price -> {
            User user = findUser(price.getIdUser());
            users.add(user);
        });

        BaseData baseData = new BaseData();
        baseData.setCategory(category);
        baseData.setLocation(location);
        baseData.setUserAndPrice(users);
        OptionalDouble averagePrice = prices.stream().mapToLong(PriceDto::getPrice).average();
        baseData.setPrice(averagePrice.isPresent() ? (long) averagePrice.getAsDouble() : 0L);

        return baseData;
    }
}
