package lr2;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введеное любое число");
        int x = in.nextInt();
        int result = x % 4;
        System.out.println("result =" + result);
        if (result == 0) {
            System.out.println("Введеное число делится на четыре без остатка");
        } else {
            result = x % 4;
            System.out.println("result =" + result);
            if (result != 0) {
                System.out.println("Введеное число делится на четыре с остатком");
                if (x < 10) {
                    System.out.println("Данное число меньше десяти");
                }
            }

        }
    }
}


