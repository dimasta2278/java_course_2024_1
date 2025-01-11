package lr3;

import java.util.Arrays;

public class example8 {
    public static void main(String[] args) {

        int size = 10; // размер массива
        char[] charArray = new char[size];

        // заполнение массива буквами через одну
        for (int i = 0; i < size; i++)
            charArray[i] = (char) ('A' + i);
        System.out.println(Arrays.toString(charArray));
    }
}