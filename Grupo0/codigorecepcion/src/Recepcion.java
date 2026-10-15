import java.util.List;

public class Recepcion {

    //Atributos
    private String fecha;
    private Barco barco;
    private Camion camion;
    private Digitador digitador;
    private List<RecepcionDetalle> detalles;

    //Getters y Setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public Camion getCamion() {
        return camion;
    }

    public void setCamion(Camion camion) {
        this.camion = camion;
    }

    public Digitador getDigitador() {
        return digitador;
    }

    public void setDigitador(Digitador digitador) {
        this.digitador = digitador;
    }

    //Constructor
    public Recepcion() {

    }

    public Recepcion(String fecha, Barco barco, Camion camion, Digitador digitador) {
        this.fecha = fecha;
        this.barco = barco;
        this.camion = camion;
        this.digitador = digitador;
    }


    //Agregar detalles a la recepcion
    public void agregarDetalle(RecepcionDetalle detalle) {

        if (detalles == null) {
            //Generar lista de detalles vacia
            detalles = new java.util.ArrayList<RecepcionDetalle>();
        }

        detalles.add(detalle);
    }

    //Mostrar detalles de la recepcion
    public List<RecepcionDetalle> getDetalles() {
       
        if (detalles == null) {
            System.out.println("No hay detalles de la recepcion");
            return null;
        }

        return detalles;
    }
    
}
