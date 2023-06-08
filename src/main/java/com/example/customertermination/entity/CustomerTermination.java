package com.example.customertermination.entity;

import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;

@Entity
@Table(name = "customer_termination")
public class CustomerTermination {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
}
