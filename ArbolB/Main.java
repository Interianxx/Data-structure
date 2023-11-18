package Paquete1;

public class Main {

    public static void main(String[] args) {
        // Aqui creamos un Arbom con un orden 3
        ArbolB arbolB = new ArbolB(3);
        
        // Aqui creamos un arreglo de numeros que vamos a insertar en el arbol B
        int[] datosIniciales = {50, 35, 20, 45, 10, 18, 27, 80, 5, 120, 200, 800, 30};
        
        // Usamos un bucle for each en el cual vamos a insertar los datos del arreglo en el Arbol
        for (int dato : datosIniciales) {
            arbolB.insertar(arbolB, dato);
        }
        
        System.out.println("Arbol ordenado despues de insertar datos:");
        arbolB.imprimir(arbolB.raiz);
        System.out.println();
        
        // Creamos la llave a buscar
        int llaveBuscada = 7;
        System.out.println("Buscar nodo con llave " + llaveBuscada + ":");
        arbolB.imprimirNodoEspecifico(arbolB, llaveBuscada);
        System.out.println();

        int llaveEliminar = 35;
        System.out.println("Arbol B antes de eliminar la llave " + llaveEliminar + ":");
        arbolB.imprimir(arbolB.raiz);
        System.out.println("");
        arbolB.eliminarDato(arbolB, llaveEliminar);
        System.out.println("Arbol B despues de eliminar la llave " + llaveEliminar + ":");
        arbolB.imprimir(arbolB.raiz);
        System.out.println();

        int[] nuevosDatos = {120, 200, 800, 30};
        for (int dato : nuevosDatos) {
            arbolB.insertar(arbolB, dato);
        }

        System.out.println("Arbol B despues de nuevas inserciones:");
        arbolB.imprimir(arbolB.raiz);
    }
}
