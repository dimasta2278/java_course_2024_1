package lr1;

import java.util.Scanner;

public class Example10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите год рождения: ");
        String years = String.valueOf(in.nextInt());



             switch (years) {
            case "1984":
                System.out.println("40 лет");
                break;
            case "1985":
                System.out.println("39 лет");
                break;
            case "1986":
                System.out.println("38 лет");
                break;
            case "1987":
                System.out.println("37 лет");
                break;
            case "1988":
                System.out.println("36 лет");
                break;
            case "1989":
                System.out.println("35 лет");
                break;
            case "1990":
                System.out.println("34 года");
                break;
            case "1991":
                System.out.println("33 года");
                break;
            case "1992":
                System.out.println("32 года");
                break;
            case "1993 31":
                System.out.println("31 год");
                break;
            case "1994":
                System.out.println("30 лет");
                break;
            case "1995":
                System.out.println("29 лет");
                break;
            case "1996":
                System.out.println("28 лет");
                break;
            case "1997":
                System.out.println("27 лет");
                break;
            case "1998":
                System.out.println("26 лет");
                break;
            case "1999":
                System.out.println("25 лет");
                break;
            case "2000":
                System.out.println("24 года");
                break;
            case "2001":
                System.out.println("23 года");
                break;

            default:
                System.out.println("Что то не так");


        }

    }
}

