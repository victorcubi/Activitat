import java.util.Arraylist;

public class Red {
    private ArrayList<Nodo>
    void agregarNodo(Nodo n){

    }
    
    void conectar(Nodo a, Nodo b){
        a.connectar(b);
        b.connectar(a);
    }

    void mostrar(){
        System.out.println("--- GRAFO ---")
        for (Nodo n : nodos){
            System.out.println( n + " --> "+
        }
    }
}
