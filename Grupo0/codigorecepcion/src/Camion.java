public class Camion {

    //Atributos
    private String placa;

    //getters y setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        //Validamos que la placa no este vacia
        if (placa.isEmpty()) {
            System.out.println("La placa no puede estar vacia");
            return;
        } else {
            this.placa = placa;
        }
    }

    //Constructor
    public Camion() {

    }
    
}
