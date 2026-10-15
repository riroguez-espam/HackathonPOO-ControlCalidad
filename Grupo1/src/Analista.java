import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Analista {

    // Atributos
    private String codigoEmpleado;
    private String nombre;
    private String fechaInicioMuestra;

    // Getters y Setters
    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        // Validamos el formato del código de calidad (ej: QA-02)
        if (codigoEmpleado == null || !codigoEmpleado.matches("QA-\\d{2}")) {
            System.out.println("El codigo de empleado debe tener el formato QA-00");
            return;
        } else {
            this.codigoEmpleado = codigoEmpleado;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        // Validamos que el nombre no este vacio
        if (nombre == null || nombre.isBlank()) {
            System.out.println("El nombre no puede estar vacio");
            return;
        } else {
            this.nombre = nombre;
        }
    }

    public String getFechaInicioMuestra() {
        return fechaInicioMuestra;
    }

    public void setFechaInicioMuestra(String fechaInicioMuestra) {
        // Validamos que sea una fecha real (yyyy-MM-dd) para la trazabilidad
        try {
            LocalDate.parse(fechaInicioMuestra);
            this.fechaInicioMuestra = fechaInicioMuestra;
        } catch (DateTimeParseException | NullPointerException e) {
            System.out.println("La fecha de inicio debe ser valida (yyyy-MM-dd)");
        }
    }

    // Constructor
    public Analista() {

    }

}
