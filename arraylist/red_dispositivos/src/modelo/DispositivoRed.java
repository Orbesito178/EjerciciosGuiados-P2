package modelo;

public class DispositivoRed {
    //Atributos
    private String nombre;
    private String direccionIP;
    private String tipo;
    private boolean activo;

    public DispositivoRed(String nombre, String direccionIP, String tipo, boolean activo) {
        this.nombre = nombre;
        this.direccionIP = direccionIP;
        this.tipo = tipo;
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
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        return nombre + " - " + direccionIP + " - " + tipo + " - " + estado;
    }
}
