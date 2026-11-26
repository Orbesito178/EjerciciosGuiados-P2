package interfaz;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        Sensor[] sensores = new Sensor[5];
        sensores[0] = new Sensor("S01", "Temperatura", "C", 24.5, true);
        sensores[1] = new Sensor("S02", "Presion", "bar", 1.8, true);
        sensores[2] = new Sensor("S03", "Humedad", "%", 55.0, false);
        sensores[3] = new Sensor("S04", "Nivel", "m", 3.2, true);
        sensores[4] = new Sensor("S05", "Caudal", "L/min", 12.5, false);
        PanelMonitoreo analizador = new PanelMonitoreo(sensores);
        System.out.println("Listado:");
        System.out.println(analizador.listarSensores());
        System.out.println("Activos: " + analizador.contarActivos());
        System.out.println("Promedio de lecturas: " + analizador.calcularPromedioLecturas());
        Sensor existente = analizador.buscarSensor("S01");
        if (existente != null) {
            System.out.println("Encontrado: " + existente.mostrarInformacion());
        } else {
            System.out.println("No encontrado");
        }
        Sensor inexistente = analizador.buscarSensor("S99");
        if (inexistente != null) {
            System.out.println("Encontrado: " + inexistente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + inexistente);
        }
        Sensor extremo = analizador.obtenerMayorLectura();
        System.out.println("Sensor con mayor lectura: " + extremo.mostrarInformacion());
    }
}
