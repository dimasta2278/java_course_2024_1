package lr2;

import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введеное любое число больше тысячи");
        int x = in.nextInt();
        int result = x / 1000;
        System.out.println("result =" +result);
        }
    }
