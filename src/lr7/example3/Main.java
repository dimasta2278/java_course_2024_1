package lr7.example3;

public class Main {

        public static void main(String[] args) {
            SuperClass inst1;
            SubClass inst2;
            SubSubClass inst3;

            inst1 = new SuperClass(42);
            System.out.println("SuperClass\n========");
            System.out.println(inst1);
            inst1.setFields(2042);
            System.out.println(inst1);

            inst2 = new SubClass(24, 'a');
            System.out.println("SubClass\n========");
            System.out.println(inst2);
            inst2.setFields(42, 'b');
            System.out.println(inst2);

            inst3 = new SubSubClass(256, 'c', "FIELD");
            System.out.println("SubSubClass\n========");
            System.out.println(inst3);
            inst3.setFields(1024, 'o', "CHANGE");
            System.out.println(inst3);
        }
    }

//3.	Напишите программу, в которой на основе суперкласса создается подкласс, а на основе этого подкласса создается еще один подкласс (цепочка наследования из трех классов).
// В первом суперклассе есть открытое целочисленное поле, метод с одним параметром для присваивания значения полю и конструктор с одним параметром.
// Во втором классе появляется открытое символьное поле, метод с двумя параметрами для присваивания значения полям (перегрузка метода из суперкласса) и конструктор с двумя параметрами.
// В третьем классе появляется открытое текстовое ноле, метод с тремя аргументами для присваивания значений полям (перегрузка метода из суперкласса) и конструктор с тремя параметрами.
// Для каждого класса определите метод toString () так, чтобы он возвращал строку с названием класса и значениями всех полей объекта.
