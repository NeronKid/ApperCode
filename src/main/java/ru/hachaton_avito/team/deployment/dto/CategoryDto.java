package ru.hachaton_avito.team.deployment.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryDto {
	private Long id;
	@NotEmpty
	private String name;
}
