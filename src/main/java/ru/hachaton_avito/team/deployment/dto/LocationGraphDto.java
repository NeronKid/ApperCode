package ru.hachaton_avito.team.deployment.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LocationGraphDto {
    private Long id;

    private Long parentId; // может быть null
}