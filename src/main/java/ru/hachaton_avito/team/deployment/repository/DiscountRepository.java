package ru.hachaton_avito.team.deployment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.hachaton_avito.team.deployment.dto.DiscountDto;

import java.util.List;

@Repository
public interface DiscountRepository extends JpaRepository<DiscountDto, Long> {
    @Query("SELECT value FROM DiscountDto value WHERE value.idUser = :userId")
    List<DiscountDto> findByIdUser(@Param("userId") Long userId);
}