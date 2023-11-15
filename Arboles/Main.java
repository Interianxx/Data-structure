
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
        
        System.out.println("Arbol no binario");
        arbol.imprimirArbol(Recorrido.PREFIJO);
        arbol.imprimirArbol(Recorrido.INFIJO);
        arbol.imprimirArbol(Recorrido.POSFIJO);

        if (arbol.estaVacio()) {

            System.out.println("\nEl arbol esta vacio");
        } else {
            System.out.println("\nEl arbol no esta vacio");
        }

        int alturaArbol = arbol.alturaArbol();
        System.out.println("La altura del arbol es: " + alturaArbol);
        
        System.out.println("Imprimir el sub-arbol");
        nodoB.imprimirSubArbol();
        
        System.out.println("\nArbol binario");
        
        Arbol<String> ArbolBinario = new Arbol("A", true);
        
        NodoArbol <String> NodoB2 = new NodoArbol<>("B");
        NodoArbol <String> NodoC2 = new NodoArbol<>("C");
        NodoArbol <String> NodoD2 = new NodoArbol<>("D");
        NodoArbol <String> NodoE2 = new NodoArbol<>("E");
        NodoArbol <String> NodoF2 = new NodoArbol<>("F");
        NodoArbol <String> NodoG2 = new NodoArbol<>("G");
        NodoArbol <String> NodoH2 = new NodoArbol<>("H");
        NodoArbol <String> NodoI2 = new NodoArbol<>("I");
        NodoArbol <String> NodoJ2 = new NodoArbol<>("J");
        NodoArbol <String> NodoK2 = new NodoArbol<>("K");
        NodoArbol <String> NodoL2 = new NodoArbol<>("L");
        NodoArbol <String> NodoM2 = new NodoArbol<>("M");
        NodoArbol <String> NodoN2 = new NodoArbol<>("N");
        NodoArbol <String> NodoO2 = new NodoArbol<>("O");
        NodoArbol <String> NodoP2 = new NodoArbol<>("P");
        NodoArbol <String> NodoQ2 = new NodoArbol<>("Q");
        
        ArbolBinario.agregarNodoArbol(ArbolBinario.obtenerRaiz(), NodoB2);
        
        ArbolBinario.agregarNodoArbol(NodoB2, NodoE2);
        ArbolBinario.agregarNodoArbol(NodoB2, NodoC2);
        ArbolBinario.agregarNodoArbol(NodoE2, NodoF2);
        ArbolBinario.agregarNodoArbol(NodoF2, NodoJ2);
        ArbolBinario.agregarNodoArbol(NodoJ2, NodoK2);
        ArbolBinario.agregarNodoArbol(NodoK2, NodoL2);
        
        ArbolBinario.agregarNodoArbol(NodoC2, NodoD2);
        ArbolBinario.agregarNodoArbol(NodoD2, NodoG2);
        ArbolBinario.agregarNodoArbol(NodoG2, NodoM2);
        ArbolBinario.agregarNodoArbol(NodoG2, NodoH2);
        ArbolBinario.agregarNodoArbol(NodoM2, NodoP2);
        ArbolBinario.agregarNodoArbol(NodoP2, NodoQ2);
        
        ArbolBinario.agregarNodoArbol(NodoH2, NodoI2);
        ArbolBinario.agregarNodoArbol(NodoI2, NodoN2);
        ArbolBinario.agregarNodoArbol(NodoN2, NodoO2);
        
        ArbolBinario.imprimirArbol(Recorrido.PREFIJO);
        ArbolBinario.imprimirArbol(Recorrido.INFIJO);
        ArbolBinario.imprimirArbol(Recorrido.POSFIJO);
        
        if (ArbolBinario.estaVacio()) {

            System.out.println("\nEl arbol esta vacio");
        } else {
            System.out.println("\nEl arbol no esta vacio");
        }

        System.out.println("La altura del arbol es " + ArbolBinario.alturaArbol());
        System.out.println("Imprimir el sub-arbol ");
        NodoB2.imprimirSubArbol();
    }

}
