package lr6.example10;
import java.util.Random;
import java.util.Arrays;

import static lr6.example10.Task10.sum;

public class Main {


    public static void main(String[] args) {
        Random randomNum = new Random();
        int Size = randomNum.nextInt(25 - 0) + 0;
        int[] MyArray = new int[Size];
        System.out.println("Создан массив ");
        System.out.println("Размер массива равен " + Size);
        Random random = new Random();
        for (int i = 0; i < MyArray.length; i++) {
            MyArray[i] = random.nextInt(20);
            System.out.println("Элемент массива [" + i + "] = " + MyArray[i]);
        }
        Arrays.sort(MyArray);
        sum(MyArray);
    }
}


//10.	Напишите программу со статическим методом, аргументом которому передается произвольное количество целочисленных аргументов.
// Результатом метод возвращает массив из двух элементов: это значения наибольшего и наименьшего значений среди аргументов, переданных методу.