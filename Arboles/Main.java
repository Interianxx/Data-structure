
/**
 * Clase principal que es el metodo main para correr la implementacion del
 * arbol.
 * En este ejemplo crearemos un arbol binario y no binario.
 * 
 * @author Alema
 */
public class Main {

    /**
     * Se crea un arbol y se le asignan los nodos del A a la Q, asginandolas como
     * hijas.
     * 
     * @param arbol        Creacion del arbol no binario.
     * @param ArbolBinario Creacion del arbol binario.
     * @param alturaArbol  Se guarda el valor de la altura dentro de esta variable
     *                     entera.
     */
    public static void main(String[] args) {
        // Se crea un arbol no binario.
        Arbol<String> arbol = new Arbol("A", false);

        // Se crean los nodos.
        NodoArbol<String> nodoB = new NodoArbol<>("B");
        NodoArbol<String> nodoC = new NodoArbol<>("C");
        NodoArbol<String> nodoD = new NodoArbol<>("D");
        NodoArbol<String> nodoE = new NodoArbol<>("E");
        NodoArbol<String> nodoF = new NodoArbol<>("F");
        NodoArbol<String> nodoG = new NodoArbol<>("G");
        NodoArbol<String> nodoH = new NodoArbol<>("H");
        NodoArbol<String> nodoI = new NodoArbol<>("I");
        NodoArbol<String> nodoJ = new NodoArbol<>("J");
        NodoArbol<String> nodoK = new NodoArbol<>("K");
        NodoArbol<String> nodoL = new NodoArbol<>("L");
        NodoArbol<String> nodoM = new NodoArbol<>("M");
        NodoArbol<String> nodoN = new NodoArbol<>("N");
        NodoArbol<String> nodoO = new NodoArbol<>("O");
        NodoArbol<String> nodoP = new NodoArbol<>("P");
        NodoArbol<String> nodoQ = new NodoArbol<>("Q");

        // Se asignan los nodos a la raiz.
        arbol.agregarNodoArbol(arbol.obtenerRaiz(), nodoB);
        arbol.agregarNodoArbol(arbol.obtenerRaiz(), nodoC);
        arbol.agregarNodoArbol(arbol.obtenerRaiz(), nodoD);

        // Se asignan los nodos a partir de la imagen proporcionada por el profesor.
        arbol.agregarNodoArbol(nodoB, nodoE);
        arbol.agregarNodoArbol(nodoB, nodoF);
        arbol.agregarNodoArbol(nodoF, nodoJ);
        arbol.agregarNodoArbol(nodoF, nodoK);
        arbol.agregarNodoArbol(nodoF, nodoL);
        arbol.agregarNodoArbol(nodoD, nodoG);
        arbol.agregarNodoArbol(nodoD, nodoH);
        arbol.agregarNodoArbol(nodoD, nodoI);
        arbol.agregarNodoArbol(nodoG, nodoM);
        arbol.agregarNodoArbol(nodoI, nodoN);
        arbol.agregarNodoArbol(nodoI, nodoO);
        arbol.agregarNodoArbol(nodoM, nodoP);
        arbol.agregarNodoArbol(nodoM, nodoQ);

        // Se imprime el arbol no binario en tres recorridos.
        System.out.println("Arbol no binario");
        arbol.imprimirArbol(Recorrido.PREFIJO);
        arbol.imprimirArbol(Recorrido.INFIJO);
        arbol.imprimirArbol(Recorrido.POSFIJO);

        // Esta condicion comprueba si el arbol esta vacio.
        if (arbol.estaVacio()) {

            System.out.println("\nEl arbol esta vacio");
        } else {
            System.out.println("\nEl arbol no esta vacio");
        }

        // Obtenemos la altura del arbol no binario.
        int alturaArbol = arbol.alturaArbol();
        System.out.println("La altura del arbol es: " + alturaArbol);

        // Imprimimos el sub-arbol a partir del nodoB.
        System.out.println("Imprimir el sub-arbol");
        nodoB.imprimirSubArbol();

        // A partir de este punto se iniciar e arbol binario.
        System.out.println("\nArbol binario");

        // Se crea un arbol binario.
        Arbol<String> ArbolBinario = new Arbol("A", true);

        // Se crean los nodos.
        NodoArbol<String> NodoB2 = new NodoArbol<>("B");
        NodoArbol<String> NodoC2 = new NodoArbol<>("C");
        NodoArbol<String> NodoD2 = new NodoArbol<>("D");
        NodoArbol<String> NodoE2 = new NodoArbol<>("E");
        NodoArbol<String> NodoF2 = new NodoArbol<>("F");
        NodoArbol<String> NodoG2 = new NodoArbol<>("G");
        NodoArbol<String> NodoH2 = new NodoArbol<>("H");
        NodoArbol<String> NodoI2 = new NodoArbol<>("I");
        NodoArbol<String> NodoJ2 = new NodoArbol<>("J");
        NodoArbol<String> NodoK2 = new NodoArbol<>("K");
        NodoArbol<String> NodoL2 = new NodoArbol<>("L");
        NodoArbol<String> NodoM2 = new NodoArbol<>("M");
        NodoArbol<String> NodoN2 = new NodoArbol<>("N");
        NodoArbol<String> NodoO2 = new NodoArbol<>("O");
        NodoArbol<String> NodoP2 = new NodoArbol<>("P");
        NodoArbol<String> NodoQ2 = new NodoArbol<>("Q");

        // Se le asigna el nodo B2 a la raiz.
        ArbolBinario.agregarNodoArbol(ArbolBinario.obtenerRaiz(), NodoB2);

        // Se asignan los nodos a partir de la conversion del arbol general a binario.
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

        // Se imprime el ArbolBinario en tres recorridos.
        ArbolBinario.imprimirArbol(Recorrido.PREFIJO);
        ArbolBinario.imprimirArbol(Recorrido.INFIJO);
        ArbolBinario.imprimirArbol(Recorrido.POSFIJO);

        // Comprueba si el ArbolBinario se encuentra vacio.
        if (ArbolBinario.estaVacio()) {

            System.out.println("\nEl arbol esta vacio");
        } else {
            System.out.println("\nEl arbol no esta vacio");
        }

        // Imprimimos la altura del ArbolBinario.
        System.out.println("La altura del arbol es " + ArbolBinario.alturaArbol());

        // Imprimimos el sub-arbol a partir del nodoB2.
        System.out.println("Imprimir el sub-arbol ");
        NodoB2.imprimirSubArbol();
    }

}
