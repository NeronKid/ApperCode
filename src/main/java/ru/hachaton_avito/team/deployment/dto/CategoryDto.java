package ru.hachaton_avito.team.deployment.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "category")
@Entity(name = "category")
public class CategoryDto {
	@Id
    Long id;
	String name;
	
}
