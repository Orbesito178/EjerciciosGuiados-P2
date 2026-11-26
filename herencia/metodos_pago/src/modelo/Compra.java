package modelo;

public class Compra {
    //Atributos
    private double total;
    private MetodoPago metodoPago;

    public Compra(double total, MetodoPago metodoPago) {
        this.total = total;
        this.metodoPago = metodoPago;
    }

    //Setters y getters
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public MetodoPago getMetodoPago() {
        return metodoPago;
    }
    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    //Metodos
    public double calcularTotalConComision() {
        return total + metodoPago.calcularComision(total);
    }

    public String mostrarInformacion() {
        return "Compra: $" + total + " | " + metodoPago.mostrarInformacion() + " | Comision: $" + metodoPago.calcularComision(total);
    }
}
