package com.example;

public class Ejercicio8 {
    public static void ejercicio8() {
        System.out.println("Ejercicio 8");
        int miVariable = 10; // Válida porque comienza con una letra y usa camelCase.
        int _contador = 20; // Válida porque comienza con un guion bajo.
        double $precio = 15.99; // Válida porque comienza con un signo de dólar.
        String variable123 = "Hola"; // Válida porque contiene letras y números, pero no comienza con un número.
        
        // Nombres inválidos:
        // int 123variable = 20; - Inválido porque comienza con un número.
        // String mi-variable = "Hola"; - Inválido porque contiene un guion, solo se permiten guiones bajos.
        // String class = "Hola"; - Inválido porque es una palabra reservada en Java.
        // int public = 23; - Inválido porque es una palabra reservada en Java.

        System.out.println(miVariable);
        System.out.println(_contador);
        System.out.println($precio);
        System.out.println(variable123);

    }
}
