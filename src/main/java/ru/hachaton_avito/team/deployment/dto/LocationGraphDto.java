package ru.hachaton_avito.team.deployment.dto;


import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@Table(name = "location_graph")
@Entity(name = "location_graph")
public class LocationGraphDto {

	@Id
	Long id;
	Long idParent;
}
