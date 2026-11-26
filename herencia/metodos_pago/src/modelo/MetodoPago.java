package modelo;

public class MetodoPago {
    //Atributos
    private String titular;
    private double limite;

    public MetodoPago(String titular, double limite) {
        this.titular = titular;
        this.limite = limite;
    }

    //Setters y getters
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }

    //Metodos
    public double calcularComision(double monto) {
        return monto * 0.02;
    }

    public String mostrarInformacion() {
        return "Titular: " + titular + " - Limite: $" + limite;
    }
}
