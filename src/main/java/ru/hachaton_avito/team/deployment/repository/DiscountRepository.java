package ru.hachaton_avito.team.deployment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hachaton_avito.team.deployment.dto.DiscountDto;

@Repository
public interface DiscountRepository extends JpaRepository<DiscountDto, Long> {
}
