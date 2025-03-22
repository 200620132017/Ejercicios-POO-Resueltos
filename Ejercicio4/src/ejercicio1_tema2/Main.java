package ejercicio1_tema2;

public class Main {
    public static void main(String[] args) {
        Coleccion coleccion = new Coleccion();

        coleccion.anyadir(new Punto(1,1));
        System.out.println(coleccion);

        coleccion.anyadir(new Punto(1,4));
        System.out.println(coleccion);

        coleccion.anyadir(new Punto(2,3));
        System.out.println(coleccion);

        coleccion.anyadir(new Punto(1,4));
        System.out.println(coleccion);

        coleccion.eliminar(new Punto(1,4));
        System.out.println(coleccion);

        coleccion.eliminar(new Punto(5,5));
        System.out.println(coleccion);

        System.out.println("Numero de elementos: " + coleccion.numElem());

        coleccion.vaciar();
        System.out.println(coleccion);
    }
}
