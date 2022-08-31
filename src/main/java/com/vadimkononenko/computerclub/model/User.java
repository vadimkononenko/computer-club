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
@Table(name = "tbl_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private Integer age;

    @NotBlank
    private String location;

    @NotBlank
    @Column(name = "play_time")
    private String playTime;

    @JoinColumn(name = "balance_id")
    @OneToOne
    private Balance balance;

}
