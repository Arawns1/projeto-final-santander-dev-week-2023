package me.dio.santanderdevweek2023.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ClientDTO {
    private String cpf;
    private String name;
    private AddressDTO addressDTO;
}
