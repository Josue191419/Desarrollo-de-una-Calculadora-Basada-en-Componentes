
import org.example.model.CalculadoraModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * CLASE DE PRUEBAS UNITARIAS (JUnit 5)
 * Responsabilidad: Validar de forma automatizada que todas las operaciones
 * del componente CalculadoraModel funcionen de acuerdo a los requerimientos.
 */
public class CalculadoraModelTest {

    private CalculadoraModel modelo;

    // Se ejecuta antes de cada prueba para tener una instancia limpia del modelo
    @BeforeEach
    public void setUp() {
        modelo = new CalculadoraModel();
    }

    // ==========================================
    // PRUEBAS DE OPERACIONES BÁSICAS
    // ==========================================

    @Test
    @DisplayName("Prueba de Suma: 10 + 5 debe ser 15")
    public void testSumar() {
        double resultado = modelo.sumar(10.0, 5.0);
        assertEquals(15.0, resultado, 0.0001, "La suma de 10.0 + 5.0 debe ser 15.0");
    }

    @Test
    @DisplayName("Prueba de Resta: 20 - 8 debe ser 12")
    public void testRestar() {
        double resultado = modelo.restar(20.0, 8.0);
        assertEquals(12.0, resultado, 0.0001, "La resta de 20.0 - 8.0 debe ser 12.0");
    }

    @Test
    @DisplayName("Prueba de Multiplicación: 4 * 3 debe ser 12")
    public void testMultiplicar() {
        double resultado = modelo.multiplicar(4.0, 3.0);
        assertEquals(12.0, resultado, 0.0001, "La multiplicación de 4.0 * 3.0 debe ser 12.0");
    }

    @Test
    @DisplayName("Prueba de División Normal: 50 / 2 debe ser 25")
    public void testDividirValido() {
        double resultado = modelo.dividir(50.0, 2.0);
        assertEquals(25.0, resultado, 0.0001, "La división de 50.0 / 2.0 debe ser 25.0");
    }

    @Test
    @DisplayName("Prueba de División por Cero: debe lanzar ArithmeticException")
    public void testDividirPorCero() {
        // Verifica que al dividir por cero se lance la excepción esperada
        ArithmeticException excepcion = assertThrows(
                ArithmeticException.class,
                () -> modelo.dividir(10.0, 0.0),
                "Dividir entre cero debe lanzar una ArithmeticException"
        );
        assertEquals("No se puede dividir entre cero.", excepcion.getMessage());
    }

    // ==========================================
    // PRUEBAS DE OPERACIONES AVANZADAS
    // ==========================================

    @Test
    @DisplayName("Prueba de Raíz Cuadrada Válida: √81 debe ser 9")
    public void testRaizCuadradaValida() {
        double resultado = modelo.raizCuadrada(81.0);
        assertEquals(9.0, resultado, 0.0001, "La raíz cuadrada de 81.0 debe ser 9.0");
    }

    @Test
    @DisplayName("Prueba de Raíz Cuadrada Negativa: debe lanzar ArithmeticException")
    public void testRaizCuadradaNegativa() {
        ArithmeticException excepcion = assertThrows(
                ArithmeticException.class,
                () -> modelo.raizCuadrada(-9.0),
                "Calcular la raíz de un número negativo debe lanzar una ArithmeticException"
        );
        assertEquals("No existe raíz cuadrada real para números negativos.", excepcion.getMessage());
    }

    @Test
    @DisplayName("Prueba de Factorial: 5! debe ser 120")
    public void testFactorialValido() {
        long resultado = modelo.factorial(5);
        assertEquals(120, resultado, "El factorial de 5 debe ser 120");
    }

    @Test
    @DisplayName("Prueba de Factorial de Cero: 0! debe ser 1")
    public void testFactorialCero() {
        long resultado = modelo.factorial(0);
        assertEquals(1, resultado, "El factorial de 0 debe ser 1");
    }

    @Test
    @DisplayName("Prueba de Factorial Negativo: debe lanzar IllegalArgumentException")
    public void testFactorialNegativo() {
        IllegalArgumentException excepcion = assertThrows(
                IllegalArgumentException.class,
                () -> modelo.factorial(-5),
                "El factorial de un número negativo debe lanzar una IllegalArgumentException"
        );
        assertEquals("El factorial no está definido para números negativos.", excepcion.getMessage());
    }
}