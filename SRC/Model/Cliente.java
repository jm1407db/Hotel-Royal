package SRC.Model;

public class Cliente {
    private String nombre;
    private String documentoIdentidad;

    public Cliente(String nombre, String documentoIdentidad) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }
}
