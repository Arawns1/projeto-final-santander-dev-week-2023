package me.dio.santanderdevweek2023.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name = "tb_client")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString(includeFieldNames=true)
public class Client {
    @Id
    @Column(name = "cli_tx_cpf")
    private String cpf;
    @Column(name = "cli_tx_name")
    private String name;

    @Column(name = "cli_tx_complement")
    private String complement;

    @Column(name = "cli_tx_number")
    private String number;

    @ManyToOne(cascade=CascadeType.ALL)
    private Address address;
}