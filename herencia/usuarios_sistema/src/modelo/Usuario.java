package modelo;

public class Usuario {
    //Atributos
    private String username;
    private String correo;

    public Usuario(String username, String correo) {
        this.username = username;
        this.correo = correo;
    }

    //Setters y getters
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //Metodos
    public String obtenerPermisos() {
        return "Permisos: ver perfil";
    }

    public String mostrarInformacion() {
        return "Usuario: " + username + " - Correo: " + correo;
    }
}
