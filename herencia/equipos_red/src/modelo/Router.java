package modelo;

public class Router extends EquipoRed {
    //Atributos
    private int cantidadRutas;

    public Router(String nombre, String direccionIP, boolean activo, int cantidadRutas) {
        super(nombre, direccionIP, activo);
        this.cantidadRutas = cantidadRutas;
    }

    //Setters y getters
    public int getCantidadRutas() {
        return cantidadRutas;
    }
    public void setCantidadRutas(int cantidadRutas) {
        this.cantidadRutas = cantidadRutas;
    }

    //Metodos
    @Override
    public String obtenerFuncion() {
        return "Funcion: enrutar paquetes entre redes";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Rutas: " + cantidadRutas;
    }
}
