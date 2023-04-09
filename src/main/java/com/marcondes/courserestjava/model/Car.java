package com.marcondes.courserestjava.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;


@Data
@Entity @Table(name = "car")
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String placa;

    @Column
    private String modelo;

    @Column
    private String fabricante;

    @Column
    private String cor;

    @Column
    private Integer ano;
}
