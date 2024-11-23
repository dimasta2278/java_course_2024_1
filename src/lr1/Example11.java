package lr1;

import java.util.Scanner;

public class Example11 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите год рождения: ");
        int a = in.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Ваш возраст"  + (2024-a));
        in.close();
    }
}
