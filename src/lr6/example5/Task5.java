package lr6.example5;

public class Task5 {
    public static void SummaKvadratov(int l) {
        int result = 0;
        result = l* (l + 1) * (2 * l + 1) / 6;
        System.out.println(result);
    }
    public static int SummaKvadratovSRekursiey (int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += (i * i);
        return sum;
    }
}
