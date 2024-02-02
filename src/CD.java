import java.util.Arrays;

public class CD extends Storage{
    public CD(String nombre, double capacidad, String[] contenido, String tipo) {
        super(nombre, capacidad, contenido, tipo);
    }

    @Override
    public String gira() {
        return ("CD Girando");
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
        return ("Lectura de datos por laser");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
