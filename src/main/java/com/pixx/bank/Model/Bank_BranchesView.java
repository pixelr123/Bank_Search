package com.pixx.bank.Model;

import lombok.*;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;

@Entity
@Table(name = "bank_branches")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Immutable
public class Bank_BranchesView {
    @Id
    private String ifsc;

    @JoinTable
    private String bank_name;

    @ManyToOne
    @JoinColumn
    private Banks bank;
    private String branch;
    private String address;
    private String city;
    private String district;
    private String state;
}
