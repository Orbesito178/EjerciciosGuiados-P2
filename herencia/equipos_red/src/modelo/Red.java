package modelo;

import java.util.ArrayList;

public class Red {
    //Atributos
    private ArrayList<EquipoRed> equipos;

    public Red() {
        equipos = new ArrayList<>();
    }

    //Metodos
    public void agregarEquipo(EquipoRed equipo) {
        equipos.add(equipo);
    }

    public EquipoRed buscarPorIP(String direccionIP) {
        for (EquipoRed e : equipos) {
            if (e.getDireccionIP().equals(direccionIP)) {
                return e;
            }
        }
        return null;
    }

    public int contarActivos() {
        int contador = 0;
        for (EquipoRed e : equipos) {
            if (e.isActivo()) {
                contador++;
            }
        }
        return contador;
    }

    public String mostrarEquipos() {
        String lista = "";
        for (EquipoRed e : equipos) {
            lista = lista + e.mostrarInformacion() + " | " + e.obtenerFuncion() + "\n";
        }
        return lista;
    }
}
