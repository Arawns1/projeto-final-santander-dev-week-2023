package me.dio.santanderdevweek2023.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ClientDTO {
    private String cpf;
    private String name;
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date birthdate;
    private AddressDTO addressDTO;
}
