package lr1;

import java.util.Scanner;

public class Example9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Введите месяц и количество дней: ");
        String mounts = in.nextLine();

             switch (mounts) {
            case "Январь 31":
                System.out.println("Январь 31 день");
                break;
            case "Февраль 28":
                System.out.println("Февраль 28 дней");
                break;
            case "Март 31":
                System.out.println("Март  31 день");
                break;
            case "Апрель 30":
                System.out.println("Апрель  30");
                break;
            case "Май 31":
                System.out.println("Май  31 день");
                break;
            case "Июнь 30":
                System.out.println("Июнь 30 дней");
                break;
            case "Июль 31":
                System.out.println("Июль 31 день");
                break;
            case "Август 31":
                System.out.println("Август 31 день");
                break;
            case "Сентябрь 30":
                System.out.println("Сентябрь 30 дней");
                break;
            case "Октябрь 31":
                System.out.println("Октябрь 31 день");
                break;
            case "Ноябрь 30":
                System.out.println("Ноябрь 30 дней");
                break;
            case "Декабрь 31":
                System.out.println("Декабрь 31 день");
                break;

            default:
                System.out.println("Что то не так");



        }
    }
}



