package lr5.example5;

public class Main {
    public static void main(String[] args) {
        // Пример использования конструктора с двумя аргументами
        Task5 obj1 = new Task5(12, 'A');
        System.out.println("Объект 1:");
        obj1.display();

        // Пример использования конструктора с одним аргументом
        Task5 obj2 = new Task5(65.1267);
        System.out.println("Объект 2:");
        obj2.display();
    }
}
