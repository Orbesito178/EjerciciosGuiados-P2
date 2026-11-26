package modelo;

public class Switch extends EquipoRed {
    //Atributos
    private int cantidadPuertos;

    public Switch(String nombre, String direccionIP, boolean activo, int cantidadPuertos) {
        super(nombre, direccionIP, activo);
        this.cantidadPuertos = cantidadPuertos;
    }

    //Setters y getters
    public int getCantidadPuertos() {
        return cantidadPuertos;
    }
    public void setCantidadPuertos(int cantidadPuertos) {
        this.cantidadPuertos = cantidadPuertos;
    }

    //Metodos
    @Override
    public String obtenerFuncion() {
        return "Funcion: conectar dispositivos dentro de la red";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Puertos: " + cantidadPuertos;
    }
}
