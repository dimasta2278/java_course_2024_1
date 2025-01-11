package lr3;

import java.util.Objects;
import java.util.Scanner;
public class example2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название дня");
        String name_day = (in.nextLine());
            if (name_day.equals("Понедельник")) {
            System.out.println("Это первый день недели");
        } else if (name_day.equals("Вторник")) {
            System.out.println("Это второй день недели");
        } else if (name_day.equals("Среда")) {
             System.out.println("Это третий день недели");
        } else if (name_day.equals("Четверг")) {
             System.out.println("Это четвертый день недели");
        } else if (name_day.equals("пятница")) {
             System.out.println("Это пятый день недели");
        } else if (name_day.equals("Суббота")) {
             System.out.println("Это шестой день недели");
        } else if (name_day.equals("Воскресенье")) {
             System.out.println("Это седьмой день недели");
        } else{
            System.out.println("Такого дня нет");
        }
    }
}







