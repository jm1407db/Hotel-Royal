package SRC.Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reserva {
    private Cliente cliente;
    private Habitacion habitacion;
    private LocalDateTime fechaEntrada;
    private LocalDateTime fechaSalida;

    public Reserva(Cliente cliente, Habitacion habitacion, int diasEstadia) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaEntrada = LocalDateTime.now();
        this.fechaSalida = this.fechaEntrada.plusDays(diasEstadia);
    }
    public Cliente getCliente() {
        return cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }
    public void mostrarDetalles() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("Reserva a nombre de: " + cliente.getNombre() +
            ", Habitación N°: " + habitacion.getNumero() +
            ", Desde: " + fechaEntrada.format(formatter) +
            ", Hasta: " + fechaSalida.format(formatter));
    }
}