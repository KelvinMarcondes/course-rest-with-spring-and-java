package com.marcondes.courserestjava.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data @AllArgsConstructor @NoArgsConstructor
@Entity @Table(name = "person")
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_Name")
    private String lastName;

    @Column
    private String address;

    @Column
    private String gender;

}
