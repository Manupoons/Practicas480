public class DiscoDuro extends Storage{

    public DiscoDuro(String nombre, double capacidad, String[] contenido, String tipo) {
        super(nombre, capacidad, contenido, tipo);
    }

    @Override
    public String gira() {
        return ("DiscoDuro Girando");
    }

    @Override
    public String almacenarDatos(String data) {
        return super.almacenarDatos(data);
    }

    @Override
    public String tipoEscritura() {
        return ("Escritura de datos por cabezal magnetico");
    }

    @Override
    public String tipoLectura() {
        return ("Lectura de datos por cabezal magnetico");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
