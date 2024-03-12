package ru.hachaton_avito.team.deployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.hachaton_avito.team.generated.CheckFillRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		CheckFillRepository fill = new CheckFillRepository();
		fill.checkAndUpdateCategory();
		fill.checkAndUpdateLocation();
	}
}
