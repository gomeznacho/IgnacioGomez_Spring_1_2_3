package com.example.ejercicio3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coche {

    //atributos encapsulados
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer year;
    private String model;
    private  String brand;

    //constructores
    public Coche() {
    }

    public Coche(Long id, Integer year, String model, String brand) {
        this.id = id;
        this.year = year;
        this.model = model;
        this.brand = brand;
    }
    //geter y setter


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //toString

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", year=" + year +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
