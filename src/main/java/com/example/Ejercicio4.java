package com.example;

public class Ejercicio4 {
    public static void ejercicio4() {
        System.out.println("Ejercicio 4");
        //Declaracion de constantes
        final double PI = 3.14159;
        final int DIAS_SEMANA = 7;
        final String NOMBRE_UNIVERSIDAD = "CESDE";
        //Calculo del area de un radio de 5
        double radio = 5;
        double resultadoDelCalculo = PI * radio * radio;
        //Impresion de las constantes y el resultado del calculo
        System.out.println(PI);
        System.out.println(DIAS_SEMANA);
        System.out.println(NOMBRE_UNIVERSIDAD);
        System.out.println(resultadoDelCalculo);
    }
}
