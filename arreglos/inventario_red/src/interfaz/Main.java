package interfaz;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        EquipoRed[] equipos = new EquipoRed[5];
        equipos[0] = new EquipoRed("RouterCentral", "192.168.1.1", "Router", 1000, true);
        equipos[1] = new EquipoRed("Switch01", "192.168.1.10", "Switch", 100, true);
        equipos[2] = new EquipoRed("AP01", "192.168.1.20", "AccessPoint", 300, false);
        equipos[3] = new EquipoRed("Servidor01", "192.168.1.30", "Servidor", 1000, true);
        equipos[4] = new EquipoRed("Firewall01", "192.168.1.2", "Firewall", 500, false);
        AnalizadorRed analizador = new AnalizadorRed(equipos);
        System.out.println("Listado:");
        System.out.println(analizador.listarEquipos());
        System.out.println("Activos: " + analizador.contarActivos());
        System.out.println("Velocidad promedio: " + analizador.calcularVelocidadPromedio());
        EquipoRed existente = analizador.buscarPorIP("192.168.1.1");
        if (existente != null) {
            System.out.println("Encontrado: " + existente.mostrarInformacion());
        } else {
            System.out.println("No encontrado");
        }
        EquipoRed inexistente = analizador.buscarPorIP("10.0.0.99");
        if (inexistente != null) {
            System.out.println("Encontrado: " + inexistente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + inexistente);
        }
        EquipoRed extremo = analizador.obtenerEquipoMasRapido();
        System.out.println("Equipo mas rapido: " + extremo.mostrarInformacion());
    }
}
