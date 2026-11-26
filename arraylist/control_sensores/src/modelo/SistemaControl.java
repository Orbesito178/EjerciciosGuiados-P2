package modelo;

import java.util.ArrayList;

public class SistemaControl {
    //Atributos
    private ArrayList<Sensor> sensores;

    public SistemaControl() {
        sensores = new ArrayList<>();
    }

    //Metodos
    public void agregarSensor(Sensor sensor) {
        sensores.add(sensor);
    }

    public Sensor buscarSensor(String codigo) {
        for (Sensor s : sensores) {
            if (s.getCodigo().equals(codigo)) {
                return s;
            }
        }
        return null;
    }

    public boolean eliminarSensor(String codigo) {
        Sensor s = buscarSensor(codigo);
        if (s != null) {
            sensores.remove(s);
            return true;
        }
        return false;
    }

    public int obtenerCantidadSensores() {
        return sensores.size();
    }

    public double calcularPromedioLecturas() {
        if (sensores.size() == 0) {
            return 0;
        }
        double suma = 0;
        for (Sensor s : sensores) {
            suma = suma + s.getLectura();
        }
        return suma / sensores.size();
    }

    public int contarSensoresActivos() {
        int contador = 0;
        for (Sensor s : sensores) {
            if (s.isActivo()) {
                contador++;
            }
        }
        return contador;
    }

    public String mostrarSensores() {
        String lista = "";
        for (Sensor s : sensores) {
            lista = lista + s.mostrarInformacion() + "\n";
        }
        return lista;
    }

    public Sensor obtenerMayorLectura() {
        Sensor mayor = null;
        for (Sensor s : sensores) {
            if (mayor == null || s.getLectura() > mayor.getLectura()) {
                mayor = s;
            }
        }
        return mayor;
    }
}
