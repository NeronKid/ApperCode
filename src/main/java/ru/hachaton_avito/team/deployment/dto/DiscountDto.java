package ru.hachaton_avito.team.deployment.dto;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@Table
@Entity
public class DiscountDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Long idUser;
    Integer discount;
}
