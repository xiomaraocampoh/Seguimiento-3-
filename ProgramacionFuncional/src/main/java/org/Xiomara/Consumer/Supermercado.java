package org.Xiomara.Consumer;

import javax.swing.*;
import java.util.function.Consumer;

public class Supermercado {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto:"));

        ProductoSupermercado producto = new ProductoSupermercado(nombre, precio);

        Consumer<ProductoSupermercado> mostrarDetalles = p -> JOptionPane.showMessageDialog(null, p.toString());
        mostrarDetalles.accept(producto);
    }
}
