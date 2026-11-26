package modelo;

public class Dispositivo {
    //Atributos
    private String codigo;
    private String nombre;
    private boolean activo;

    public Dispositivo(String codigo, String nombre, boolean activo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.activo = activo;
    }

    //Setters y getters
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    //Metodos
    public String obtenerEstadoOperacion() {
        if (activo) {
            return "Dispositivo en operacion";
        }
        return "Dispositivo detenido";
    }

    public String mostrarInformacion() {
        return codigo + " - " + nombre;
    }
}
