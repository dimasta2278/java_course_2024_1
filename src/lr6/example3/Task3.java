package lr6.example3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите количество аргументов");
        int Size = id.nextInt();
        System.out.println("количество аргументов  " + Size);
        int[] nums = new int[Size];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            System.out.println("Аргумент номер: [" + i + "] = " + nums[i]);
        }
        Scanner id2 = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int Size2 = id2.nextInt();
        System.out.println("Размер массива равен "+ Size2);
        int[] numbers = new int[Size2];
        Random random2 = new Random();
        for (int i = 0 ; i < numbers.length ; i++ ){
            numbers [i] = random2.nextInt(200);
            System.out.println("Элемент массива ["+i+"] = " + numbers [i]);
        }
        podschetChisel(numbers);
        makeMiddle(numbers);
        podschetChiselTwo(nums);
        makeMiddleTwo(nums);
    }
    static void podschetChisel (int ... numbers) {
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println("Максимальный элемент массива = " + max);
        int min = Arrays.stream(numbers).min().getAsInt();
        System.out.println("Минимальный элемент массива = " + min);
    }
    static void makeMiddle (int ... numbers) {
        int [] a;
        if (numbers.length%2==0){
            a= new int[2];
            a[0] = numbers [(numbers.length/2) - 1];
            a[1] = numbers [numbers.length/2];
        } else {
            a = new int[1];
            a[0] = numbers [numbers.length/2];
        }
        System.out.println("Средний элемент массива = " + a);
    }

    static void podschetChiselTwo (int ... nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        System.out.println("Максимальный элемент  = " + max);
        int min = Arrays.stream(nums).min().getAsInt();
        System.out.println("Минимальный элемент  = " + min);
    }
    static void makeMiddleTwo (int ... nums) {
        int [] a;
        if (nums.length%2==0){
            a= new int[2];
            a[0] = nums [(nums.length/2) - 1];
            a[1] = nums [nums.length/2];
        } else {
            a = new int[1];
            a[0] = nums [nums.length/2];
        }
        System.out.println("Средний элемент = " + a);
    }
}