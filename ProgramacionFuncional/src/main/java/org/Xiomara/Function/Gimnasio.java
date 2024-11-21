package org.Xiomara.Function;

import javax.swing.*;
import java.util.function.Function;

public class Gimnasio {
    public static void main(String[] args) {

        Function<Double, String> clasificarMembresia = horas -> {
            if (horas >= 1000) {
                return "Platinum";
            } else if (horas >= 500) {
                return "Gold";
            } else if (horas >= 200) {
                return "Silver";
            } else if (horas >= 50) {
                return "Bronze";
            } else {
                return "Starter";
            }
        };
        String input = JOptionPane.showInputDialog("Ingrese el tiempo total de entrenamiento (en horas):");
        double horasEntrenamiento = Double.parseDouble(input);
        String nivelMembresia = clasificarMembresia.apply(horasEntrenamiento);
        JOptionPane.showMessageDialog(null, "El nivel de membresía del usuario es: " + nivelMembresia);
    }
}
