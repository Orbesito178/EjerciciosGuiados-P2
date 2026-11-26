package modelo;

public class Transferencia extends MetodoPago {
    //Atributos
    private String banco;

    public Transferencia(String titular, double limite, String banco) {
        super(titular, limite);
        this.banco = banco;
    }

    //Setters y getters
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }

    //Metodos
    @Override
    public double calcularComision(double monto) {
        return monto * 0.01;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Banco: " + banco;
    }
}
