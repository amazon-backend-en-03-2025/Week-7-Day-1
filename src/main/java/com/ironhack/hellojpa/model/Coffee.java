package com.ironhack.hellojpa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "coffee")
public class Coffee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String coffeeName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String name) {
        this.coffeeName = name;
    }

    public Coffee(String name) {
        this.coffeeName = name;
    }

    public Coffee() {
    }
}
