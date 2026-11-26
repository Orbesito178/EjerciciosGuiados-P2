package interfaz;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        EquipoRed e1 = new Router("R1", "10.0.0.1", true, 12);
        EquipoRed e2 = new Switch("SW1", "10.0.0.2", true, 24);
        EquipoRed e3 = new AccessPoint("AP1", "10.0.0.3", false, 35);
        EquipoRed e4 = new Firewall("FW1", "10.0.0.4", true, 50);
        Red red = new Red();
        red.agregarEquipo(e1);
        red.agregarEquipo(e2);
        red.agregarEquipo(e3);
        red.agregarEquipo(e4);
        System.out.println(red.mostrarEquipos());
        System.out.println("Activos: " + red.contarActivos());
        EquipoRed existente = red.buscarPorIP("10.0.0.2");
        if (existente != null) {
            System.out.println("Encontrado: " + existente.mostrarInformacion());
        } else {
            System.out.println("No encontrado");
        }
        EquipoRed inexistente = red.buscarPorIP("10.0.0.99");
        if (inexistente != null) {
            System.out.println("Encontrado: " + inexistente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + inexistente);
        }
    }
}
