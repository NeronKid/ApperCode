package ru.hachaton_avito.team.deployment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hachaton_avito.team.deployment.dto.CategoryDto;
import ru.hachaton_avito.team.deployment.dto.CategoryGraphDto;

@Repository
public interface CategoryGraphRepository extends JpaRepository<CategoryGraphDto, Long> {}
