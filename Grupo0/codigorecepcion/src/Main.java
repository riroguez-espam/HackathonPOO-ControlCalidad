
public class Main {
    public static void main(String[] args) {

        // Paso 1: Crear un objeto de la clase Barco
        Barco barco1 = new Barco();
        barco1.setNombre("Santa Isabel");
        barco1.setAnio(2026);
        barco1.setNumeroViaje(2);
        barco1.setPuertoLlegada("MANTA");

        // Paso 2: Crear un objeto de la clase Camion
        Camion camion1 = new Camion();
        camion1.setPlaca("ABC-123");

        // Paso 3: Crear un objeto de la clase Producto
        Producto producto1 = new Producto("ATUN", "ALBACORA 70 - 120 Lb", 70, 120);

        // Paso 4: Crear un objeto de la clase Balanza
        Balanza balanza1 = new Balanza();
        balanza1.setIp("192.168.1.1");
        balanza1.setNombre("Balanza Recepción de MP");

        // Paso 5: Crear objeto Digitador
        Digitador digitador1 = new Digitador();
        digitador1.setNombre("Juan");
        digitador1.setApellido("Perez");
        digitador1.setEdad(30);
        digitador1.setCedula("1234567890");

        // Paso 6: Crear objeto Recepcion
        Recepcion recepcion1 = new Recepcion("2026-10-12", barco1, camion1, digitador1);

        // Paso 7: Crear objeto RecepcionDetalle
        RecepcionDetalle detalle1 = new RecepcionDetalle();
        detalle1.setProducto(producto1);
        detalle1.setBalanza(balanza1);
        detalle1.setPeso(balanza1.leerPesoActual());

          // Paso 8: Validar el peso del producto
        if (detalle1.validarPeso()) {
            System.out.println("El peso del producto está dentro del rango permitido.");
            recepcion1.agregarDetalle(detalle1);
        } else {
            System.out.println("El peso del producto NO está dentro del rango permitido.");
        }


        //Detalle 2
        RecepcionDetalle detalle2 = new RecepcionDetalle();
        detalle2.setProducto(producto1);
        detalle2.setBalanza(balanza1);
        detalle2.setPeso(balanza1.leerPesoActual());
        if (detalle2.validarPeso()) {
            recepcion1.agregarDetalle(detalle2);
        } else {
            System.out.println("El peso del producto NO está dentro del rango permitido.");
        }

        

      
        // Paso 9: Mostrar detalles de la recepción
        System.out.println("Detalles de la recepción:");

        var detalles = recepcion1.getDetalles();
        if (detalles != null) {

            for (RecepcionDetalle detalle : detalles) {
                System.out.println("Producto: " + detalle.getProducto().getNombre() +
                        ", Peso: " + detalle.getPeso() + " Lb" +
                        ", Balanza: " + detalle.getBalanza().getNombre());
            }

        }

    }

}
