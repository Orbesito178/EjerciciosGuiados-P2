package modelo;

public class AnalizadorCatalogo {
    //Atributos
    private Producto[] productos;

    public AnalizadorCatalogo(Producto[] productos) {
        this.productos = productos;
    }

    //Setters y getters
    public Producto[] getProductos() {
        return productos;
    }
    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    //Metodos
    public String listarProductos() {
        String resultado = "";
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                resultado = resultado + productos[i].mostrarInformacion() + "\n";
            }
        }
        return resultado;
    }

    public int contarDisponibles() {
        int contador = 0;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null && productos[i].isDisponible()) {
                contador++;
            }
        }
        return contador;
    }

    public double calcularPrecioPromedio() {
        double suma = 0;
        int cantidad = 0;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                suma = suma + productos[i].getPrecio();
                cantidad++;
            }
        }
        if (cantidad == 0) {
            return 0;
        }
        return suma / cantidad;
    }

    public Producto buscarPorCodigo(String clave) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null && productos[i].getCodigo().equals(clave)) {
                return productos[i];
            }
        }
        return null;
    }

    public Producto obtenerProductoMasCaro() {
        Producto resultado = null;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                if (resultado == null || productos[i].getPrecio() > resultado.getPrecio()) {
                    resultado = productos[i];
                }
            }
        }
        return resultado;
    }
}
