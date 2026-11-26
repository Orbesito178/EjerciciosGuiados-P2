package modelo;

import java.util.ArrayList;

public class Red {
    //Atributos
    private String nombre;
    private ArrayList<DispositivoRed> dispositivos;

    public Red(String nombre) {
        this.nombre = nombre;
        dispositivos = new ArrayList<>();
    }

    //Setters y getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodos
    public void agregarDispositivo(DispositivoRed dispositivo) {
        dispositivos.add(dispositivo);
    }

    public DispositivoRed buscarPorIP(String direccionIP) {
        for (DispositivoRed d : dispositivos) {
            if (d.getDireccionIP().equals(direccionIP)) {
                return d;
            }
        }
        return null;
    }

    public boolean eliminarDispositivo(String direccionIP) {
        DispositivoRed d = buscarPorIP(direccionIP);
        if (d != null) {
            dispositivos.remove(d);
            return true;
        }
        return false;
    }

    public int obtenerCantidadDispositivos() {
        return dispositivos.size();
    }

    public int contarActivos() {
        int contador = 0;
        for (DispositivoRed d : dispositivos) {
            if (d.isActivo()) {
                contador++;
            }
        }
        return contador;
    }

    public int contarPorTipo(String tipo) {
        int contador = 0;
        for (DispositivoRed d : dispositivos) {
            if (d.getTipo().equals(tipo)) {
                contador++;
            }
        }
        return contador;
    }

    public String mostrarDispositivos() {
        String lista = "";
        for (DispositivoRed d : dispositivos) {
            lista = lista + d.mostrarInformacion() + "\n";
        }
        return lista;
    }

    public DispositivoRed buscarActivoPorTipo(String tipo) {
        for (DispositivoRed d : dispositivos) {
            if (d.getTipo().equals(tipo) && d.isActivo()) {
                return d;
            }
        }
        return null;
    }
}
