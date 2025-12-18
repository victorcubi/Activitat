import java.util.ArrayList;

public class Nodo {
    private String nombre;
    String ip;
    boolean firewall;
    boolean vulnerable;
    boolean comprometido;
    private ArrayList<Nodo> vecinos;

    Nodo(String nombre, String ip, boolean firewall, boolean vulnerable) {
        this.nombre = nombre;
        this.vecinos = new ArrayList<>();
    }

        
    void conectar(Nodo otro) {
        if(!vecinos.contains(otro))
            vecinos.add(otro);
    }

    public String getNombre(){
        return nombre;
    }
    
    public String getVecinos(){
        String tmp = "";

        for(Nodo v : vecinos){
            tmp += "[" + v.getNombre() + "] - ";
        }


        return tmp;
    }



    @Override
    public String toString() {
        // TODO: devolver algo tipo:
        // "WebServer (172.16.0.10) [VULN] [PWN]" etc.
        return "";
    }
}