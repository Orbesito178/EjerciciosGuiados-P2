package modelo;

public class PanelMonitoreo {
    //Atributos
    private Sensor[] sensores;

    public PanelMonitoreo(Sensor[] sensores) {
        this.sensores = sensores;
    }

    //Setters y getters
    public Sensor[] getSensores() {
        return sensores;
    }
    public void setSensores(Sensor[] sensores) {
        this.sensores = sensores;
    }

    //Metodos
    public String listarSensores() {
        String resultado = "";
        for (int i = 0; i < sensores.length; i++) {
            if (sensores[i] != null) {
                resultado = resultado + sensores[i].mostrarInformacion() + "\n";
            }
        }
        return resultado;
    }

    public int contarActivos() {
        int contador = 0;
        for (int i = 0; i < sensores.length; i++) {
            if (sensores[i] != null && sensores[i].isActivo()) {
                contador++;
            }
        }
        return contador;
    }

    public double calcularPromedioLecturas() {
        double suma = 0;
        int cantidad = 0;
        for (int i = 0; i < sensores.length; i++) {
            if (sensores[i] != null) {
                suma = suma + sensores[i].getLectura();
                cantidad++;
            }
        }
        if (cantidad == 0) {
            return 0;
        }
        return suma / cantidad;
    }

    public Sensor buscarSensor(String clave) {
        for (int i = 0; i < sensores.length; i++) {
            if (sensores[i] != null && sensores[i].getCodigo().equals(clave)) {
                return sensores[i];
            }
        }
        return null;
    }

    public Sensor obtenerMayorLectura() {
        Sensor resultado = null;
        for (int i = 0; i < sensores.length; i++) {
            if (sensores[i] != null) {
                if (resultado == null || sensores[i].getLectura() > resultado.getLectura()) {
                    resultado = sensores[i];
                }
            }
        }
        return resultado;
    }
}
