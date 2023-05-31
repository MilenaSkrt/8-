import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 6, 2, 7, 4};
        System.out.println("Исходный массив: " + Arrays.toString(array));
        int[] selArray = Arrays.copyOf(array, array.length);
        int cnt = selectionSort(selArray);
        System.out.println("Сортировка прямым выбором: " + Arrays.toString(selArray) + ", итераций: " + cnt);
        int[] bubbleArray = Arrays.copyOf(array, array.length);
        int cnt1 = bubbleSort(bubbleArray);
        System.out.println("Сортировка пузырьком: " + Arrays.toString(bubbleArray) + ", итераций: " + cnt1);
    }
    public static int selectionSort(int[] array) {
        int cnt = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
            cnt++;
            System.out.println("Промежуточный результат сортировки прямым выбором: " + Arrays.toString(array));
        }
        return cnt;
    }
    public static int bubbleSort(int[] array) {
        int cnt = 0;
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            cnt++;
            System.out.println("Промежуточный результат сортировки пузырьком: " + Arrays.toString(array));
            if (!swapped) {
                break;
            }
        }
        return cnt;
    }
}
