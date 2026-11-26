package interfaz;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        Producto[] productos = new Producto[5];
        productos[0] = new Producto("P01", "Mouse", 25.50, true);
        productos[1] = new Producto("P02", "Teclado", 40.00, true);
        productos[2] = new Producto("P03", "Monitor", 180.00, false);
        productos[3] = new Producto("P04", "Audifonos", 35.75, true);
        productos[4] = new Producto("P05", "Webcam", 60.00, false);
        AnalizadorCatalogo analizador = new AnalizadorCatalogo(productos);
        System.out.println("Listado:");
        System.out.println(analizador.listarProductos());
        System.out.println("Disponibles: " + analizador.contarDisponibles());
        System.out.println("Precio promedio: " + analizador.calcularPrecioPromedio());
        Producto existente = analizador.buscarPorCodigo("P01");
        if (existente != null) {
            System.out.println("Encontrado: " + existente.mostrarInformacion());
        } else {
            System.out.println("No encontrado");
        }
        Producto inexistente = analizador.buscarPorCodigo("P99");
        if (inexistente != null) {
            System.out.println("Encontrado: " + inexistente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + inexistente);
        }
        Producto extremo = analizador.obtenerProductoMasCaro();
        System.out.println("Producto mas caro: " + extremo.mostrarInformacion());
    }
}
