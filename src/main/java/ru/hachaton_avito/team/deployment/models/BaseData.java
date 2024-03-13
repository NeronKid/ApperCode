package ru.hachaton_avito.team.deployment.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.hachaton_avito.team.deployment.dto.CategoryDto;
import ru.hachaton_avito.team.deployment.dto.LocationDto;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseData {
    CategoryDto category;
    LocationDto location;
    List<User> userAndPrice;
    Long price;
}
