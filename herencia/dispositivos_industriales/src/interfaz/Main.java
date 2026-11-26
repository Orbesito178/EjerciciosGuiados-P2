package interfaz;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        Dispositivo d1 = new Sensor("S01", "Temp", true, 24.5, "C");
        Dispositivo d2 = new Sensor("S02", "Presion", false, 1.8, "bar");
        Dispositivo d3 = new Actuador("A01", "Valvula", true, 50, 2.5);
        Dispositivo d4 = new Actuador("A02", "Motor", true, 10, 7.5);
        Dispositivo d5 = new Controlador("C01", "PLC", true, 16);
        EstacionControl estacion = new EstacionControl();
        estacion.agregarDispositivo(d1);
        estacion.agregarDispositivo(d2);
        estacion.agregarDispositivo(d3);
        estacion.agregarDispositivo(d4);
        estacion.agregarDispositivo(d5);
        System.out.println(estacion.mostrarDispositivos());
        System.out.println("Activos: " + estacion.contarActivos());
        Dispositivo existente = estacion.buscarDispositivo("A01");
        if (existente != null) {
            System.out.println("Encontrado: " + existente.mostrarInformacion());
        } else {
            System.out.println("No encontrado");
        }
        Dispositivo inexistente = estacion.buscarDispositivo("X99");
        if (inexistente != null) {
            System.out.println("Encontrado: " + inexistente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + inexistente);
        }
    }
}
