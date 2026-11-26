package modelo;

public class Desarrollador {
    //Atributos
    private String identificacion;
    private String nombre;
    private String especialidad;
    private double horasAsignadas;

    public Desarrollador(String identificacion, String nombre, String especialidad, double horasAsignadas) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.horasAsignadas = horasAsignadas;
    }

    //Setters y getters
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public double getHorasAsignadas() {
        return horasAsignadas;
    }
    public void setHorasAsignadas(double horasAsignadas) {
        this.horasAsignadas = horasAsignadas;
    }

    //Metodos
    public String mostrarInformacion() {
        return identificacion + " - " + nombre + " - " + especialidad + " - " + horasAsignadas + " horas";
    }
}
