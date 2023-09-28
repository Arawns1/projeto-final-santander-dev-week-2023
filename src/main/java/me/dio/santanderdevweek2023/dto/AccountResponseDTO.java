package me.dio.santanderdevweek2023.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.dio.santanderdevweek2023.model.Account;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AccountResponseDTO {
    private Account account;
    private CardDTO cardDTO;
}
