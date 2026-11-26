package interfaz;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        DispositivoRed r1 = new DispositivoRed("RouterCentral", "192.168.1.1", "Router", true);
        DispositivoRed s1 = new DispositivoRed("Switch01", "192.168.1.10", "Switch", true);
        DispositivoRed s2 = new DispositivoRed("Switch02", "192.168.1.11", "Switch", false);
        DispositivoRed ap1 = new DispositivoRed("AP01", "192.168.1.20", "AccessPoint", true);
        DispositivoRed srv = new DispositivoRed("Servidor01", "192.168.1.30", "Servidor", false);
        Red red = new Red("Laboratorio");
        System.out.println("Dispositivos iniciales: " + red.obtenerCantidadDispositivos());
        red.agregarDispositivo(r1);
        red.agregarDispositivo(s1);
        red.agregarDispositivo(s2);
        red.agregarDispositivo(ap1);
        red.agregarDispositivo(srv);
        System.out.println(red.mostrarDispositivos());
        DispositivoRed existente = red.buscarPorIP("192.168.1.1");
        if (existente != null) {
            System.out.println("Encontrado: " + existente.mostrarInformacion());
        } else {
            System.out.println("No encontrado");
        }
        DispositivoRed inexistente = red.buscarPorIP("10.0.0.99");
        if (inexistente != null) {
            System.out.println("Encontrado: " + inexistente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + inexistente);
        }
        System.out.println("Eliminar 192.168.1.30: " + red.eliminarDispositivo("192.168.1.30"));
        System.out.println("Eliminar 10.0.0.99: " + red.eliminarDispositivo("10.0.0.99"));
        System.out.println("Dispositivos: " + red.obtenerCantidadDispositivos());
        System.out.println("Activos: " + red.contarActivos());
        System.out.println("Switches: " + red.contarPorTipo("Switch"));
        DispositivoRed activo = red.buscarActivoPorTipo("Switch");
        System.out.println("Primer Switch activo: " + activo.mostrarInformacion());
    }
}
