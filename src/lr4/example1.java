package lr4;


public class example1 {
    public static void main(String[] args) {
        int figure = 11; // число строк которое необходимо ввести
        int i ; // переменная задает число, необходимое для расчета количества строк
        int j ; // переменная задает число, необходимое для количества колонок (символов в строке)
        int z; // переменная необходимая для вывода служебного сообщения о количестве символов в строке;

        for (i = 1; i <= figure; i++){

            z = 0;
            for (j = -12; j < figure; j++){
                System.out.print("*");
                z = z + 1;
            }
            System.out.println(" Количество символов в строке " + i + " - " + z);
        }

    }

}









// 1.	Напишите программу, которая выводить в консольное окно прямоугольник,
// размеры сторон которого, ширина: 23 колонки, высота: 11 строк;

