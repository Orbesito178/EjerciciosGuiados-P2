package modelo;

public class Modulo {
    //Atributos
    private String nombre;
    private String lenguaje;
    private int progreso;
    private boolean terminado;

    public Modulo(String nombre, String lenguaje, int progreso, boolean terminado) {
        this.nombre = nombre;
        this.lenguaje = lenguaje;
        this.progreso = progreso;
        this.terminado = terminado;
    }

    //Setters y getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getLenguaje() {
        return lenguaje;
    }
    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    public int getProgreso() {
        return progreso;
    }
    public void setProgreso(int progreso) {
        this.progreso = progreso;
    }
    public boolean isTerminado() {
        return terminado;
    }
    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    //Metodos
    public String mostrarInformacion() {
        String estado = "En desarrollo";
        if (terminado) {
            estado = "Terminado";
        }
        return nombre + " - " + lenguaje + " - " + progreso + "% - " + estado;
    }
}
