package org.example.Controller;

import org.example.model.Calculadora;
import org.example.view.CalculadoraView;

public class CalculadoraControlador {

    private final Calculadora modelo;
    private final CalculadoraView vista;

    public CalculadoraControlador(Calculadora modelo, CalculadoraView vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        boolean continuar = true;

        while (continuar) {
            vista.mostrarMenu();
            int opcion = vista.leerOpcion();

            switch (opcion) {
                case 1 -> ejecutarSuma();
                case 2 -> ejecutarResta();
                case 3 -> ejecutarMultiplicacion();
                case 4 -> ejecutarDivision();
                case 5 -> ejecutarRaizCuadrada();
                case 6 -> ejecutarFactorial();
                case 7 -> {
                    continuar = false;
                    vista.mostrarMensajeDespedida();
                }
                default -> vista.mostrarError("Opción no válida. Intente nuevamente.");
            }
        }
    }

    private void ejecutarSuma() {
        double a = vista.pedirNumero("Ingrese el primer número: ");
        double b = vista.pedirNumero("Ingrese el segundo número: ");
        vista.mostrarResultado("Suma", modelo.sumar(a, b));
    }

    private void ejecutarResta() {
        double a = vista.pedirNumero("Ingrese el primer número: ");
        double b = vista.pedirNumero("Ingrese el segundo número: ");
        vista.mostrarResultado("Resta", modelo.restar(a, b));
    }

    private void ejecutarMultiplicacion() {
        double a = vista.pedirNumero("Ingrese el primer número: ");
        double b = vista.pedirNumero("Ingrese el segundo número: ");
        vista.mostrarResultado("Multiplicación", modelo.multiplicar(a, b));
    }

    private void ejecutarDivision() {
        double a = vista.pedirNumero("Ingrese el dividendo: ");
        double b = vista.pedirNumero("Ingrese el divisor: ");
        try {
            vista.mostrarResultado("División", modelo.dividir(a, b));
        } catch (ArithmeticException e) {
            vista.mostrarError(e.getMessage());
        }
    }

    private void ejecutarRaizCuadrada() {
        double num = vista.pedirNumero("Ingrese el número: ");
        try {
            vista.mostrarResultado("Raíz Cuadrada", modelo.raizCuadrada(num));
        } catch (IllegalArgumentException e) {
            vista.mostrarError(e.getMessage());
        }
    }

    private void ejecutarFactorial() {
        int n = vista.pedirEntero("Ingrese un entero no negativo: ");
        try {
            long res = modelo.factorial(n);
            vista.mostrarResultadoFactorial(n, res);
        } catch (IllegalArgumentException e) {
            vista.mostrarError(e.getMessage());
        }
    }
}