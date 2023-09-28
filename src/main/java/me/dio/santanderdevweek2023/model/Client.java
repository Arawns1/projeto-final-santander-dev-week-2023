package me.dio.santanderdevweek2023.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "tb_client")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Client {
    @Id
    @Column(name = "cli_tx_cpf")
    private String cpf;
    @Column(name = "cli_tx_name")
    private String name;

    @Column(name = "cli_dt_birthdate")
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date birthdate;

    @Column(name = "cli_tx_complement")
    private String complement;

    @Column(name = "cli_tx_number")
    private String number;

    @ManyToOne(cascade=CascadeType.ALL)
    private Address address;
}