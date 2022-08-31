package com.vadimkononenko.computerclub.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "tbl_balance")
public class Balance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "total_balance")
    private Double totalBalance = 0D;

    @Column(name = "total_time")
    private Double totalTime = 0D;

    @Column
    private Double discount;

    @Column(name = "current_balance")
    private Double currentBalance = 0D;

    @CreationTimestamp
    @Column(name = "created_at")
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false, updatable = false)
    private Date updatedAt;

}
