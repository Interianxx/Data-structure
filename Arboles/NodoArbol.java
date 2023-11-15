
/**
 * Esta Clase representa un nodo en un árbol general o binario.
 * @param <T> Tipo de datos almacenado en el nodo.
 */
public class NodoArbol<T> {

    /**
     * @param dato Valor almacenado en el nodo.
     * @param esBinario Indica si el nodo es parte de un árbol binario.
     * @param primerHijo Primer hijo del nodo.
     * @param siguienteHermano Siguiente hermano del nodo.
     */

    private T dato;
    private boolean esBinario = false;
    private NodoArbol<T> primerHijo;
    private NodoArbol<T> siguienteHermano;

    public NodoArbol(T dato) {
        this.dato = dato;
        primerHijo = null;
        siguienteHermano = null;
    }

    public void agregarHijo(NodoArbol<T> hijo) {
        if (primerHijo == null) {
            primerHijo = hijo;
        } else {
            NodoArbol<T> hermano = this.primerHijo;

            if (esBinario) {
                if (hermano.siguienteHermano != null) {
                    System.err.println("El nodo ya tiene un hijo, no se debe agregar " + hijo.getDato());
                } else {
                    hermano.siguienteHermano = hijo;
                }
            } else {
                while (hermano.siguienteHermano != null) {
                    hermano = hermano.siguienteHermano;
                }
                hermano.siguienteHermano = hijo;
            }
        }
    }

    /**
     * Obtiene el primer hijo del nodo.
     *
     * @return NodoArbol que es el primer hijo del nodo.
     */
    public NodoArbol<T> obtenerPrimerHijo() {
        return primerHijo;
    }

    /**
     * Obtiene el siguiente hermano del nodo.
     *
     * @return NodoArbol que es el siguiente hermano del nodo.
     */
    public NodoArbol<T> obtenerSiguienteHermano() {
        return siguienteHermano;
    }

    /**
     * Obtiene el valor almacenado en el nodo.
     *
     * @return Valor almacenado en el nodo.
     */
    public T getDato() {
        return dato;
    }

    /**
     * Verifica si el nodo es parte de un árbol binario.
     *
     * @return True si el nodo es binario, False si es general.
     */
    public boolean esBinario() {
        return esBinario;
    }

    public void setEsBinario(boolean esBinario) {
        this.esBinario = esBinario;
    }

    /**
     * Imprime el sub-árbol de un nodo
     */
    public void imprimirSubArbol() {
        imprimirSubArbol(this, 0);
    }

    /**
     * Método para imprimir el sub-árbol desde un nodo dado.
     *
     * @param nodo NodoArbol que es la raíz del sub-árbol.
     * @param nivel Nivel de anidamiento del sub-árbol.
     */
    private void imprimirSubArbol(NodoArbol<T> nodo, int nivel) {
        if (nodo != null) {
            for (int i = 0; i < nivel; i++) {
                System.out.print("  ");
            }

            System.out.println(nodo.dato);
            imprimirSubArbol(nodo.primerHijo, nivel + 1);

            imprimirSubArbol(nodo.siguienteHermano, nivel);
        }
    }

    /**
     * Imprime el valor del nodo seguido de sus hijos en un recorrido de prefijo.
     */
    public void imprimirEnPrefijo() {
        System.out.print(dato + "\t");
        NodoArbol<T> hijo = primerHijo;

        while (hijo != null) {
            hijo.imprimirEnPrefijo();
            hijo = hijo.siguienteHermano;
        }
    }

    /**
     * Imprime el valor del nodo seguido de sus hijos en un recorrido de infijo.
     */
    public void imprimirEnInfijo() {
        NodoArbol<T> hijo = primerHijo;

        if (hijo != null) {
            hijo.imprimirEnInfijo();
        }

        System.out.print(dato + "\t");
        while (hijo != null) {
            hijo = hijo.siguienteHermano;
            if (hijo != null) {
                hijo.imprimirEnInfijo();
            }
        }
    }

    /**
     * Imprime el valor del nodo seguido de sus hijos en un recorrido de posfijo.
     */
    public void imprimirEnPosfijo() {
        NodoArbol<T> hijo = primerHijo;

        while (hijo != null) {
            hijo.imprimirEnPosfijo();
            hijo = hijo.siguienteHermano;
        }

        System.out.print(dato + "\t");
    }
}
