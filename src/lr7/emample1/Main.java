package lr7.emample1;

public class Main {

        public static void main(String[] args) {
            SubClass inst = new SubClass("Поле");
            System.out.println(inst);
            SubClass inst2 = new SubClass("One", "Two");
            System.out.println(inst2);
            SuperClass inst3 = new SuperClass("FIELD");
            System.out.println(inst3);
        }
    }

    //1.	Напишите программу, в которой есть суперкласс с приватным текстовым полем,
// конструктором с текстовым параметром и где переопределен метод toString ().
// На основе суперкласса путем наследования создается подкласс. У него появляется еще одно приватное текстовое ноле.
// Также подкласс должен иметь версии конструктора с одним и двумя текстовыми аргументами, а еще в нем должен быть переопределен метод toString ().
// В обоих классах метод toString () переопределяется так, что он возвращает строку с названием класса и значение текстового поля или текстовых полей.