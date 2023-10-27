
import java.util.Random;

public class BusquedaBinaria {

    public static int[] radixSort(int[] arr) {
        int length = arr.length;
        int max = getMax(arr, length);

        for (int exponente = 1; max / exponente > 0; exponente *= 10) {
            ordeningSort(arr, length, exponente);
            imprimirArreglo(arr);
        }

        return arr;
    }

    public static int getMax(int[] arr, int length) {
        int max = arr[0];
        for (int i = 1; i < length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int ordeningSort(int[] arr, int length, int exponente) {
        int[] salida = new int[length + 1];
        int[] orden = new int[10];

        for (int i = 0; i < length; i++) {
            orden[(arr[i] / exponente) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            orden[i] += orden[i - 1];
        }

        for (int i = length - 1; i >= 0; i--) {
            salida[orden[(arr[i] / exponente) % 10] - 1] = arr[i];
            orden[(arr[i] / exponente) % 10]--;
        }

        for (int i = 0; i < length; i++) {
            arr[i] = salida[i];
        }

        return length;
    }

    public static void generarNumerosAleatorios(int[] arreglo) {
        Random numerosaleatorios = new Random();

        for (int i = 0; i < arreglo.length; i++) {
            int nuevoNumero;

            do {
                nuevoNumero = numerosaleatorios.nextInt(100);
            } while (yaExisteEnArreglo(arreglo, nuevoNumero, i));

            arreglo[i] = nuevoNumero;
        }
    }

    private static boolean yaExisteEnArreglo(int[] arreglo, int valor, int hastaIndex) {
        for (int i = 0; i < hastaIndex; i++) {
            if (arreglo[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public static void imprimirArreglo(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int busquedaBinaria(int[] arr, int numero) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (arr[medio] == numero) {
                return medio;
            } else if (arr[medio] < numero) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }

}

