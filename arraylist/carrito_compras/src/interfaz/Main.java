package interfaz;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("P01", "Mouse", 25.50);
        Producto p2 = new Producto("P02", "Teclado", 40.00);
        Producto p3 = new Producto("P03", "Monitor", 180.00);
        Carrito carrito = new Carrito();
        System.out.println("Items iniciales: " + carrito.obtenerCantidadItems());
        System.out.println(carrito.mostrarResumen());
        carrito.agregarProducto(p1, 2);
        carrito.agregarProducto(p2, 1);
        carrito.agregarProducto(p3, 3);
        carrito.agregarProducto(p1, 0);
        System.out.println("Items: " + carrito.obtenerCantidadItems());
        System.out.println(carrito.mostrarResumen());
        System.out.println("Total: " + carrito.calcularTotal());
        ItemCarrito mayor = carrito.obtenerItemMayorSubtotal();
        System.out.println("Mayor subtotal: " + mayor.mostrarInformacion());
        System.out.println("Eliminar posicion 0: " + carrito.eliminarItem(0));
        System.out.println("Eliminar posicion 10: " + carrito.eliminarItem(10));
        System.out.println(carrito.mostrarResumen());
    }
}
