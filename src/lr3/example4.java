package lr3;

import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = in.nextInt();
        int b = in.nextInt();
        if (a < b) {
            System.out.println(a+ " " +b+ " ");
        } else if (a > b){
            System.out.println(b+ " " +a+ " ");
        } else {
            System.out.println("Числа равны");
        }
    }
}