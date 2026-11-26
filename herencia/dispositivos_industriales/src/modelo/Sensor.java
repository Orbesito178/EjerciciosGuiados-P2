package modelo;

public class Sensor extends Dispositivo {
    //Atributos
    private double lectura;
    private String unidad;

    public Sensor(String codigo, String nombre, boolean activo, double lectura, String unidad) {
        super(codigo, nombre, activo);
        this.lectura = lectura;
        this.unidad = unidad;
    }

    //Setters y getters
    public double getLectura() {
        return lectura;
    }
    public void setLectura(double lectura) {
        this.lectura = lectura;
    }
    public String getUnidad() {
        return unidad;
    }
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    //Metodos
    @Override
    public String obtenerEstadoOperacion() {
        return "Sensor midiendo " + lectura + " " + unidad;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Sensor - Lectura: " + lectura + " " + unidad;
    }
}
