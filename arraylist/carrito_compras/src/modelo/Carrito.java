package modelo;

import java.util.ArrayList;

public class Carrito {
    //Atributos
    private ArrayList<ItemCarrito> items;

    public Carrito() {
        items = new ArrayList<>();
    }

    //Metodos
    public void agregarProducto(Producto producto, int cantidad) {
        if (cantidad > 0) {
            ItemCarrito item = new ItemCarrito(producto, cantidad);
            items.add(item);
        }
    }

    public int obtenerCantidadItems() {
        return items.size();
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrito item : items) {
            total = total + item.calcularSubtotal();
        }
        return total;
    }

    public boolean eliminarItem(int posicion) {
        if (posicion >= 0 && posicion < items.size()) {
            items.remove(posicion);
            return true;
        }
        return false;
    }

    public String mostrarResumen() {
        String resumen = "";
        for (ItemCarrito item : items) {
            resumen = resumen + item.mostrarInformacion() + "\n";
        }
        resumen = resumen + "Total: $" + String.format("%.2f", calcularTotal());
        return resumen;
    }

    public ItemCarrito obtenerItemMayorSubtotal() {
        ItemCarrito mayor = null;
        for (ItemCarrito item : items) {
            if (mayor == null || item.calcularSubtotal() > mayor.calcularSubtotal()) {
                mayor = item;
            }
        }
        return mayor;
    }
}
