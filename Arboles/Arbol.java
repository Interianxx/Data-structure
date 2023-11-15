
/**
 * Esta clase representa un arbol general o binario dependiendo del tipo.
 * 
 * @param <T> Es un tipo de datos almacenados en el arbol.
 * @author Alema
 */
public class Arbol<T> {

    /*
     * NodoArbol raiz del arbol.
     * esBinario Indica si el arbol es binario o no.
     */

    private NodoArbol<T> raiz;
    private boolean esBinario = false;

    /*
     * @param dato Es el valor para la raiz del arbol.
     * 
     * @param esBinario Es verdadero si el arbol es binario, Falso si es general.
     */

    public Arbol(T dato, boolean esBinario) {
        raiz = new NodoArbol<T>(dato);
        raiz.setEsBinario(esBinario);
        this.esBinario = esBinario;
    }

    public NodoArbol<T> obtenerRaiz() {
        return raiz;
    }

    public boolean esBinario() {
        return esBinario;
    }

    public void agregarNodoArbol(NodoArbol<T> nodoRaiz, NodoArbol<T> nodoAgregado) {
        if (esBinario) {
            nodoAgregado.setEsBinario(esBinario);
        }

        nodoRaiz.agregarHijo(nodoAgregado);
    }

    /*
     * Imprime el arbol en el recorrido especificado.
     * 
     * @param recorrido Es el tiempo de recorrido a utiliza ya se Prefijo, Infijo o
     * Posfijo.
     */
    public void imprimirArbol(Recorrido recorrido) {
        switch (recorrido.ordinal()) {
            case 0:
                System.out.println("Prefijo: ");
                raiz.imprimirEnPrefijo();
                break;

            case 1:
                System.out.println("\nInfijo: ");
                raiz.imprimirEnInfijo();
                break;

            case 2:
                System.out.println("\nPosfijo: ");
                raiz.imprimirEnPosfijo();
                break;

            default:
                break;
        }
    }

    public boolean estaVacio() {
        return raiz == null;
    }

    /*
     * Calcula la altura del arbol
     */
    private int calcularAltura(NodoArbol<T> nodo) {
        if (nodo == null) {
            return 0;
        } else {
            NodoArbol<T> hijo = nodo.obtenerPrimerHijo();
            int alturaMaxima = 0;
            while (hijo != null) {
                int alturaHijo = calcularAltura(hijo);
                alturaMaxima = Math.max(alturaMaxima, alturaHijo);
                hijo = hijo.obtenerSiguienteHermano();
            }
            return alturaMaxima + 1;
        }

    }

    /*
     * Obtiene la altura del arbol
     */
    public int alturaArbol() {

        return calcularAltura(raiz);
    }
    /*
     * Imprime el sub-arbol desde la raiz
     */

    public void imprimirSubArbol() {
        raiz.imprimirSubArbol();
    }

}
