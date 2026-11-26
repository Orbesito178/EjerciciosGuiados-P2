package interfaz;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        Sensor s1 = new Sensor("S01", "Temperatura", 24.5, true);
        Sensor s2 = new Sensor("S02", "Presion", 1.8, true);
        Sensor s3 = new Sensor("S03", "Humedad", 55.0, false);
        Sensor s4 = new Sensor("S04", "Nivel", 3.2, true);
        SistemaControl sistema = new SistemaControl();
        System.out.println("Sensores iniciales: " + sistema.obtenerCantidadSensores());
        sistema.agregarSensor(s1);
        sistema.agregarSensor(s2);
        sistema.agregarSensor(s3);
        sistema.agregarSensor(s4);
        System.out.println(sistema.mostrarSensores());
        Sensor existente = sistema.buscarSensor("S02");
        if (existente != null) {
            System.out.println("Encontrado: " + existente.mostrarInformacion());
        } else {
            System.out.println("No encontrado");
        }
        Sensor inexistente = sistema.buscarSensor("S99");
        if (inexistente != null) {
            System.out.println("Encontrado: " + inexistente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + inexistente);
        }
        System.out.println("Eliminar S03: " + sistema.eliminarSensor("S03"));
        System.out.println("Eliminar S99: " + sistema.eliminarSensor("S99"));
        System.out.println("Sensores: " + sistema.obtenerCantidadSensores());
        System.out.println("Promedio de lecturas: " + sistema.calcularPromedioLecturas());
        System.out.println("Activos: " + sistema.contarSensoresActivos());
        System.out.println("Mayor lectura: " + sistema.obtenerMayorLectura().mostrarInformacion());
    }
}
