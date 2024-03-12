package ru.hachaton_avito.team.deployment.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.hachaton_avito.team.deployment.models.Category;
import ru.hachaton_avito.team.deployment.models.Location;

@RestController
public class AdminController {
	
	@GetMapping("/locations")
	public List<Location> location () {
		return null;
		
	}
	//public List<PriceMatrix> getMatrixByLocation(Location location){
		// Загрузка списка матриц по локации из базы данных
	//}
	@GetMapping("/categories")
	public List<Category> categories(){
		return null;
		
	}
}
