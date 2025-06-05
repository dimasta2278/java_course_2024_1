package lr6.example1;

public class Main {

    public static void main(String[] args) {
        Task1 task1 = new Task1();// создан объект класса task1

        task1.setCh1OrStr1('l');//тестируется первый метод-передаем символьное значение
        task1.setCh1OrStr1("Привет");// тестируем второй метод-передаем строку

        System.out.println(task1.ch1);//результат выводится в консоль
        System.out.println(task1.str1);//результат выводится в консоль

        char[] chars1 = new char[5];//создаем символьный массив
        chars1[0] = 'П';//заполнение массива
        chars1[1] = 'О';//заполнение массива
        chars1[2] = 'К';//заполнение массива
        chars1[3] = 'А';//заполнение массива
        chars1[4] = '!';//заполнение массива

        task1.setCh1OrStr1(chars1);//в объекте вызывается метод и передается символьный массив
        System.out.println(task1.str1); //тестирует метод и выводит в консоль

        char[] chars2 = new char[1];// символьный массив с одним значением
        chars2[0] = 'Ц';


        task1.setCh1OrStr1(chars2);//в объекте вызывается метод и передается символьный массив
        System.out.println(task1.ch1);//тестирует метод и выводит в консоль

    }
}
