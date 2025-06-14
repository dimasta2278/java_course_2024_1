package lr6.example1;

public class Task1 {


    String str1;//символьное поле
    char ch1;//текстовое поле



    public void setCh1OrStr1(char ch1) {//перегружаем метод, если будем вызывать метод символа, то присвоим символ,
        this.ch1 = ch1;
    }

    public void setCh1OrStr1(String str1) {//перегружаем метод, если со строкой-то строка
        this.str1 = str1;
    }

    public void setCh1OrStr1(char[] chars) {//третья перегрузка, передается массив символов
        if(chars.length ==1) {//если один элемент, присваивается значение полю ch1
            this.ch1 = chars[0];// если = 1, выводим ch1
        } else if (chars.length > 1) {//а если больше одного, то присваиваем строке str1
            this.str1 = String.valueOf(chars); //если >1 выводим str1

        }
    }

}



//1.	Напишите программу с классом, в котором есть два поля: символьное и текстовое.
// В классе должен быть перегруженный метод для присваивания значений полям.
// Если метод вызывается с символьным аргументом, то соответствующее значение присваивается символьному полю.
// Если метод вызывается с текстовым аргументом, то он определяет значение текстового ноля.
// Методу аргументом также может передаваться символьный массив. Если массив состоит из одного элемента, то он определяет значение символьного поля.
// В противном случае (если в массиве больше одного элемента) из символов массива формируется текстовая строка и присваивается значением текстовому полю.