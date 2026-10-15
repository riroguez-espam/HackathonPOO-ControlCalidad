public class Balanza {

    //Atributos
     private String ip;
     private String nombre;

     //Getters y Setters
    public String getIp() {
        return ip;}
        public void setIp(String ip) {
        //Validamos que la ip cumpla con el formato de una ip
        if (!ip.matches("\\b(?:\\d{1,3}\\.){3}\\d{1,3}\\b")) {
            System.out.println("La ip no cumple con el formato de una ip");
            return;
        } else {
            this.ip = ip;
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

    //Constructor
    public Balanza() {

    }

    //Metodo para leer el peso actual de la balanza (FUNCIONALIDAD)
    public Double leerPesoActual(){
        //Simulamos lectura de peso actual de la balanza con ramdom de 70 a 120
        double pesoActual = 70 + Math.random() * 50;
        return pesoActual;
    }


    
}
