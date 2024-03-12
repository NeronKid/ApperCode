package ru.hachaton_avito.team.deployment.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hachaton_avito.team.deployment.dto.CategoryDto;
import ru.hachaton_avito.team.deployment.dto.DiscountDto;
import ru.hachaton_avito.team.deployment.dto.LocationDto;
import ru.hachaton_avito.team.deployment.dto.UserDto;
import ru.hachaton_avito.team.deployment.models.User;
import ru.hachaton_avito.team.deployment.repository.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("data")
@RequiredArgsConstructor
public class AdminController {

    CategoryRepository category;
    LocationRepository location;
    LocationGraphRepository locationGraph;
    CategoryGraphRepository categoryGraph;
    DiscountRepository discount;
    UserRepository user;

    @GetMapping("/location")
    public List<LocationDto> location() {
        return location.findAll();
    }

    @GetMapping("/category")
    public List<CategoryDto> categories() {
        return category.findAll();
    }

    @GetMapping("/location/{id}")
    public LocationDto findLocation(@PathVariable Long id) {
        return location.findById(id).orElse(null);
    }

    @GetMapping("/category/{id}")
    public CategoryDto findCategories(@PathVariable Long id) {
        return category.findById(id).orElse(null);
    }

    @GetMapping("/user")
    public List<User> users() {
        List<User> usersNew = new ArrayList<>();
        List<UserDto> userDto = user.findAll();
        userDto.forEach(item -> {
            List<DiscountDto> discountDto = discount.findByIdUser(item.getId());
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

    @GetMapping("/user/{id}")
    public User findUser(@PathVariable Long id) {
        UserDto userDto = user.findById(id).orElse(null);
        List<DiscountDto> discountDto = discount.findByIdUser(item.getId());
        List<Integer> discounts = discountDto.stream()
                .map(DiscountDto::getDiscount)
                .collect(Collectors.toList());
        User newUser = new User();
        newUser.setId(userDto.getId());
        newUser.setName(userDto.getName());
        newUser.setDiscount(discounts);
        return newUser;
    }


    //@GetMapping("/prise/{idLocation}/{idCategory}")


    //@PostMapping("/prise")  будешь получать NewPrice() и вносить в PriceDto
}
