package lr4;

import java.util.Scanner;

public class example4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите  катет прямоугольного треугольник a = b = ");
        System.out.println();
        int a = in.nextInt();
        char[][] triangle = new char[a][a];
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (j <= i) {
                    triangle[i][j] = '#';
                } else {
                    triangle[i][j] = ' ';
                }
            }
        }
        for (char[] line : triangle) {
            System.out.println(line);
        }
    }
}

//4.	Напишите программу, в которой создается двумерный массив, который выводит прямоугольный треугольник;