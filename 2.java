import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int N = in.nextInt();
        int[] inputArray = new int[N];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < N; i++) {
            inputArray[i] = in.nextInt();
        }
        boolean isSylvesterSequence = checkSequence(inputArray);
        if (isSylvesterSequence) {
            System.out.println("Массив является последовательностью Сильвестра.");
        } else {
            System.out.println("Массив не является последовательностью Сильвестра.");
        }
    }
    public static boolean checkSequence(int[] array) {
        if (array.length == 0 || array[0] != 2) {
            return false;
        }

        for (int i = 1; i < array.length; i++) {
            int expectedValue = array[i - 1] * (array[i - 1] - 1) + 1;
            if (array[i] != expectedValue) {
                return false;
            }
        }
        return true;
    }
}
