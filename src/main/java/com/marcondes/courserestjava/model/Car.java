package com.marcondes.courserestjava.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity @Table(name = "car")
public class Car {

    @Id
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
