package ru.hachaton_avito.team.deployment.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ru.hachaton_avito.team.deployment.dto.CategoryDto;
import ru.hachaton_avito.team.deployment.dto.LocationDto;

import java.util.List;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "base_data")
public class BaseData {
    CategoryDto category;
    LocationDto location;
    List<User> userAndPrice;
    Long price;
}
