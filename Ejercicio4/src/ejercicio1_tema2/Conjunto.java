package ejercicio1_tema2;

public class Conjunto extends Coleccion{
    //Constructor sin argumentos
    public Conjunto(){
        super();
    }

    @Override
    public void anyadir(Punto p){
        if(!contiene(p)){
            super.anyadir(p);
        }
    }

}
