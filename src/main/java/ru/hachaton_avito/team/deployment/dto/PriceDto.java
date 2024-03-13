package ru.hachaton_avito.team.deployment.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "price_table")
public class PriceDto {
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Long idUser;
    Long idLocation;
    Long idCategory;
    Long price;
}
