package ArbolB;

/**
 * Main
 */
public class ArbolB {
    private NodoB raiz;

    public ArbolB() {
        this.raiz = null;
    }

    public void insertar(int valor) {

    }

    public void eliminar(int valor) {

    }
}

/**
 * NodoB
 */
class NodoB {
    int[] valores;
    NodoB[] hijos;
    int n;
    boolean hoja;

    public NodoB(int t) {
        this.valores = new int[2 * t - 1];
        this.hijos = new NodoB[2 * t];
        this.n = 0;
        this.hoja = true;
    }

}
