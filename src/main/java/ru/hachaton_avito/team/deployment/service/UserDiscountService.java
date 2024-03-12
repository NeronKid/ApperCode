package ru.hachaton_avito.team.deployment.service;

import java.util.List;

import ru.hachaton_avito.team.deployment.models.Category;
import ru.hachaton_avito.team.deployment.models.Location;
import ru.hachaton_avito.team.deployment.models.User;

public interface UserDiscountService {

	public List<Location> getLocationsByCategory(Category category);
	public List<User> getUserWithDiscount();
	public void generateBasePrices();
	//public void createAndSavePriceMatrix(Category category, Location location, List<Price> prices);
}
