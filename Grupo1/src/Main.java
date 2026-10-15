public class Main {
    public static void main(String[] args) {

        // Paso 1: Recepcion de lote -> se abre el formulario de control de calidad
        FormularioControlCalidad formulario1 = new FormularioControlCalidad("2026-10-14", "L-2026-A");

        // Paso 2: Asignacion del analista de turno
        Analista analista1 = new Analista();
        analista1.setCodigoEmpleado("QA-02");
        analista1.setNombre("Maria Lopez");
        analista1.setFechaInicioMuestra("2026-10-14");
        formulario1.setAnalista(analista1);

        // Producto que se va a evaluar
        Producto producto1 = new Producto("ATUN", "ALBACORA 70 - 120 Lb");

        // Paso 3: Preparar la sonda de temperatura calibrada
        SondaTemperatura sonda1 = new SondaTemperatura();
        sonda1.setCodigo("SONDA-01");
        sonda1.setCalibrada(true);

        // Pasos 3 y 4: Muestrear 15 pescados, medir temperatura y validar condicion
        for (int i = 1; i <= 15; i++) {
            Muestra muestra = new Muestra();
            muestra.setProducto(producto1);
            muestra.setTemperatura(sonda1.leerTemperatura()); // Valida automaticamente (<= 4.0 °C)

            System.out.println("Muestra " + i + ": " + muestra.getProducto().getNombre() +
                    ", Temp: " + muestra.getTemperatura() + " °C" +
                    ", Resultado: " + muestra.getResultado());

            // Se registran aptas y no aptas para el balance final
            formulario1.agregarMuestra(muestra);
        }

        // Paso 5: Registro y cierre del analisis
        formulario1.cerrarAnalisis();

    }

}
