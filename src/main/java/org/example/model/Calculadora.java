package org.example.model;

public class Calculadora {

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Error: No se puede dividir entre cero.");
        }
        return a / b;
    }

    public double raizCuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Error: No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(numero);
    }

    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Error: El factorial no está definido para números negativos.");
        }
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

}
