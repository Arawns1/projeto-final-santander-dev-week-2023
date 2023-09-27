package me.dio.santanderdevweek2023.repository;

import me.dio.santanderdevweek2023.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
}
