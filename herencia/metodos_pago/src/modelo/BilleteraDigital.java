package modelo;

public class BilleteraDigital extends MetodoPago {
    //Atributos
    private String proveedor;

    public BilleteraDigital(String titular, double limite, String proveedor) {
        super(titular, limite);
        this.proveedor = proveedor;
    }

    //Setters y getters
    public String getProveedor() {
        return proveedor;
    }
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    //Metodos
    @Override
    public double calcularComision(double monto) {
        return monto * 0.03;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Proveedor: " + proveedor;
    }
}
