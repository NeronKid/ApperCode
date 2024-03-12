package ru.hachaton_avito.team.deployment.controllers;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.hachaton_avito.team.deployment.dto.CategoryDto;
import ru.hachaton_avito.team.deployment.dto.LocationDto;
import ru.hachaton_avito.team.deployment.repository.*;

@RestController
@RequestMapping("data")
@RequiredArgsConstructor
public class AdminController {

	CategoryRepository category;
	LocationRepository location;
	LocationGraphRepository locationGraph;
	CategoryGraphRepository categoryGraph;
	DiscountRepository discount;

	@GetMapping("/locations")
	public List<LocationDto> location () {
		return location.findAll();
	}

	@GetMapping("/categories")
	public List<CategoryDto> categories(){
		return category.findAll();
	}
}
