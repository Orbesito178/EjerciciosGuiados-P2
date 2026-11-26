package modelo;

public class AccessPoint extends EquipoRed {
    //Atributos
    private int cantidadClientes;

    public AccessPoint(String nombre, String direccionIP, boolean activo, int cantidadClientes) {
        super(nombre, direccionIP, activo);
        this.cantidadClientes = cantidadClientes;
    }

    //Setters y getters
    public int getCantidadClientes() {
        return cantidadClientes;
    }
    public void setCantidadClientes(int cantidadClientes) {
        this.cantidadClientes = cantidadClientes;
    }

    //Metodos
    @Override
    public String obtenerFuncion() {
        return "Funcion: proveer acceso inalambrico";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Clientes: " + cantidadClientes;
    }
}
