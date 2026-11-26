package modelo;

import java.util.ArrayList;

public class Proyecto {
    //Atributos
    private String nombre;
    private ArrayList<Desarrollador> desarrolladores;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        desarrolladores = new ArrayList<>();
    }

    //Setters y getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodos
    public void agregarDesarrollador(Desarrollador desarrollador) {
        desarrolladores.add(desarrollador);
    }

    public Desarrollador buscarDesarrollador(String identificacion) {
        for (Desarrollador d : desarrolladores) {
            if (d.getIdentificacion().equals(identificacion)) {
                return d;
            }
        }
        return null;
    }

    public boolean eliminarDesarrollador(String identificacion) {
        Desarrollador d = buscarDesarrollador(identificacion);
        if (d != null) {
            desarrolladores.remove(d);
            return true;
        }
        return false;
    }

    public int obtenerCantidadDesarrolladores() {
        return desarrolladores.size();
    }

    public double calcularTotalHoras() {
        double total = 0;
        for (Desarrollador d : desarrolladores) {
            total = total + d.getHorasAsignadas();
        }
        return total;
    }

    public String mostrarEquipo() {
        String equipo = "";
        for (Desarrollador d : desarrolladores) {
            equipo = equipo + d.mostrarInformacion() + "\n";
        }
        return equipo;
    }

    public Desarrollador obtenerMayorCarga() {
        Desarrollador mayor = null;
        for (Desarrollador d : desarrolladores) {
            if (mayor == null || d.getHorasAsignadas() > mayor.getHorasAsignadas()) {
                mayor = d;
            }
        }
        return mayor;
    }
}
