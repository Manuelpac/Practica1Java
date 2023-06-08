package com.company;

public class Iva {
    public static void main(String[] args) {
        double precioSinIVA = 100.0;
        double precioConIVA = calcularPrecioConIVA(precioSinIVA);
        System.out.println("Precio con IVA: " + precioConIVA);
    }
    
    public static double calcularPrecioConIVA(double precioSinIVA) {
        double iva = 0.16; // Supongamos que el IVA es del 16%
        double precioConIVA = precioSinIVA * (1 + iva);
        return precioConIVA;
    }
}
