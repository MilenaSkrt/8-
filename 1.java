import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int N = in.nextInt();
        int[] binaryArray = new int[N];

        System.out.println("Введите элементы двоичного числа (0 или 1):");
        for (int i = 0; i < N; i++) {
            int input = in.nextInt();
            if (input == 0 || input == 1) {
                binaryArray[i] = input;
            } else {
                System.out.println("Неверный ввод. Введите только 0 или 1.");
                i--; 
            }
        }
        String binaryString = "";
        for (int i = 0; i < N; i++) {
            binaryString += binaryArray[i];
        }
        int decimal = Integer.parseInt(binaryString, 2);
        String octalString = Integer.toOctalString(decimal);
        int[] octalArray = new int[octalString.length()];

        for (int i = 0; i < octalString.length(); i++) {
            octalArray[i] = Character.getNumericValue(octalString.charAt(i));
        }
        System.out.print("Число в восьмеричной системе счисления: ");
        for (int i = 0; i < octalArray.length; i++) {
            System.out.print(octalArray[i]);
        }
    }
}
