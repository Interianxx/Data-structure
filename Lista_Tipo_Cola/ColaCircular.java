package Lista_Tipo_Cola;

/**
 *
 * @author Alema
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Cola simple");
        ColaSimple cola = new ColaSimple();
        //Como no hay nodos simplemente devuelve null
        System.out.println("Frente: " + cola.getFrente());
        
        
        /*for(int i = 1; i <= 5; i++){
            cola.insertar(i);
        }
        
        System.out.printf("Longitud: %d\n", cola.getLongitud());
        System.out.printf("Frente: %d\n", cola.getFrente().getDato());
        cola.eliminar();
        System.out.printf("Longitud: %d\n", cola.getLongitud());
        System.out.printf("Frente: %d\n", cola.getFrente().getDato());*/
        
        System.out.println("\nCola Circular");
        ColaCircular colaC = new ColaCircular();
        //Como no hay nodos simplemente devuelve null
        System.out.println("Frente: " + colaC.getFrente());
        
        /*for (int i = 2; i <= 10; i=i+2) {
            colaC.insertar(i);
        }
        
        System.out.printf("Longitud: %d\n", colaC.getLongitud());
        System.out.printf("Frente: %d\n", colaC.getFrente().getDato());
        System.out.printf("Atras: %d\n", colaC.getAtras().getDato());
        colaC.eliminar();
        System.out.printf("Longitud: %d\n", colaC.getLongitud());
        System.out.printf("Frente: %d\n", colaC.getFrente().getDato());
        System.out.printf("Atras: %d\n", colaC.getAtras().getDato());*/
    }

}
