package modelo;

import java.util.ArrayList;

public class SistemaUsuarios {
    //Atributos
    private ArrayList<Usuario> usuarios;

    public SistemaUsuarios() {
        usuarios = new ArrayList<>();
    }

    //Metodos
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario buscarUsuario(String username) {
        for (Usuario u : usuarios) {
            if (u.getUsername().equals(username)) {
                return u;
            }
        }
        return null;
    }

    public boolean eliminarUsuario(String username) {
        Usuario u = buscarUsuario(username);
        if (u != null) {
            usuarios.remove(u);
            return true;
        }
        return false;
    }

    public String mostrarUsuarios() {
        String lista = "";
        for (Usuario u : usuarios) {
            lista = lista + u.mostrarInformacion() + "\n";
        }
        return lista;
    }
}
