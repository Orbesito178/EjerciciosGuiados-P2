package modelo;

public class Desarrollador extends Usuario {
    //Atributos
    private String lenguajePrincipal;

    public Desarrollador(String username, String correo, String lenguajePrincipal) {
        super(username, correo);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    //Setters y getters
    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }
    public void setLenguajePrincipal(String lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    }

    //Metodos
    @Override
    public String obtenerPermisos() {
        return "Permisos: ver proyectos, editar codigo, desplegar";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Rol: Desarrollador - " + "lenguajePrincipal: " + lenguajePrincipal;
    }
}
