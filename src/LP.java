public class LP extends Storage{

    public LP(String nombre, double capacidad, String[] contenido, String tipo) {
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
        return ("Usando un torno que vibra");
    }

    @Override
    public String tipoLectura() {
        return ("Usando un tocadiscos");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
