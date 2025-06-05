package lr6.example6;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int[] massiv = {2, 3, 14, 26, 31, 37, 40, 45, 49, 51, 59, 60, 61, 68, 70};
        Scanner FibIn = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int chislo = FibIn.nextInt();
        int[] massivtwo = new int[chislo];
        int len1=massiv.length;
        int len2=massivtwo.length;
        if (len1>len2) {
            for (int i = 0; i < massivtwo.length; i++) {
                System.arraycopy(massiv, 0, massivtwo, 0, massivtwo.length);
                System.out.println(Arrays.toString(massivtwo));
            }

        }else {
            System.out.println(Arrays.toString(massiv));
        }
    }

}