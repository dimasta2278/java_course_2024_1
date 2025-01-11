package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example10 {
    public static void main(String[] args) {
        //Создание объекта класса Scanner для числа введенного в консоль
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер масива");
        //Запись в переменную Size (нужная для того, что бы задать размер массива)
        int size = id.nextInt();
        //значение введенного в консоль
        System.out.println("Размер массива равен " +size);
        // Создание массива с размером введенного из консоли
        int[] nums = new int[size];
        //Создание объекта класса Random для генерации "случайного" числа
        Random random = new Random();

        for (int i = 0 ; i < nums.length ; i++ ) {
            //Присвоение i-тому элементу массива случайного значения
            nums[i] = random.nextInt(200);
            //Сообщение пользователю для понимания
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
        }
        //Сортировка массива по убыванию его
        Arrays.sort(nums);
        System.out.println("Произведена сортировка массива");
        for (int i = nums.length - 1 ; i > 0; i--){// а это по возрастанию for (int i = 0 ; i < nums.length ; i++ ){
            //Сообщение пользователю для понимания
            System.out.println("Элемент массива ["+i+"] после сортировки = " + nums[i]);
        }
    }
}
