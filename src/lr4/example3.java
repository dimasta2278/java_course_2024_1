package lr4;

import java.util.Scanner;

public class example3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите ширину прямоугольника w = ");
        System.out.println();
        int w = input.nextInt();
        System.out.print("Введите высоту прямоугольника  h = ");
        int h = input.nextInt();
        char[][] triangle = new char[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                triangle[i][j] = '2';
            }
        }
        for (char[] line : triangle) {
            System.out.println(new String(line));
        }
    }
}



