package com.DataStructures.i_StackPilha;

import java.util.Objects;

public class Carro {

    private String brand;

    public Carro(String brand) {
        this.brand = brand;
    }

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
        Carro carro = (Carro) o;
        return Objects.equals(brand, carro.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(brand);
    }


}
