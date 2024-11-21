package org.Xiomara.Consumer;

import javax.swing.*;
import java.util.function.Consumer;

public class Restaurante {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        String platillo = JOptionPane.showInputDialog("Ingrese el platillo que desea ordenar:");
        double totalPagar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el total a pagar"));

        ClienteRestaurante cliente = new ClienteRestaurante(nombre, platillo, totalPagar);

        Consumer<ClienteRestaurante> aplicarDescuento = c -> {
            if ("pizza".equalsIgnoreCase(c.getPlatillo())) {
                c.aplicarDescuento(10); // 10% de descuento para pizza
            } else if ("pasta".equalsIgnoreCase(c.getPlatillo())) {
                c.aplicarDescuento(15); // 15% de descuento para pasta
            } else {
                c.aplicarDescuento(5); // 5% de descuento para otros platillos
            }
            JOptionPane.showMessageDialog(null, c.toString());
        };

        aplicarDescuento.accept(cliente);
    }
}
