package lr2;

import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введеное любое число");
        int x = in.nextInt();
           if (x < 5) {
            System.out.println("Введеное число меньше пяти и не попадает в диапазон от 5 до 10 включительно");
        } else if (x > 10)
               System.out.println("Введеное число ,больше десяти и не попадает в диапазон от 5 до 10 включительно");

    }

}
