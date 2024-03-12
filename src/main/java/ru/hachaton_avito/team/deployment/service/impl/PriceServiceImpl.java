package ru.hachaton_avito.team.deployment.service.impl;

import java.util.List;

import ru.hachaton_avito.team.deployment.dto.CategoryDto;
import ru.hachaton_avito.team.deployment.dto.LocationDto;
import ru.hachaton_avito.team.deployment.models.BaseData;
import ru.hachaton_avito.team.deployment.models.Price;
import ru.hachaton_avito.team.deployment.models.User;
import ru.hachaton_avito.team.deployment.service.PriceService;


public class PriceServiceImpl implements PriceService{

	@Override
	public NewPrice findByLocationCategory(BaseData baseData, CategoryDto category, LocationDto location) {
		Long categoryId = baseData.getCategory().getId();
		Long locationId = baseData.getLocation().getId();
		List<User> price = baseData.getUserAndPrice(category.);
		return price;
	}

}
