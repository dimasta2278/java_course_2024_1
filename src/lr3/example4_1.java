package lr3;

import java.util.Scanner;

public class example4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = in.nextInt();
        int b = in.nextInt();

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        System.out.println(" " + min + " " + max + ":");
        int i = min;
        for (i = min; i <= max;) ;
        System.out.println(i + " ");
    }
}
