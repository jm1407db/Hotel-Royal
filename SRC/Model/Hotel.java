// Archivo: SRC/Model/Hotel.java
package SRC.Model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nombre;
    private List<Habitacion> habitaciones;
    private List<Reserva> reservas;

    public Hotel(String nombre) {
        this.nombre = nombre;
        this.habitaciones = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void cargarHabitacionesDesdeCSV(String rutaArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea=br.readLine())!=null) {
                String[] datos = linea.split(",");
                int numero = Integer.parseInt(datos[0]);
                String tipo = datos[1];
                double precio = Double.parseDouble(datos[2]);
                boolean disponible = Boolean.parseBoolean(datos[3]);
                habitaciones.add(new Habitacion(numero, tipo, precio, disponible));
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de habitaciones: " + e.getMessage());
        }
    }
    public void listarHabitacionesDisponibles() {
        System.out.println("--- Habitaciones Disponibles ---");
        boolean hayDisponibles = false;
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.isDisponible()) {
                System.out.println(habitacion.InfoHabitacion());
                hayDisponibles = true;
            }
        }
        if (!hayDisponibles) {
            System.out.println("No hay habitaciones disponibles en este momento.");
        }
    }
    public void crearReserva(Cliente cliente, int numeroHabitacion, int diasEstadia) {
    Habitacion habitacionEncontrada = null;
    for (Habitacion habitacion : habitaciones) {
        if (habitacion.getNumero() == numeroHabitacion && habitacion.isDisponible()) {
            habitacionEncontrada = habitacion;
            break;
        }
    }
    if (habitacionEncontrada != null) {
        habitacionEncontrada.setDisponible(false);
        Reserva nuevaReserva = new Reserva(cliente, habitacionEncontrada, diasEstadia);
        reservas.add(nuevaReserva);
        System.out.println("Reserva creada");
        nuevaReserva.mostrarDetalles();
    } else {
        System.out.println("Lo sentimos, la habitación " + numeroHabitacion + " no está disponible o no existe.");
    }
}
}
