package lr6.example8;

public class Task8 {
    public static Double average(int[] numbers){
        double sum = 0;
        for (int j = 0; j < numbers.length; j++) {
            sum += numbers[j];
        }
        double average = sum / numbers.length;
        return average;
    }

}