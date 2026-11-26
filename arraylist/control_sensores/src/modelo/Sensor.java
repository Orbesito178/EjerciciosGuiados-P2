package modelo;

public class Sensor {
    //Atributos
    private String codigo;
    private String tipo;
    private double lectura;
    private boolean activo;

    public Sensor(String codigo, String tipo, double lectura, boolean activo) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.lectura = lectura;
        this.activo = activo;
    }

    //Setters y getters
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getLectura() {
        return lectura;
    }
    public void setLectura(double lectura) {
        this.lectura = lectura;
    }
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    //Metodos
    public String mostrarInformacion() {
        String estado = "Inactivo";
        if (activo) {
            estado = "Activo";
        }
        return codigo + " - " + tipo + " - " + lectura + " - " + estado;
    }
}
