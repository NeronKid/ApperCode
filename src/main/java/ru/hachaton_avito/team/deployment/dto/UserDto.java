package ru.hachaton_avito.team.deployment.dto;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "user_table")
@Table(name = "user_table")
public class UserDto {

    @Id
    Long id;
    String name;
}
