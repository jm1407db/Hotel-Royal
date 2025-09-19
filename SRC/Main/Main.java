// Archivo: SRC/Main.java
package SRC.Main;

import SRC.Model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel miHotel = new Hotel("Hotel Royal");
        miHotel.cargarHabitacionesDesdeCSV("Habitaciones.txt");

        int opcion = 0;
        while (opcion != 3) {
            System.out.println("\n--- Menú Hotel " + miHotel.getNombre() + " ---");
            System.out.println("1. Listar habitaciones disponibles");
            System.out.println("2. Crear una reserva");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    miHotel.listarHabitacionesDisponibles();
                    break;
                case 2:
                    System.out.println("\n--- Crear Nueva Reserva ---");
                    System.out.print("Ingrese su nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese su documento de identidad: ");
                    String doc = scanner.nextLine();
                    Cliente cliente = new Cliente(nombre, doc);
                    System.out.print("Ingrese el número de la habitación que desea reservar: ");
                    int numHabitacion = scanner.nextInt();
                    System.out.print("Ingrese la cantidad de días de estadía: ");
                    int dias = scanner.nextInt();
                    scanner.nextLine(); 

                    miHotel.crearReserva(cliente, numHabitacion, dias);
                    break;
                case 3:
                    System.out.println("Gracias Vuelva pronto");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
        scanner.close();
    }
}