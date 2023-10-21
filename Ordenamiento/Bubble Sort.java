/**
 *
 * @author Alema
 */
import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // intercambia arr[j] y arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
             
                System.out.println(Arrays.toString(arr));
            }
        
            if (!swapped) {
                break;
            }
        }
        return arr;
    }
}

