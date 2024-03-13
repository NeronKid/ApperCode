package ru.hachaton_avito.team.deployment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.hachaton_avito.team.deployment.dto.CategoryDto;
import ru.hachaton_avito.team.deployment.dto.DiscountDto;
import ru.hachaton_avito.team.deployment.dto.UserDto;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserDto, Long> {
}