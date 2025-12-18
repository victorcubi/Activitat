import java.utils

public class Nodo {
     this.nombre = nombre;
     this vecinos = new ArrayList<>();

    Nodo(String nombre){
        ArrayList<Nodo> vecinos;
    }
    
    void conectar(Nodo otro){
        if(!vecinos.contains(otro))
            vecinos.add(otro);

    
    }

    public String getNombre(){
        return nombre;
    }
    public String getVecinos(){
        String tmp = "";

        for(Nodo v : vecinos){
            tmp + 
        }
    }
}
