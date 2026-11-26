package modelo;

public class ItemCarrito {
    //Atributos
    private Producto producto;
    private int cantidad;

    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    //Setters y getters
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //Metodos
    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }

    public String mostrarInformacion() {
        return producto.getNombre() + " x" + cantidad + " = $" + String.format("%.2f", calcularSubtotal());
    }
}
