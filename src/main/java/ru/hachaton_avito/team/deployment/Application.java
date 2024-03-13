package ru.hachaton_avito.team.deployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.hachaton_avito.team.deployment.controllers.CheckFillController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		CheckFillController fill = new CheckFillController();
		fill.checkAndUpdateCategory();
		fill.checkAndUpdateLocation();
	}
}
