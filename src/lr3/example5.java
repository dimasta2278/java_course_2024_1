package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество символов");
        int size = in.nextInt();
        int sum = 0;
        if (size > 0) {

            Random random = new Random();
            int[] ints = new int[size];
            for (int i = 0; i < ints.length; i++) {
                boolean iterator = true;
                int x = 0;
                while (iterator) {
                    x = random.nextInt(100);
                    if ((x % 5) == 2 || (x % 3) == 1) {
                        iterator = false;
                    }
                }
                ints[i] = x;
                sum = sum + ints[i];
            }
            System.out.println(Arrays.toString(ints));
            System.out.println(sum+ " ");
        } else {
            System.out.println("Введено некорректное значение");
        }
    }
}