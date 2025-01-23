package lr4;

import java.util.Arrays;
import java.util.Scanner;

public class example9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования");// вводим строку
        String value = in.nextLine();// этот метод считывает текст//

        System.out.println("Введите ключ для шифрования");//значение ключа
        int key = in.nextInt();

        char[] chars = value.toCharArray();//с помощью метода toCharArray преобразовываем строку value в массив символов
        int[] ints = new int[value.length()];

        for (int i = 0; i < chars.length; i++) {
            ints[i] = chars[i] + key;
        }

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ints[i];
        }

        System.out.println(Arrays.toString(chars));
    }
}
