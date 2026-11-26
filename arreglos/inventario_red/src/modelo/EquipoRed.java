package modelo;

public class EquipoRed {
    //Atributos
    private String nombre;
    private String direccionIP;
    private String tipo;
    private double velocidadMbps;
    private boolean activo;

    public EquipoRed(String nombre, String direccionIP, String tipo, double velocidadMbps, boolean activo) {
        this.nombre = nombre;
        this.direccionIP = direccionIP;
        this.tipo = tipo;
        this.velocidadMbps = velocidadMbps;
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
    public double getVelocidadMbps() {
        return velocidadMbps;
    }
    public void setVelocidadMbps(double velocidadMbps) {
        this.velocidadMbps = velocidadMbps;
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
        return nombre + " - " + direccionIP + " - " + tipo + " - " + velocidadMbps + " Mbps - " + estado;
    }
}
