package modelo;

public class Administrador extends Usuario {
    //Atributos
    private int nivelAdministracion;

    public Administrador(String username, String correo, int nivelAdministracion) {
        super(username, correo);
        this.nivelAdministracion = nivelAdministracion;
    }

    //Setters y getters
    public int getNivelAdministracion() {
        return nivelAdministracion;
    }
    public void setNivelAdministracion(int nivelAdministracion) {
        this.nivelAdministracion = nivelAdministracion;
    }

    //Metodos
    @Override
    public String obtenerPermisos() {
        return "Permisos: administrar usuarios, configurar el sistema";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Rol: Administrador - " + "nivelAdministracion: " + nivelAdministracion;
    }
}
