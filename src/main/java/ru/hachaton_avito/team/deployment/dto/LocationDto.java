package ru.hachaton_avito.team.deployment.dto;

import lombok.Builder;
import lombok.Data;
import jakarta.validation.constraints.NotEmpty;

@Data
@Builder
public class LocationDto {
	private Long id;
	@NotEmpty
	private String name;
	
}
