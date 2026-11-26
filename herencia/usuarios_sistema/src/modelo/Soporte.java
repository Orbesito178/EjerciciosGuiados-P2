package modelo;

public class Soporte extends Usuario {
    //Atributos
    private String turno;

    public Soporte(String username, String correo, String turno) {
        super(username, correo);
        this.turno = turno;
    }

    //Setters y getters
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    //Metodos
    @Override
    public String obtenerPermisos() {
        return "Permisos: ver tickets, responder consultas";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Rol: Soporte - " + "turno: " + turno;
    }
}
