package com.company;

public class Inicio {

    public static void main(String[] args) {
        //1. Numericos
    	//1.1 Enteros
    	byte numeroByte = 10;
        short numeroShort = 100;
        int numeroInt = 1000;
        long numeroLong = 1000000L;
        //1.2 Decimales
        float numeroFloat = 3.14f;
        double numeroDouble = 3.14159;
        //2 Booleanos
        boolean esVerdadero = true;
        boolean esFalso = false;
        //3 Texto
        char caracter = 'A';
        String texto = "Hola, mundo!";
        
        System.out.println("*** Estos son numericos enteros ***");
        System.out.println("Valor de byte: " + numeroByte);
        System.out.println("Valor de short: " + numeroShort);
        System.out.println("Valor de int: " + numeroInt);
        System.out.println("Valor de long: " + numeroLong);
        System.out.println("");
        System.out.println("*** Estos son numericos decimales ***");
        System.out.println("Valor de float: " + numeroFloat);
        System.out.println("Valor de double: " + numeroDouble);
        System.out.println("");
        System.out.println("*** Estos son boolean ***");
        System.out.println("Valor de boolean: " + esVerdadero);
        System.out.println("Valor de boolean: " + esFalso);
        System.out.println("");
        System.out.println("*** Estos son texto ***");
        System.out.println("Valor de char: " + caracter);
        System.out.println("Valor de String: " + texto);
    }
}
