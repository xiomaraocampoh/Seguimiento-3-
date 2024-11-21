package org.Xiomara.BiFunction;

import javax.swing.*;
import java.util.function.BiFunction;

public class SalonDeFiestas {public static void main(String[] args) {

    BiFunction<Double, String, Double> calcularCostoAlquiler = (area, opcionesSeleccionadas) -> {
        double costoBasePorMetroCuadrado = 200; // Precio base por metro cuadrado
        double costoTotal = costoBasePorMetroCuadrado * area;

        if (opcionesSeleccionadas.contains("Catering")) {
            costoTotal += 10000; // Costo adicional por catering
        }
        if (opcionesSeleccionadas.contains("Música en vivo")) {
            costoTotal += 15000; // Costo adicional por música en vivo
        }
        if (opcionesSeleccionadas.contains("Decoración especial")) {
            costoTotal += 8000; // Costo adicional por decoración especial
        }
        return costoTotal;
    };

    String inputLargo = JOptionPane.showInputDialog("Ingrese el largo del salón en metros:");
    double largo = Double.parseDouble(inputLargo);

    String inputAncho = JOptionPane.showInputDialog("Ingrese el ancho del salón en metros:");
    double ancho = Double.parseDouble(inputAncho);

    double area = largo * ancho;

    String opciones = JOptionPane.showInputDialog(
            "Seleccione las opciones adicionales para el evento (separadas por comas):\n" +
                    "- Catering\n" +
                    "- Música en vivo\n" +
                    "- Decoración especial\n" +
                    "Ejemplo: Catering, Música en vivo"
    );

    double costoTotal = calcularCostoAlquiler.apply(area, opciones);

    JOptionPane.showMessageDialog(null, "El costo total del alquiler es: $" + costoTotal);
    }
}
