package interfaz;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Administrador("admin1", "admin@demo.com", 3);
        Usuario u2 = new Desarrollador("dev1", "dev@demo.com", "Java");
        Usuario u3 = new Cliente("cliente1", "cliente@demo.com", "Premium");
        Usuario u4 = new Soporte("soporte1", "soporte@demo.com", "Noche");
        SistemaUsuarios sistema = new SistemaUsuarios();
        sistema.agregarUsuario(u1);
        sistema.agregarUsuario(u2);
        sistema.agregarUsuario(u3);
        sistema.agregarUsuario(u4);
        System.out.println(sistema.mostrarUsuarios());
        System.out.println(u1.obtenerPermisos());
        System.out.println(u2.obtenerPermisos());
        System.out.println(u3.obtenerPermisos());
        System.out.println(u4.obtenerPermisos());
        Usuario existente = sistema.buscarUsuario("dev1");
        if (existente != null) {
            System.out.println("Encontrado: " + existente.mostrarInformacion());
        } else {
            System.out.println("No encontrado");
        }
        Usuario inexistente = sistema.buscarUsuario("nadie");
        if (inexistente != null) {
            System.out.println("Encontrado: " + inexistente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + inexistente);
        }
        System.out.println("Eliminar cliente1: " + sistema.eliminarUsuario("cliente1"));
        System.out.println("Eliminar nadie: " + sistema.eliminarUsuario("nadie"));
        System.out.println(sistema.mostrarUsuarios());
    }
}
