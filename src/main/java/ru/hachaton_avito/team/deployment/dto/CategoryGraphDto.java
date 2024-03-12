package ru.hachaton_avito.team.deployment.dto;


import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@Table(name = "category_graph")
@Entity(name = "category_graph")
public class CategoryGraphDto {
	@Id
	Long id;
	Long idParent;
}
