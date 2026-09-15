package org.example.view;

import org.example.Controller.CalculadoraController;
import org.example.model.CalculadoraModel;

/**
 * CLASE PRINCIPAL (Consumidor del Componente)
 * Responsabilidad: Iniciar la aplicación e invocar las funciones directamente.
 */
public class Main {

    public static void main(String[] args) {
        // 1. Instanciamos los componentes de la arquitectura
        CalculadoraModel modelo = new CalculadoraModel();
        CalculadoraView vista = new CalculadoraView();
        CalculadoraController controlador = new CalculadoraController(modelo, vista);

        System.out.println("=== PRUEBAS DE LA CALCULADORA MODULAR ===\n");

        // 2. Invocación de Operaciones Básicas
        controlador.ejecutarSuma(10.5, 4.5);
        controlador.ejecutarResta(20.0, 7.5);
        controlador.ejecutarMultiplicacion(5.0, 6.0);
        controlador.ejecutarDivision(50.0, 2.0);

        // 3. Invocación de Operaciones Avanzadas
        controlador.ejecutarRaizCuadrada(64.0);
        controlador.ejecutarFactorial(5);

        System.out.println("\n=== PRUEBAS DE VALIDACIÓN Y CASOS LÍMITE ===");

        // 4. Invocación de casos con error (para validar las excepciones)
        controlador.ejecutarDivision(10.0, 0);       // División entre cero
        controlador.ejecutarRaizCuadrada(-16.0);     // Raíz negativa
        controlador.ejecutarFactorial(-3);           // Factorial negativo
    }
}