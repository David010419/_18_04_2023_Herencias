package com.hedima.modelo;

import java.time.LocalDate;

public class ProductoPerecedero extends Producto{

    //Atributos

    private LocalDate fechaCaducidad;

    //Metodos


    @Override
    public String Informacion() {
        return super.Informacion() + " Caducidad " + fechaCaducidad;
    }

    public ProductoPerecedero() {
    }

    public ProductoPerecedero(String nombre, int cantidad, double pvp, LocalDate fechaCaducidad) {
        super(nombre, cantidad, pvp);
        this.fechaCaducidad = fechaCaducidad;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}
