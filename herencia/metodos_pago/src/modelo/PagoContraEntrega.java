package modelo;

public class PagoContraEntrega extends MetodoPago {
    //Atributos
    private String ciudad;

    public PagoContraEntrega(String titular, double limite, String ciudad) {
        super(titular, limite);
        this.ciudad = ciudad;
    }

    //Setters y getters
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    //Metodos
    @Override
    public double calcularComision(double monto) {
        return monto * 0.04;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Entrega en: " + ciudad;
    }
}
