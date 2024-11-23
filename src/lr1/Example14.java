package lr1;

import java.util.Scanner;

public class Example14 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.println("Введите A: ");
        int a = in.nextInt();

        System.out.println(a - 1);
        System.out.println(a);
        System.out.println(a + 1);
        System.out.println((a - 1)+a+(a+1)*(a - 1)+a+(a+1));
        in.close();
    }


}
