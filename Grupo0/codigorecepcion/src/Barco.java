public class Barco {

    // Atributos
    private String nombre;
    private int anio;
    private int numeroViaje;
    private String puertoLlegada;

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        // Validamos que el nombre no este vacio
        if (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacio");
            return;
        } else {
            this.nombre = nombre;
        }
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        // Validamos que el año no sea negativo
        if (anio < 0) {
            System.out.println("El año no puede ser negativo");
            return;
        } else {
            this.anio = anio;
        }

    }

    public int getNumeroViaje() {
        return numeroViaje;
    }

    public void setNumeroViaje(int numeroViaje) {
        this.numeroViaje = numeroViaje;
    }

    public String getPuertoLlegada() {
        return puertoLlegada;
    }

    public void setPuertoLlegada(String puertoLlegada) {
        this.puertoLlegada = puertoLlegada;
    }

    // Constructor
    public Barco() {

    }


    

}
