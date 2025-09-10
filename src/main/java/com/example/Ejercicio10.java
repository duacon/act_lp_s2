package com.example;

import java.util.Scanner;

public class Ejercicio10 {
    public static void ejercicio10() {
        System.out.println("Ejercicio 10");
        final double PRECIO_PRODUCTO = 15.99;
        final int IVA_PORCENTAJE = 16;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cantidad de productos");
        int cantidadDeProductos = scanner.nextInt();

        scanner.nextLine(); // Esto limpia el buffer (espacio de memoria temporal)

        System.out.println("Ingrese su nombre");
        String nombreDelCliente = scanner.nextLine();

        double calculoSubtotal = PRECIO_PRODUCTO * cantidadDeProductos;
        double calculoIVA = calculoSubtotal * IVA_PORCENTAJE / 100;
        double montoTotal = calculoSubtotal + calculoIVA;

        System.out.println("Nombre del cliente: " + nombreDelCliente);
        System.out.println("Precio del producto: " + PRECIO_PRODUCTO);
        System.out.println("Cantidad de productos: " + cantidadDeProductos);
        System.out.println("Porcentaje IVA: " + IVA_PORCENTAJE + "%");
        System.out.println("Monto total: " + montoTotal);
        scanner.close();
    }
}
