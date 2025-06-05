package lr6.example7;

import static java.io.IO.print;

public class Main {
    public class Task7 {
        public static void main(String[] args) {
            char[] string = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};

            for (int i = 0; i < string.length; i++) {
                print(string[i]);
            }
        }

    }
}


//7.	Напишите программу со статическим методом, аргументом которому передастся символьный массив,
// а результатом возвращается ссылка на целочисленным массив, состоящий из кодов символов из массива- аргумента.