package ru.hachaton_avito.team.deployment.dto;

import jakarta.persistence.EmbeddedId;
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
@Table
@Entity
public class LocationDto {
	@Id
	Long id;
	String name;
}
