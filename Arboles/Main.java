/**
 *
 * @author Alema
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol<String> arbol = new Arbol("A", false);

        NodoArbol<String> nodoB = new NodoArbol<>("B");
        NodoArbol<String> nodoC = new NodoArbol<>("C");
        NodoArbol<String> nodoD = new NodoArbol<>("D");

        arbol.agregarNodoArbol(arbol.obtenerRaiz(), nodoB);
        arbol.agregarNodoArbol(arbol.obtenerRaiz(), nodoC);
        arbol.agregarNodoArbol(arbol.obtenerRaiz(), nodoD);

        NodoArbol<String> nodoE = new NodoArbol<>("E");
        NodoArbol<String> nodoF = new NodoArbol<>("F");

        arbol.agregarNodoArbol(nodoB, nodoE);
        arbol.agregarNodoArbol(nodoB, nodoF);

        NodoArbol<String> nodoJ = new NodoArbol<>("J");
        NodoArbol<String> nodoK = new NodoArbol<>("K");
        NodoArbol<String> nodoL = new NodoArbol<>("L");

        arbol.agregarNodoArbol(nodoF, nodoJ);
        arbol.agregarNodoArbol(nodoF, nodoK);
        arbol.agregarNodoArbol(nodoF, nodoL);

        NodoArbol<String> nodoG = new NodoArbol<>("G");
        NodoArbol<String> nodoH = new NodoArbol<>("H");
        NodoArbol<String> nodoI = new NodoArbol<>("I");

        arbol.agregarNodoArbol(nodoD, nodoG);
        arbol.agregarNodoArbol(nodoD, nodoH);
        arbol.agregarNodoArbol(nodoD, nodoI);

        NodoArbol<String> nodoM = new NodoArbol<>("M");
        NodoArbol<String> nodoN = new NodoArbol<>("N");
        NodoArbol<String> nodoO = new NodoArbol<>("O");

        arbol.agregarNodoArbol(nodoG, nodoM);
        arbol.agregarNodoArbol(nodoI, nodoN);
        arbol.agregarNodoArbol(nodoI, nodoO);

        NodoArbol<String> nodoP = new NodoArbol<>("P");
        NodoArbol<String> nodoQ = new NodoArbol<>("Q");

        arbol.agregarNodoArbol(nodoM, nodoP);
        arbol.agregarNodoArbol(nodoM, nodoQ);

        System.out.println("Recorrido en Prefijo:");
        arbol.imprimirArbol(Recorrido.PREFIJO);
        System.out.println("\nRecorrido en Infijo:");
        arbol.imprimirArbol(Recorrido.INFIJO);
        System.out.println("\nRecorrido en Posfijo");
        arbol.imprimirArbol(Recorrido.POSFIJO);

        if (arbol.estaVacio()) {

            System.out.println("\nEl arbol esta vacio");
        } else {
            System.out.println("\nEl arbol no esta vacio");
        }
    }
}
