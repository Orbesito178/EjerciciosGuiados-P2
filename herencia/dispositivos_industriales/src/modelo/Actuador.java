package modelo;

public class Actuador extends Dispositivo {
    //Atributos
    private double posicion;
    private double potencia;

    public Actuador(String codigo, String nombre, boolean activo, double posicion, double potencia) {
        super(codigo, nombre, activo);
        this.posicion = posicion;
        this.potencia = potencia;
    }

    //Setters y getters
    public double getPosicion() {
        return posicion;
    }
    public void setPosicion(double posicion) {
        this.posicion = posicion;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    //Metodos
    @Override
    public String obtenerEstadoOperacion() {
        return "Actuador en posicion " + posicion + " con potencia " + potencia;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Actuador - Posicion: " + posicion + " - Potencia: " + potencia;
    }
}
