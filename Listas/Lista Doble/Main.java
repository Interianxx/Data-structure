package ListaDoble;

/**
 *
 * @author Alema
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDoblementeEnlazada lista1 = new ListaDoblementeEnlazada();
        lista1.insertar(5); //0
        lista1.insertar(59); //1
        lista1.insertar(91); //2
        lista1.insertar(-17); //3
        lista1.insertar(73); //4
        lista1.insertar(34); //5
        lista1.insertar(40);  //6
        
        lista1.eliminar(2);
        lista1.eliminar(3);
        
        System.out.println("El indice a imprimir es " + lista1.obtener(3));
        System.out.println("El indice a imprimir es " + lista1.obtener(4));
    }
    
}
