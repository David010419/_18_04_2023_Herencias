package com.hedima.presentacion;

import com.hedima.modelo.Producto;
import com.hedima.modelo.ProductoPerecedero;

import java.time.LocalDate;

public class MainProducto {
    public static void main(String[] args) {

        Producto p1 = new Producto("Tableta de chocolate",33, 1.96);
        System.out.println(p1.Informacion());
        ProductoPerecedero pP1 = new ProductoPerecedero();
        pP1.setNombre("Lechuga");
        pP1.setCantidad(40);
        pP1.setPvp(0.97);
        pP1.setFechaCaducidad(LocalDate.of(2023,04,22));
        System.out.println(pP1.Informacion());

    }
}
