package ru.hachaton_avito.team.deployment.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewPrice {
    Long idLocation;
    Long idCategory;
    Long price;
    Long isUser;
}