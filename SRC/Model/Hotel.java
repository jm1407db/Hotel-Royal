package SRC.Model;
import java.util.ArrayList;
public class Hotel {
    private String nombre;
    private String direccion;
    private ArrayList<Habitacion> habitaciones;

    public Hotel(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

}
