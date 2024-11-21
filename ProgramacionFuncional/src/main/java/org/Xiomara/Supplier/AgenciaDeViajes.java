package org.Xiomara.Supplier;

import java.util.Random;
import java.util.function.Supplier;
import javax.swing.*;

public class AgenciaDeViajes {
    public static void main(String[] args) {
        String[] destinos = {"París", "Tokio", "Cancún", "Nueva York", "Sídney"};
        Supplier<String> obtenerDestinoAleatorio = () -> {
            Random random = new Random();
            int index = random.nextInt(destinos.length);
            return destinos[index];
        };
        String destinoSugerido = obtenerDestinoAleatorio.get();
        JOptionPane.showMessageDialog(null, "Destino turístico sugerido: " + destinoSugerido);
    }
}
