package com.hedima.modelo;

public class Figura {

//    Atributos
    private int x;

    private int y;

//    Constructor


    public Figura() {
    }

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Metodos

    public String mostrarPosicion() {
        return x+","+y;
    }


    //Setters y getters


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
