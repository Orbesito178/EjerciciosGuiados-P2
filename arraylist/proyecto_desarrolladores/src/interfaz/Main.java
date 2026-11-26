package interfaz;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        Desarrollador d1 = new Desarrollador("D01", "Ana", "Backend", 20);
        Desarrollador d2 = new Desarrollador("D02", "Luis", "Frontend", 15);
        Desarrollador d3 = new Desarrollador("D03", "Marta", "Bases de datos", 30);
        Proyecto proyecto = new Proyecto("Sistema de ventas");
        System.out.println("Desarrolladores iniciales: " + proyecto.obtenerCantidadDesarrolladores());
        proyecto.agregarDesarrollador(d1);
        proyecto.agregarDesarrollador(d2);
        proyecto.agregarDesarrollador(d3);
        System.out.println(proyecto.mostrarEquipo());
        Desarrollador existente = proyecto.buscarDesarrollador("D02");
        if (existente != null) {
            System.out.println("Encontrado: " + existente.mostrarInformacion());
        } else {
            System.out.println("No encontrado");
        }
        Desarrollador inexistente = proyecto.buscarDesarrollador("D99");
        if (inexistente != null) {
            System.out.println("Encontrado: " + inexistente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + inexistente);
        }
        System.out.println("Eliminar D01: " + proyecto.eliminarDesarrollador("D01"));
        System.out.println("Eliminar D99: " + proyecto.eliminarDesarrollador("D99"));
        System.out.println("Desarrolladores: " + proyecto.obtenerCantidadDesarrolladores());
        System.out.println("Horas totales: " + proyecto.calcularTotalHoras());
        System.out.println("Mayor carga: " + proyecto.obtenerMayorCarga().mostrarInformacion());
    }
}
