package org.example.model;


public class CalculadoraModel {

    // 1. Esta es para las operaciónes de Suma
    public double sumar(double a, double b) {
        return a + b;
    }

    // 2. Operación para la Resta
    public double restar(double a, double b) {
        return a - b;
    }

    // 3. Operación para la Multiplicación
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // 4. Este es para la División y tam incluye validación de cero
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return a / b;
    }

    // 5.Esta es para operación es para la Raíz Cuadrada y tambien incluye validación de números negativos
    public double raizCuadrada(double numero) {
        if (numero < 0) {
            throw new ArithmeticException("No existe raíz cuadrada real para números negativos.");
        }
        return Math.sqrt(numero);
    }

    // 6. Operación para Factorial
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos.");
        }
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}