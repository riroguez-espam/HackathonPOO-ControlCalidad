public class Producto {

    // Atributos
    private String especie;
    private String nombre;

    // Constructor
    public Producto(String especie, String nombre) {
        setEspecie(especie);
        setNombre(nombre);
    }

    // Getters y Setters
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        // Validamos que la especie no este vacia
        if (especie == null || especie.isBlank()) {
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
        if (nombre == null || nombre.isBlank()) {
            System.out.println("El nombre no puede estar vacio");
            return;
        } else {
            this.nombre = nombre;
        }
    }

}
