public class Digitador {
    
    //Atributos
    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;

    //Getters y Setters
    public int getEdad() {
        return edad;
    }

    //Validamos que la edad sea entre 18 y 65 años
    public void setEdad(int edad) {
        if (edad < 18 || edad > 65) {
            System.out.println("La edad debe estar entre 18 y 65 años");
            return;
        } else {
            this.edad = edad;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        //Validamos que el nombre no este vacio
        if (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacio");
            return;
        } else {
            this.nombre = nombre;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        //Validamos que el apellido no este vacio
        if (apellido.isEmpty()) {
            System.out.println("El apellido no puede estar vacio");
            return;
        } else {
            this.apellido = apellido;
        }
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        //Validamos que la cedula cumpla el formato de una cedula ecuatoriana
        if (!cedula.matches("\\d{10}")) {
            System.out.println("La cedula no cumple con el formato de una cedula ecuatoriana");
            return;
        } else {
            this.cedula = cedula;
        }
       
    }


    //Constructor
    public Digitador() {

    }
    
}
