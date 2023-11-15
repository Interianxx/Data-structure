
/**
 *
 * @author Alema
 */
public class Arbol<T> {

    private NodoArbol<T> raiz;
    private boolean esBinario = false;

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

    public int alturaArbol() {

        return calcularAltura(raiz);
    }

    public void imprimirSubArbol() {
        raiz.imprimirSubArbol();
    }

}
