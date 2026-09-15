package org.example.view;

/**
 * VISTA (View)
 * Responsabilidad: Mostrar los datos e información al usuario en la consola.
 */
public class CalculadoraView {

    // Muestra un resultado exitoso de forma clara
    public void mostrarResultado(String nombreOperacion, String resultado) {
        System.out.println("[RESULTADO] " + nombreOperacion + " = " + resultado);
    }

    // Muestra un mensaje de error cuando una validación falla
    public void mostrarError(String nombreOperacion, String mensajeError) {
        System.out.println("[ERROR] " + nombreOperacion + " -> " + mensajeError);
    }
}