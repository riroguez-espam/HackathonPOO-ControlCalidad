

public class RecepcionDetalle {

    private Balanza balanza;
    private Producto producto;
    private Double peso;

    //Getters y Setters
    public Balanza getBalanza() {
        return balanza;
    }

    public void setBalanza(Balanza balanza) {
        this.balanza = balanza;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    //Constructor
    public RecepcionDetalle() {


    }

    //Metodo para validar si el peso del producto esta dentro del rango permitido
    public boolean validarPeso() {
        if (peso >= producto.getPesoMinimo() && peso <= producto.getPesoMaximo()) {
            return true;
        } else {
            return false;
        }
    }

    

}

