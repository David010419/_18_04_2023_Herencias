package com.hedima.modelo;

public class Producto {
    //Atributos
    private String nombre;
    private int cantidad;
    private double pvp;

    //Metodos
    public String Informacion() {
        return " Nombre " + nombre + " Cantidad " + cantidad + " PVP  " + pvp;
    }
    //Constructores


    public Producto() {
    }

    public Producto(String nombre, int cantidad, double pvp) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.pvp = pvp;
    }
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }
}
