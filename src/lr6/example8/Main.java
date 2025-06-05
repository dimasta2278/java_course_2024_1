package lr6.example8;

import static lr6.example8.Task8.average;

public class Main {

        public static void main(String args[]) {
            int numbers  [] = {5, 8, 12, -18, -54, 84, -35, 17, 37, 45, 85, 98};
            System.out.println("Среднее арифметическое значение элементов массива равно ");
            System.out.println(average(numbers));
        }
}

//8.	Напишите программу со статическим методом, аргументом которому передается целочисленный массив,
// а результатом возвращается среднее значение для элементов массива (сумма значений элементов, деленная на количество элементов в массиве).
