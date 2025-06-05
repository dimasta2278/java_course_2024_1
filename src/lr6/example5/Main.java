package lr6.example5;

import java.util.Scanner;

import static lr6.example5.Task5.SummaKvadratov;
import static lr6.example5.Task5.SummaKvadratovSRekursiey;

public class Main {


        public static void main(String[] args) {
            Scanner FibIn = new Scanner(System.in);
            System.out.println("Введите количество чисел для вычисления суммы квадратов");
            int l = FibIn.nextInt();
            int n = l;
            SummaKvadratov(l);
            System.out.println(SummaKvadratovSRekursiey(n));
        }
    }

    //5.	Напишите программу со статическим методом, которым вычисляется сумма квадратов натуральных чисел 12 + 22 + 32 + ... + п2.
// Число п передается аргументом методу. Для проверки результата можно использовать формулу 12 + 22 +32+…+n2=(n+l) (2n + 1)/6
