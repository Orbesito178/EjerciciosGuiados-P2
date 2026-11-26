package interfaz;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        Modulo[] modulos = new Modulo[5];
        modulos[0] = new Modulo("Autenticacion", "Java", 100, true);
        modulos[1] = new Modulo("Inventario", "Java", 75, false);
        modulos[2] = new Modulo("Reportes", "Python", 40, false);
        modulos[3] = new Modulo("API", "Java", 100, true);
        modulos[4] = new Modulo("Interfaz", "JavaScript", 20, false);
        AnalizadorProyecto analizador = new AnalizadorProyecto(modulos);
        System.out.println("Listado:");
        System.out.println(analizador.listarModulos());
        System.out.println("Terminados: " + analizador.contarTerminados());
        System.out.println("Progreso promedio: " + analizador.calcularProgresoPromedio());
        Modulo existente = analizador.buscarModulo("Autenticacion");
        if (existente != null) {
            System.out.println("Encontrado: " + existente.mostrarInformacion());
        } else {
            System.out.println("No encontrado");
        }
        Modulo inexistente = analizador.buscarModulo("Pagos");
        if (inexistente != null) {
            System.out.println("Encontrado: " + inexistente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + inexistente);
        }
        Modulo extremo = analizador.obtenerMenorProgreso();
        System.out.println("Modulo con menor progreso: " + extremo.mostrarInformacion());
    }
}
