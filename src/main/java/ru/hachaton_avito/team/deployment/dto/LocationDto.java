package ru.hachaton_avito.team.deployment.dto;

import lombok.Data;
import jakarta.validation.constraints.NotEmpty;

@Data
public class LocationDto {
	private Long id;
	@NotEmpty
	private String country;
}
