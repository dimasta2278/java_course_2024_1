package lr3;

import java.util.Scanner;

public class example3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество символов");
        int n = in.nextInt();
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.println(n0+" "+n1+" ");
        for (int i =3; i <=n; i++) {
            n2 = n0 + n1;
            System.out.println(n2+ " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }
}
