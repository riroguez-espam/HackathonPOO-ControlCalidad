public class Producto {

    //Atributos
    private String especie;
    private String nombre;
    private int pesoMinimo;
    private int pesoMaximo;

    // Constructor
    public Producto(String especie, String nombre, int pesoMinimo, int pesoMaximo) {
        this.especie = especie;
        this.nombre = nombre;
        this.pesoMinimo = pesoMinimo;
        this.pesoMaximo = pesoMaximo;
    }

    // Getters y Setters
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        // Validamos que la especie no este vacia
        if (especie.isEmpty()) {
            System.out.println("La especie no puede estar vacia");
            return;
        } else {
            this.especie = especie;
        }
    }

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

    public int getPesoMinimo() {
        return pesoMinimo;
    }

    public void setPesoMinimo(int pesoMinimo) {
        // Validamos que el peso minimo no sea negativo
        if (pesoMinimo < 0) {
            System.out.println("El peso minimo no puede ser negativo");
            return;
        } else {
            this.pesoMinimo = pesoMinimo;
        }
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(int pesoMaximo) {
        // Validamos que el peso maximo no sea negativo
        if (pesoMaximo < 0) {
            System.out.println("El peso maximo no puede ser negativo");
            return;
        } else {
            this.pesoMaximo = pesoMaximo;
        }
    }

    

}
