
import java.util.Scanner;

/**
 *
 * @author Alema
 */
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] arrToRadixSort = new int[999];
        char Continuar;

        BusquedaBinaria.generarNumerosAleatorios(arrToRadixSort);

        System.out.println("Arreglo de 1000 numeros ordenados con RadixSort");
        System.out.print("Arreglo original: ");
        BusquedaBinaria.imprimirArreglo(arrToRadixSort);

        System.out.println("\nOrdenando arreglo: ");
        BusquedaBinaria.radixSort(arrToRadixSort);

        System.out.print("\nArreglo ordenado: ");
        BusquedaBinaria.imprimirArreglo(arrToRadixSort);

        do {
            System.out.print("\nDigite el numero a buscar en el arreglo: ");
            int numeroBuscar = entrada.nextInt();

            int posicion = BusquedaBinaria.busquedaBinaria(arrToRadixSort, numeroBuscar);
            if (posicion != -1) {
                System.out.println("El numero " + numeroBuscar + " fue encontrado en la posicion " + (posicion - 1) + ".");
            } else {
                System.out.println("El numero " + numeroBuscar + " no fue encontrado en el arreglo.");
            }
            System.out.print("Desea buscar otro numero Y/N: ");
            Continuar = entrada.next().charAt(0);

        } while (Character.toUpperCase(Continuar) == 'Y');

    }

}
