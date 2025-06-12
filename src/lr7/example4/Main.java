package lr7.example4;

public class Main {
    public static void main(String[] args) {
        SuperClass inst1;
        SubClass inst2;
        SubSubClass inst3;

        inst1 = new SuperClass('S');
        System.out.println("SuperClass\n========");
        System.out.println(inst1.field1);

        inst2 = new SubClass('A', "SOME");
        System.out.println("SubCLass\n========");
        System.out.println(inst1.field1 + " " + inst2.field2);

        inst3 = new SubSubClass('B', "NOISE", 42);
        System.out.println("SubSubClass\n========");
        System.out.println(inst3.field1 + " " + inst3.field2 + " " + inst3.field3);

        SubSubClass inst4 = new SubSubClass(inst3);
        System.out.println("SubSubClass from other Instance\n========");
        System.out.println(inst4.field1 + " " + inst4.field2 + " " + inst4.field3);

    }
}
//4.	Напишите программу, в которой использована цепочка наследования из трех классов.
// В первом классе есть открытое символьное поле. Во втором классе появляется открытое текстовое поле.
// В третьем классе появляется открытое целочисленное поле. В каждом из классов должен быть конструктор, позволяющий создавать объект на основе значений полей,
// переданных аргументами конструктору, а также конструктор создания копии.
