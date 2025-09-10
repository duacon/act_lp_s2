package com.example;

import java.util.Scanner;

public class Ejercicio6 {
    public static void ejercicio6() {
        System.out.println("Ejercicio 6");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        String nombreDelUsuario = scanner.nextLine();
        
        System.out.println("Ingrese su edad");
        int edadDelUsuario = scanner.nextInt();

        System.out.println("Ingrese su altura");
        double alturaDelUsuario = scanner.nextDouble();

        System.out.println(nombreDelUsuario);
        System.out.println(edadDelUsuario);
        System.out.println(alturaDelUsuario);
    }
}