package org.example.view;

import org.example.Controller.CalculadoraControlador;
import org.example.model.Calculadora;

public class Main {

    public static void main(String[] args) {
        // Instanciación de componentes
        Calculadora modelo = new Calculadora();
        CalculadoraView vista = new CalculadoraView();

        // Inyección de dependencias en el controlador
        CalculadoraControlador controlador = new CalculadoraControlador(modelo, vista);

        // Inicio de la aplicación
        controlador.iniciar();
    }
}