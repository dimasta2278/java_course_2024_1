package lr3;

import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество символов");
        int n = in.nextInt();
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }
}