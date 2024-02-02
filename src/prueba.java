import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        String[] contenido = new String[4];
        String[] contenido2 = new String[4];
        String valor = "archivo4";

        CD cd = new CD("C", 250, contenido, "CD");

        DiscoDuro discoDuro= new DiscoDuro("D", 500, contenido2, "DiscoDuro");
        LP Lp= new LP("LP", 50, contenido2, "vinilo");
        BlueRay blueray= new BlueRay("Blueray", 1000, contenido2, "Blueray");

        System.out.println(cd.gira());
        System.out.println(cd.almacenarDatos("archivo1"));
        System.out.println(cd.almacenarDatos("archivo2"));
        System.out.println(cd.almacenarDatos("archivo1"));
        System.out.println(cd.tipoEscritura());
        System.out.println(cd.tipoLectura());
        System.out.println(cd.toString());

        System.out.println("------------------------------------");

        System.out.println(discoDuro.gira());
        System.out.println(discoDuro.almacenarDatos("archivo3"));
        System.out.println(discoDuro.almacenarDatos("archivo4"));
        System.out.println(discoDuro.almacenarDatos("archivo5"));
        System.out.println(discoDuro.tipoEscritura());
        System.out.println(discoDuro.tipoLectura());
        System.out.println(discoDuro.toString());

        System.out.println("------------------------------------");

        System.out.println(Lp.gira());
        System.out.println(Lp.almacenarDatos("archivo3"));
        System.out.println(Lp.almacenarDatos("archivo4"));
        System.out.println(Lp.almacenarDatos("archivo5"));
        System.out.println(Lp.tipoEscritura());
        System.out.println(Lp.tipoLectura());
        System.out.println(Lp.toString());

        System.out.println("------------------------------------");

        System.out.println(blueray.gira());
        System.out.println(blueray.almacenarDatos("archivo3"));
        System.out.println(blueray.almacenarDatos("archivo4"));
        System.out.println(blueray.almacenarDatos("archivo5"));
        System.out.println(blueray.tipoEscritura());
        System.out.println(blueray.tipoLectura());
        System.out.println(blueray.toString());


    }
}
