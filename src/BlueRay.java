public class BlueRay extends Storage {

    public BlueRay(String nombre, double capacidad, String[] contenido, String tipo) {
        super(nombre, capacidad, contenido, tipo);
    }

    @Override
    public String gira() {
        return super.gira();
    }

    @Override
    public String almacenarDatos(String data) {
        return super.almacenarDatos(data);
    }

    @Override
    public String tipoEscritura() {
        return ("Escritura de datos por laser");
    }

    @Override
    public String tipoLectura() {
        return ("Usando un lector laser");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
