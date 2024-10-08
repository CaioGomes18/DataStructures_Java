package com.DataStructures.h_equals_HashCode;

import java.util.Objects;

public class Car {

    private String brand;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(brand);
    }

    public Car(String brand) {
        this.brand = brand;
    }
}
