package ru.hachaton_avito.team.deployment.service;

import java.util.List;

import ru.hachaton_avito.team.deployment.models.Category;
import ru.hachaton_avito.team.deployment.models.Location;

public interface UserDiscountService {

	public List<Location> getLocationsByCategory(Category category);
	
	public List<User> getUserWithDiscount();
}
