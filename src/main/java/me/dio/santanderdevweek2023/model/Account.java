package me.dio.santanderdevweek2023.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "tb_account")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString(includeFieldNames = true)
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "acc_cd_id")
    private UUID id;

    @Column(name = "acc_num_numberAccount")
    private String number;

    @Column(name = "acc_num_agency")
    private int agency;

    @Column(name = "acc_num_balance")
    private double balance;

    @Column(name = "acc_num_limit")
    private double limit;

    //FIXME: "relação card-account incorreta. A conta tem vários cartões. Mas um cartão só pertence a uma conta"
    @OneToMany(mappedBy = "account")
    private Set<Card> cards;

    @OneToOne
    private Client client;

    @OneToMany
    private Set<PaymentMethod> paymentMethod;

}
