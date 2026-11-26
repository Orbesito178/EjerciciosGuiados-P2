package modelo;

public class Cliente extends Usuario {
    //Atributos
    private String plan;

    public Cliente(String username, String correo, String plan) {
        super(username, correo);
        this.plan = plan;
    }

    //Setters y getters
    public String getPlan() {
        return plan;
    }
    public void setPlan(String plan) {
        this.plan = plan;
    }

    //Metodos
    @Override
    public String obtenerPermisos() {
        return "Permisos: ver catalogo, realizar compras";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Rol: Cliente - " + "plan: " + plan;
    }
}
