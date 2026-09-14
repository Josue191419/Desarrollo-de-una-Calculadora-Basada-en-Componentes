package org.example.view;

import java.util.Scanner;

public class CalculadoraView {

    private final Scanner scanner;

    public CalculadoraView() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("\n--- CALCULADORA MODULAR---");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Raíz Cuadrada");
        System.out.println("6. Factorial");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public int leerOpcion() {
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada inválida. Ingrese un número de opción válido: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public double pedirNumero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextDouble()) {
            System.out.print("Entrada inválida. Ingrese un número válido: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public int pedirEntero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada inválida. Ingrese un entero válido: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public void mostrarResultado(String operacion, double resultado) {
        System.out.printf("Resultado de la %s: %.4f\n", operacion, resultado);
    }

    public void mostrarResultadoFactorial(int n, long resultado) {
        System.out.printf("Resultado de %d! = %d\n", n, resultado);
    }

    public void mostrarError(String mensaje) {
        System.out.println("⚠️ " + mensaje);
    }

    public void mostrarMensajeDespedida() {
        System.out.println("¡Gracias por utilizar la calculadora!");
    }
}