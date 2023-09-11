package Lista_Tipo_Pila;

/**
 *
 * @author Alema
 */
public class Pila {

    private Nodo cima;
    private int tamano;

    public Pila() {
        this.cima = null;
        this.tamano = 0;
    }

    //Insertar un elemento en la cima
    public void empujar(int dato) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);
        if (cima == null) {
            cima = nuevoNodo;
        } else {
            nuevoNodo.setNodo(cima);
            cima = nuevoNodo;
        }
        tamano++;
    }

    //Metodo para eliminar el ultimo elemento de la cima
    public Integer eliminar() {
        if (cima == null) {
            System.out.println("La pila esta vacia");
            return null;
        } else {
            Integer datoCima = cima.getDato();
            cima = cima.getNodo();
            tamano--;
            return datoCima;
        }
    }

    //Metodo para comprobar si la pila se encuentra vacia devolviendo un false o un true
    public boolean estaVacio() {
        return cima == null;
    }

    //Metodo para vaciar la pila
    public void vaciarPila() {
        cima = null;
        tamano = 0;
    }
    
    //Metodo para visualizar el ultimo elemento en la cima
    public Integer verCima() {
        if (cima == null) {
            System.out.println("La pila esta vacia");
            return null;
        } else {
            return cima.getDato();
        }
    }
    
    //Metodo para retornar el numer de elementos de la pila
    public int getTamano() {
        return tamano;
    }

}
