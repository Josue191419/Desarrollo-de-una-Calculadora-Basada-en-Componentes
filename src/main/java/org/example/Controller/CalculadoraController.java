package org.example.Controller;

import org.example.model.CalculadoraModel;
import org.example.view.CalculadoraView;

/**
 * CONTROLADOR (Controller)
 * Responsabilidad: Unir el Modelo con la Vista.
 * Recibe las peticiones, llama a las funciones matemáticas y envía la salida a la Vista.
 */
public class CalculadoraController {

    private final CalculadoraModel modelo;
    private final CalculadoraView vista;

    // Recibimos las instancias del Modelo y la Vista en el constructor
    public CalculadoraController(CalculadoraModel modelo, CalculadoraView vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutarSuma(double a, double b) {
        double resultado = modelo.sumar(a, b);
        vista.mostrarResultado(a + " + " + b, String.valueOf(resultado));
    }

    public void ejecutarResta(double a, double b) {
        double resultado = modelo.restar(a, b);
        vista.mostrarResultado(a + " - " + b, String.valueOf(resultado));
    }

    public void ejecutarMultiplicacion(double a, double b) {
        double resultado = modelo.multiplicar(a, b);
        vista.mostrarResultado(a + " * " + b, String.valueOf(resultado));
    }

    public void ejecutarDivision(double a, double b) {
        try {
            double resultado = modelo.dividir(a, b);
            vista.mostrarResultado(a + " / " + b, String.valueOf(resultado));
        } catch (ArithmeticException e) {
            vista.mostrarError("División por " + b, e.getMessage());
        }
    }

    public void ejecutarRaizCuadrada(double numero) {
        try {
            double resultado = modelo.raizCuadrada(numero);
            vista.mostrarResultado("√" + numero, String.valueOf(resultado));
        } catch (ArithmeticException e) {
            vista.mostrarError("Raíz de " + numero, e.getMessage());
        }
    }

    public void ejecutarFactorial(int n) {
        try {
            long resultado = modelo.factorial(n);
            vista.mostrarResultado(n + "!", String.valueOf(resultado));
        } catch (IllegalArgumentException e) {
            vista.mostrarError("Factorial de " + n, e.getMessage());
        }
    }
}