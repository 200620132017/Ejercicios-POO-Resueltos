package Model;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private int iId;
    private String sNombre;
    private List<Persona> listaPersonas;

    public Biblioteca(int sId, String sNombre) {
        this.iId = sId;
        this.sNombre = sNombre;
        this.listaPersonas = new ArrayList<>();
    }

    public int getsId() {
        return iId;
    }

    public String getsNombre() {
        return sNombre;
    }

    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }

    //CRUD -> ADD , READ , UPDATE , DELETE

    public boolean addPersona(Persona p) {
        if(p==null)return false;
        if(listaPersonas.contains(p))return false;
        return this.listaPersonas.add(p);
    }
    public boolean removePersona(String dni) {
        for(Persona p: this.listaPersonas){
            if(p.getsDni().equals(dni)){
                return this.listaPersonas.remove(p);
            }
        }
        return false;
    }
    //devolver lista personas
    public List <Persona> listar() {
        return this.listaPersonas;
    }
    //listar persona concreto
    public Persona getPersona(String dni) {
        for(Persona p: this.listaPersonas){
            if(p.getsDni().equals(dni)){
                return p;
            }
        }
        return null;
    }
}
