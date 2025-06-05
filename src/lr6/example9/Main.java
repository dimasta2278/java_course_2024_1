package lr6.example9;

import static lr6.example9.Task9.rokirovka;

public class Main {

        public static void main(String[] args) {
            char[] string = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
            rokirovka(string);
        }


}

//9.	Напишите программу со статическим методом, аргументом которому передается одномерный символьный массив.
// В результате вызова метода элементы массива попарно меняются местами: первый — с последним, второй — с предпоследним и так далее.
