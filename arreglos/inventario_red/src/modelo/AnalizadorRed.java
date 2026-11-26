package modelo;

public class AnalizadorRed {
    //Atributos
    private EquipoRed[] equipos;

    public AnalizadorRed(EquipoRed[] equipos) {
        this.equipos = equipos;
    }

    //Setters y getters
    public EquipoRed[] getEquipos() {
        return equipos;
    }
    public void setEquipos(EquipoRed[] equipos) {
        this.equipos = equipos;
    }

    //Metodos
    public String listarEquipos() {
        String resultado = "";
        for (int i = 0; i < equipos.length; i++) {
            if (equipos[i] != null) {
                resultado = resultado + equipos[i].mostrarInformacion() + "\n";
            }
        }
        return resultado;
    }

    public int contarActivos() {
        int contador = 0;
        for (int i = 0; i < equipos.length; i++) {
            if (equipos[i] != null && equipos[i].isActivo()) {
                contador++;
            }
        }
        return contador;
    }

    public double calcularVelocidadPromedio() {
        double suma = 0;
        int cantidad = 0;
        for (int i = 0; i < equipos.length; i++) {
            if (equipos[i] != null) {
                suma = suma + equipos[i].getVelocidadMbps();
                cantidad++;
            }
        }
        if (cantidad == 0) {
            return 0;
        }
        return suma / cantidad;
    }

    public EquipoRed buscarPorIP(String clave) {
        for (int i = 0; i < equipos.length; i++) {
            if (equipos[i] != null && equipos[i].getDireccionIP().equals(clave)) {
                return equipos[i];
            }
        }
        return null;
    }

    public EquipoRed obtenerEquipoMasRapido() {
        EquipoRed resultado = null;
        for (int i = 0; i < equipos.length; i++) {
            if (equipos[i] != null) {
                if (resultado == null || equipos[i].getVelocidadMbps() > resultado.getVelocidadMbps()) {
                    resultado = equipos[i];
                }
            }
        }
        return resultado;
    }
}
