package modelo;

public class AnalizadorProyecto {
    //Atributos
    private Modulo[] modulos;

    public AnalizadorProyecto(Modulo[] modulos) {
        this.modulos = modulos;
    }

    //Setters y getters
    public Modulo[] getModulos() {
        return modulos;
    }
    public void setModulos(Modulo[] modulos) {
        this.modulos = modulos;
    }

    //Metodos
    public String listarModulos() {
        String resultado = "";
        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] != null) {
                resultado = resultado + modulos[i].mostrarInformacion() + "\n";
            }
        }
        return resultado;
    }

    public int contarTerminados() {
        int contador = 0;
        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] != null && modulos[i].isTerminado()) {
                contador++;
            }
        }
        return contador;
    }

    public double calcularProgresoPromedio() {
        double suma = 0;
        int cantidad = 0;
        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] != null) {
                suma = suma + modulos[i].getProgreso();
                cantidad++;
            }
        }
        if (cantidad == 0) {
            return 0;
        }
        return suma / cantidad;
    }

    public Modulo buscarModulo(String clave) {
        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] != null && modulos[i].getNombre().equals(clave)) {
                return modulos[i];
            }
        }
        return null;
    }

    public Modulo obtenerMenorProgreso() {
        Modulo resultado = null;
        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] != null) {
                if (resultado == null || modulos[i].getProgreso() < resultado.getProgreso()) {
                    resultado = modulos[i];
                }
            }
        }
        return resultado;
    }
}
