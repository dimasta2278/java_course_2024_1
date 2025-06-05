package lr6.example4;

public class Task4 {
    public static Double DoubleFactorial(int l) {
        int step = 2 - l % 2;
        double result = step;
        while (step <= l) {
            if (step > 2) result *= step;
            step += 2;
        }
        return result;
    }
    public static int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n-1);
        return result;
    }
}

//4.	Напишите программу, в которой описан статический метод для вычисления двойного факториала числа, переданного аргументом методу.
// По определению, двойной факториал числа п (обозначается как n!!) — это произведение через одно всех чисел, не больших числа п.
// То есть n!! = п * (n - 2) * (п - 4)* ... (последний множитель равен 1 для нечетного п и равен 2 для четного n). Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15.
