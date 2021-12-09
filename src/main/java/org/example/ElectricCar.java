package org.example;

import javax.persistence.*;

@Entity
public class ElectricCar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;
    private String model;
    private int drive_range;
    private double acceleration;
    private int luggage_space;
    private int price;

    public ElectricCar(){
    }

    public ElectricCar(String brand, String model, int drive_range, double acceleration, int luggage_space, int price) {
        this.brand = brand;
        this.model = model;
        this.drive_range = drive_range;
        this.acceleration = acceleration;
        this.luggage_space = luggage_space;
        this.price = price;
    }
    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDrive_range() {
        return drive_range;
    }

    public void setDrive_range(int drive_range) {
        this.drive_range = drive_range;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public int getLuggage_space() {
        return luggage_space;
    }

    public void setLuggage_space(int luggage_space) {
        this.luggage_space = luggage_space;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", drive_range=" + drive_range +
                ", acceleration=" + acceleration +
                ", luggage_space=" + luggage_space +
                ", price=" + price +
                '}';
    }
}