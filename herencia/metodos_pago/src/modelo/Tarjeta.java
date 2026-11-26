package modelo;

public class Tarjeta extends MetodoPago {
    //Atributos
    private String numero;

    public Tarjeta(String titular, double limite, String numero) {
        super(titular, limite);
        this.numero = numero;
    }

    //Setters y getters
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    //Metodos
    @Override
    public double calcularComision(double monto) {
        return monto * 0.05;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Tarjeta: " + numero;
    }
}
