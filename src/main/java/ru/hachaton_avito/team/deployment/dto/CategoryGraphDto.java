package ru.hachaton_avito.team.deployment.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryGraphDto {
	private Long id;
	
	private Long parentId;
	
	
}
