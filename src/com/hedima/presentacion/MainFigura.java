package com.hedima.presentacion;

import com.hedima.modelo.Cuadrado;
import com.hedima.modelo.Figura;
import com.hedima.modelo.Triangulo;


public class MainFigura {
    public static void main(String[] args) {

        Figura f1 = new Figura ();

        f1.setX(5);
        f1.setY(10);
        System.out.println("La posición de la figura es" + f1.mostrarPosicion());

        Triangulo t1 = new Triangulo();

        t1.setAltura(5.5);
        t1.setBase(4.4);
        System.out.println("El area del triangulo es: " +t1.calcularArea());

        Cuadrado c1 = new Cuadrado();

        c1.setLado(2.5);
        System.out.println("El Area del cuadrado es: " +c1.calcularArea());




    }
}
