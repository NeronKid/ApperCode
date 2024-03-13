package ru.hachaton_avito.team.deployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.hachaton_avito.team.deployment.controllers.CheckFillController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		CheckFillController fill = new CheckFillController(applicationContext);
		fill.checkAndUpdateCategory();
		fill.checkAndUpdateLocation();
	}
}
