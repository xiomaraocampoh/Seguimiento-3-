package org.Xiomara.Consumer;

public class ClienteRestaurante {private String nombre;
    private String platillo;
    private double totalPagar;

    public ClienteRestaurante(String nombre, String platillo, double totalPagar) {
        this.nombre = nombre;
        this.platillo = platillo;
        this.totalPagar = totalPagar;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPlatillo() {
        return platillo;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void aplicarDescuento(double porcentaje) {
        this.totalPagar -= this.totalPagar * (porcentaje / 100);
    }

    @Override
    public String toString() {
        return "ClienteRestaurante{" +
                "nombre='" + nombre + '\'' +
                ", platillo='" + platillo + '\'' +
                ", totalPagar=" + totalPagar +
                '}';
    }
}
