package lr4;

import java.util.Arrays;
import java.util.Scanner;

public class example7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Задайте кол-во строк массива: ");
        int M = input.nextInt();
        System.out.println("Задайте кол-во столбцов массива: ");
        int N = input.nextInt();
        int[][] matrix = new int[M][N];

        int data = 1;
        for (int row = 0; row < M; row++) {
            if (row % 2 == 0) {
                for (int index = 0; index < N; index++) {
                    matrix[row][index] = data;
                    data++;
                }
            } else {
                for (int index = N - 1; index >= 0; index--) {
                    matrix[row][index] = data;
                    data++;
                }
            }
        }
        System.out.println("Массив заполнен змейкой:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
//7.	Напишите программу, в которой создается двумерный числовой массив и этот массив заполняется «змейкой»:
// сначала первая строка (слева направо), затем последний столбец (сверху вниз), вторая строка (справа налево)
// и так далее, как показано на рисунке:




