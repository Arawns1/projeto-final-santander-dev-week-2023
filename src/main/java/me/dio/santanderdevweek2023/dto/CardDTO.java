package me.dio.santanderdevweek2023.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.dio.santanderdevweek2023.model.CardType;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CardDTO {
    private UUID id;
    private Long number;
    private CardType type;
    private double limit;
}
