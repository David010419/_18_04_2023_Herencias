package com.hedima.presentacion;

import com.hedima.modelo.Figura;


public class MainFigura {
    public static void main(String[] args) {

        Figura f1 = new Figura (49,59);

        f1.setX(5);
        f1.setY(10);
        System.out.println(f1.mostrarPosicion());




    }
}
