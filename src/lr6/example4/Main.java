package lr6.example4;
import java.util.Scanner;

import static lr6.example4.Task4.DoubleFactorial;
import static lr6.example4.Task4.factorial;

public class Main {

        public static void main(String[] args) {
            Scanner FibIn = new Scanner(System.in);
            System.out.println("Введите число для вычисления двойного факториала");
            int l = FibIn.nextInt();
            int n = l;
            System.out.println(DoubleFactorial(l));
            System.out.println(factorial(n));
        }
    }
