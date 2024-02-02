import java.util.Arrays;

public class Storage implements Features{

    public String nombre;
    public double capacidad;
    public String[] contenido;
    public String tipo;

    public Storage(String nombre, double capacidad, String[] contenido, String tipo) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.contenido = contenido;
        this.tipo = tipo;
    }

    public String gira(){
        return ("Girando");
    }

    public String almacenarDatos(String data) {
        for (int i = 0; i < contenido.length; i++) {
            if (contenido[i] == null) {
                contenido[i] = data;
                return "Datos guardados";
            } else if (contenido[i].equals(data)) {
                return "El dato ya está en la lista";
            }
        }
        return "La lista está llena, no se puede almacenar más datos";
    }

    public String tipoEscritura(){
        return ("");
    }

    public String tipoLectura(){
        return ("");
    }

    @Override
    public String toString() {
        return "Storage{" +
                "name='" + nombre + '\'' +
                ", capacity=" + capacidad +
                ", content=" + Arrays.toString(contenido) +
                ", type='" + tipo + '\'' +
                '}';
    }
}
