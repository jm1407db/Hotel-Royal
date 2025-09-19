// Archivo: SRC/Model/Habitacion.java
package SRC.Model;

public class Habitacion {
    private int numero;
    private String tipo;
    private double precio;
    private boolean disponible;

    public Habitacion(int numero, String tipo, double precio, boolean disponible) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
        this.disponible = disponible;
    }
    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String InfoHabitacion() {
        return "Habitacion N°" + numero +
            ", Tipo: " + tipo +
            ", Precio: $" + precio +
            ", Disponible: " + disponible;
    }
}