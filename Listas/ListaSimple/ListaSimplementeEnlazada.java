package ListaSimple;

/**
 *
 * @author Alema
 */
public class ListaSimplementeEnlazada {
    private Nodo primerNodo;
    private int longitud;

    public ListaSimplementeEnlazada() {
        primerNodo = null;
        longitud = 0;
    }
    public void insertar(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        if (primerNodo == null){
            primerNodo = nuevoNodo;
        } else {
            Nodo nodoActual = primerNodo;
            while (nodoActual.getSiguiente() != null){
                nodoActual = nodoActual.getSiguiente();
            }
            nodoActual.setSiguiente(nuevoNodo);
        }
        longitud++;
    }
    public void eliminar(int indice){
        if (indice < 0 || indice >= longitud){
            System.err.println("Indice fuera de rango");
            return;
        }
        if (indice ==0){
            primerNodo = primerNodo.getSiguiente();
        } else {
            Nodo nodoAnterior = primerNodo;
            for (int i = 0; i < indice - 1; i++) {
                nodoAnterior =nodoAnterior.getSiguiente();
            }
            Nodo nodoEliminar = nodoAnterior.getSiguiente();
            nodoAnterior.setSiguiente(nodoEliminar.getSiguiente());
        }
        
        longitud --;
        
    }
    
    public boolean estaVacia(){
        return primerNodo == null;
    }

    public Nodo getFrente() {
        return primerNodo;
    }

    public int getLongitud() {
        return longitud;
    }
    
    public int obtener (int indice){
        if (indice <0 || indice >= longitud){
            System.err.println("Indice fuera de rango");
            return -1;
        }
        
        Nodo actuaNodo = primerNodo;
        
        for (int i=0; i < indice; i++){
            actuaNodo = actuaNodo.getSiguiente();
        }
        return actuaNodo.getDato();
    }
    
    
    
}
