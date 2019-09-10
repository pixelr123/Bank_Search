package com.pixx.bank.Model;

import lombok.*;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Branches{
    @Id
    private String ifsc;

    @OneToOne
    @JoinColumn(name = "bank_id")
    private Banks bank;
    private String branch;
    private String address;
    private String city;
    private String district;
    private String state;
}