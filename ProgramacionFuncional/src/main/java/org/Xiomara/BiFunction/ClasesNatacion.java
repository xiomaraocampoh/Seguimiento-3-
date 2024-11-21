package org.Xiomara.BiFunction;

import javax.swing.*;
import java.util.function.BiFunction;

public class ClasesNatacion {
    public static void main(String[] args) {

        BiFunction<Integer, Double, Double> calcularCostoClase = (edad, horas) -> {
            double tarifaBase = 10000; // Tarifa base por hora
            if (edad < 10) { // Descuento para niños menores de 10 años
                tarifaBase *= 0.8; // 20% de descuento
            } else if (edad > 60) { // Descuento para adultos mayores
                tarifaBase *= 0.85; // 15% de descuento
            }
            return tarifaBase * horas; // Costo total según las horas
        };

        String inputEdad = JOptionPane.showInputDialog("Ingrese la edad del estudiante:");
        int edad = Integer.parseInt(inputEdad);

        String inputHoras = JOptionPane.showInputDialog("Ingrese la duración de las clases (en horas):");
        double horas = Double.parseDouble(inputHoras);

        double costoTotal = calcularCostoClase.apply(edad, horas);

        JOptionPane.showMessageDialog(null, "El costo total de las clases de natación es: $" + costoTotal);
    }
}
