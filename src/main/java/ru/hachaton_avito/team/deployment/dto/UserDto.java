package ru.hachaton_avito.team.deployment.dto;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class UserDto {

    @Id
    Long id;
    String name;
}
