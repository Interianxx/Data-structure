package ListaSimple;

/**
 *
 * @author Alema
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ListaSimplementeEnlazada listaSimple2 = new ListaSimplementeEnlazada();
        listaSimple2.insertar(5); //0
        listaSimple2.insertar(59); //1
        listaSimple2.insertar(91); //2
        listaSimple2.insertar(-17); //3
        listaSimple2.insertar(73); //4
        listaSimple2.insertar(34); //5
        listaSimple2.insertar(40);  //6
        
        listaSimple2.eliminar(2);
        listaSimple2.eliminar(3);
        
        System.out.println("El indice a imprimir es " + listaSimple2.obtener(3));
    }
}
