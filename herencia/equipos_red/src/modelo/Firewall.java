package modelo;

public class Firewall extends EquipoRed {
    //Atributos
    private int cantidadReglas;

    public Firewall(String nombre, String direccionIP, boolean activo, int cantidadReglas) {
        super(nombre, direccionIP, activo);
        this.cantidadReglas = cantidadReglas;
    }

    //Setters y getters
    public int getCantidadReglas() {
        return cantidadReglas;
    }
    public void setCantidadReglas(int cantidadReglas) {
        this.cantidadReglas = cantidadReglas;
    }

    //Metodos
    @Override
    public String obtenerFuncion() {
        return "Funcion: filtrar el trafico de la red";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Reglas: " + cantidadReglas;
    }
}
