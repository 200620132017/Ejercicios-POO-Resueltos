package ejercicio1_tema2;

import java.util.ArrayList;

public class Coleccion {
    private ArrayList<Punto> puntos;

    public Coleccion(){
        puntos = new ArrayList<>();
    }

    public int numElem(){
        return puntos.size();
    }

    public boolean vacia(){
        return puntos.isEmpty();
    }

    public void vaciar(){
        puntos.clear();
    }

    public void anyadir(Punto p){
        puntos.add(p);
    }

    public void eliminar(Punto p){
        puntos.remove(p);
    }

    public boolean contiene(Punto p){
        return puntos.contains(p);
    }

    @Override
    public String toString() {
        return puntos.toString();
    }
}
