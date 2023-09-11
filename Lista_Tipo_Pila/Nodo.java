package Lista_Tipo_Pila;

/**
 *
 * @author Alema
 */
public class Nodo {
    //Atributos privados 
    private Integer dato;
    private Nodo nodo;
    
    //Constructor inicializados con valor nulo
    public Nodo() {
        this.dato = null;
        this.nodo = null;
    }
    
    //Getters y Setters para usar las variables
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }

}
