package modelo;

public class Controlador extends Dispositivo {
    //Atributos
    private int numeroEntradas;

    public Controlador(String codigo, String nombre, boolean activo, int numeroEntradas) {
        super(codigo, nombre, activo);
        this.numeroEntradas = numeroEntradas;
    }

    //Setters y getters
    public int getNumeroEntradas() {
        return numeroEntradas;
    }
    public void setNumeroEntradas(int numeroEntradas) {
        this.numeroEntradas = numeroEntradas;
    }

    //Metodos
    @Override
    public String obtenerEstadoOperacion() {
        return "Controlador con " + numeroEntradas + " entradas en servicio";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Controlador - Entradas: " + numeroEntradas;
    }
}
