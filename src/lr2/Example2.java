package lr2;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введеное любое число");
        int x = in.nextInt();
        int result = x % 5;
        System.out.println("result =" + result);
        if (result == 2) {
            System.out.println("Введеное число делится на пять с остатком два");
        } else {
            result = x % 7;
            System.out.println("result =" + result);
            if (result == 1) {
                System.out.println("Введеное число делится на семь с остатком один");

            }
        }

    }
}