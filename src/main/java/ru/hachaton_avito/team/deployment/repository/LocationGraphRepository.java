package ru.hachaton_avito.team.deployment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hachaton_avito.team.deployment.dto.CategoryGraphDto;
import ru.hachaton_avito.team.deployment.dto.LocationGraphDto;

@Repository
public interface LocationGraphRepository extends JpaRepository<LocationGraphDto, Long> {}
