package me.dio.santanderdevweek2023.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tb_payment_method")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString(includeFieldNames=true)
public class PaymentMethod {

    @Id
    @Column(name = "pm_cd_id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "pm_tx_icon", nullable = false)
    private String icon;
    @Column(name = "pm_tx_description", nullable = false)
    private String description;

}