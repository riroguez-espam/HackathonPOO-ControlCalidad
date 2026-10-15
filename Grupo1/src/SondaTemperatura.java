public class SondaTemperatura {

    // Atributos
    private String codigo;
    private boolean calibrada;

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        // Validamos que el codigo no este vacio
        if (codigo == null || codigo.isBlank()) {
            System.out.println("El codigo de la sonda no puede estar vacio");
            return;
        } else {
            this.codigo = codigo;
        }
    }

    public boolean isCalibrada() {
        return calibrada;
    }

    public void setCalibrada(boolean calibrada) {
        this.calibrada = calibrada;
    }

    // Constructor
    public SondaTemperatura() {

    }

    // Metodo para leer la temperatura interna del pescado (FUNCIONALIDAD)
    public Double leerTemperatura() {
        // Solo una sonda calibrada puede dar lecturas validas
        if (!calibrada) {
            System.out.println("La sonda no esta calibrada");
            return null;
        }
        // Simulamos la lectura con random de 0.0 a 5.0 °C (redondeado a 1 decimal)
        double temperatura = Math.random() * 5.0;
        return Math.round(temperatura * 10) / 10.0;
    }

}
