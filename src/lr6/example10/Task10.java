package lr6.example10;

import java.util.Arrays;

public class Task10 {
    public static void sum(int... MyArray) {
        int max = MyArray[0];
        int min = MyArray[0];
        for (int i = 0; i < MyArray.length; i++) {
            if (MyArray[i] > max) {
                max = MyArray[i];
            } else if (MyArray[i] < min) {
                min = MyArray[i];
            }
        }
        System.out.println("Минимальное: " + min + " . " + "Максимальное: " + max);
        int length = 2;
        int[] pulya = new int[length];
        pulya[0] = min;
        pulya[1] = max;
        System.out.println(Arrays.toString(pulya));
        System.out.println("Элемент массива [0] = " + pulya[0]);
        System.out.println("Элемент массива [1] = " + pulya[1]);
    }
}
