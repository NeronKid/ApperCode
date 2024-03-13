package ru.hachaton_avito.team.deployment.dto;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class PriceDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Long idUser;
    Long idLocation;
    Long idCategory;
    Long price;
}
