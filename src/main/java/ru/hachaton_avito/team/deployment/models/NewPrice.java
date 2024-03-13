package ru.hachaton_avito.team.deployment.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "create_product")
public class NewPrice {
    Long idLocation;
    Long idCategory;
    Long price;
}