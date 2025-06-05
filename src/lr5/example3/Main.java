package lr5.example3;

import lr5.example2.Task2;

public class Main {
    public static void main(String[] args) {

        Task3 task3 = new Task3();
        task3.setIn1(1);
        System.out.println(task3.getIn1());

        task3.setIn1(2);
        task3.setIn2(3);




        System.out.println(task3.getIn1() + "," + task3.getIn2());

    }



}
//3. Напишите программу с классом, у которого есть два целочисленных поля.
// В классе должны быть описаны конструкторы, позволяющие создавать объекты без передачи аргументов,
// с передачей одного аргумента и с передачей двух аргументов.