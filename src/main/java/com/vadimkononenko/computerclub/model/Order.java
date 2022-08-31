package com.vadimkononenko.computerclub.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "tbl_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String product;

    @NotBlank
    private Double price;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
