package modelo;

import java.util.ArrayList;

public class EstacionControl {
    //Atributos
    private ArrayList<Dispositivo> dispositivos;

    public EstacionControl() {
        dispositivos = new ArrayList<>();
    }

    //Metodos
    public void agregarDispositivo(Dispositivo dispositivo) {
        dispositivos.add(dispositivo);
    }

    public Dispositivo buscarDispositivo(String codigo) {
        for (Dispositivo d : dispositivos) {
            if (d.getCodigo().equals(codigo)) {
                return d;
            }
        }
        return null;
    }

    public int contarActivos() {
        int contador = 0;
        for (Dispositivo d : dispositivos) {
            if (d.isActivo()) {
                contador++;
            }
        }
        return contador;
    }

    public String mostrarDispositivos() {
        String lista = "";
        for (Dispositivo d : dispositivos) {
            lista = lista + d.mostrarInformacion() + " | " + d.obtenerEstadoOperacion() + "\n";
        }
        return lista;
    }
}
