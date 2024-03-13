package ru.hachaton_avito.team.deployment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.hachaton_avito.team.deployment.dto.CategoryDto;
import ru.hachaton_avito.team.deployment.dto.PriceDto;

import java.util.List;

@Repository
public interface PriceRepository extends JpaRepository<PriceDto, Long> {

    @Query("SELECT value FROM PriceDto value WHERE value.idLocation = :locationId AND value.idCategory = :categoryId")
    List<PriceDto> findByLocationIdAndCategoryId(@Param("locationId") Long locationId, @Param("categoryId") Long categoryId);
}
