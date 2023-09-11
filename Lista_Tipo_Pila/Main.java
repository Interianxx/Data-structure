package Lista_Tipo_Pila;

/**
 * Pilas basadas en arreglos 
 * Interian Pech Jose Alejandro //  Ingenieria en tecnologia de software
 * @author Alema 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciar a la clase pila
        Pila pila1 = new Pila();

        //Se crea un arreglo de numeros para almacenar los numeros
        int[] numeros = {14, 27, 1, 15, 10, 90, 71, 37, 2, 46};
        for (int num : numeros) {
            pila1.empujar(num);
        }
        
        //Se imprime el tamaño de la pila
        System.out.println("Tamano de la pila: " + pila1.getTamano());
        
        //Se eliminan 4 elementos de la pila 
        for (int i = 0; i < 4; i++) {
            pila1.eliminar();
        }
        
        //Se imprime el elemento de la cima en este caso el 90
        System.out.println("Elemento de la cima de la pila: " + pila1.verCima());
        
        //Se vacia la pila
        pila1.vaciarPila();
        
        //Se confirmara con el metodo estaVacio si en efecto la pila esta vacia :D
        System.out.println("La  pila esta vacia? " + (pila1.estaVacio() ? "En efecto esta vacia" : "En efecto no esta vacia"));
    }
}
