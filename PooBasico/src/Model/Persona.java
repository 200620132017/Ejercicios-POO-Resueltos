package Model;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String sNombre;
    private String sApellido;
    private String sDni;
    //Una persona puede contener libros
    private List<Libro> listaLibros;

    public Persona(String sNombre, String sApellido, String sDni) {
        this.sNombre = sNombre;
        this.sApellido = sApellido;
        this.sDni = sDni;
        this.listaLibros = new ArrayList<>();
    }

    public String getsNombre() {
        return sNombre;
    }

    public String getsApellido() {
        return sApellido;
    }

    public String getsDni() {
        return sDni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "sDni='" + sDni + '\'' +
                ", sApellido='" + sApellido + '\'' +
                ", sNombre='" + sNombre + '\'' +
                '}';
    }
}
