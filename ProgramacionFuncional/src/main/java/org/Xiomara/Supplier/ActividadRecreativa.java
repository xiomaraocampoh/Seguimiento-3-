package org.Xiomara.Supplier;

import javax.swing.*;
import java.time.LocalTime;
import java.util.function.Supplier;

public class ActividadRecreativa {
    public static void main(String[] args) {
        Supplier<String> sugerirActividad = () -> {
            LocalTime horaActual = LocalTime.now();
            if (horaActual.isBefore(LocalTime.NOON)) {
                return "Actividad recomendada: Salida a correr por el parque";
            } else if (horaActual.isBefore(LocalTime.of(18, 0))) {
                return "Actividad recomendada: Visita al museo local";
            } else {
                return "Actividad recomendada: Ver una película en casa con palomitas";
            }
        };
        String actividadSugerida = sugerirActividad.get();
        JOptionPane.showMessageDialog(null, "Sugerencia de actividad: " + actividadSugerida);
    }
    }
