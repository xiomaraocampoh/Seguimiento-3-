package org.Xiomara.Biconsumer;

import java.util.function.BiConsumer;

public class ServicioPintura {
    public static void main(String[] args) {

        double precioPorMetroCuadrado = 7500.0;
        double area = 20.0;

        BiConsumer<Double, Double> calcularCosto = (precio, areaTotal) -> {
            double costo = precio * areaTotal;
            System.out.println("El costo total del servicio de pintura es: $" + costo);
        };
        calcularCosto.accept(precioPorMetroCuadrado, area);
    }
}
