package modelo;

public class EquipoRed {
    //Atributos
    private String nombre;
    private String direccionIP;
    private boolean activo;

    public EquipoRed(String nombre, String direccionIP, boolean activo) {
        this.nombre = nombre;
        this.direccionIP = direccionIP;
        this.activo = activo;
    }

    //Setters y getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccionIP() {
        return direccionIP;
    }
    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    //Metodos
    public String obtenerFuncion() {
        return "Funcion: equipo de red generico";
    }

    public String mostrarInformacion() {
        String estado = "Inactivo";
        if (activo) {
            estado = "Activo";
        }
        return nombre + " - " + direccionIP + " - " + estado;
    }
}
