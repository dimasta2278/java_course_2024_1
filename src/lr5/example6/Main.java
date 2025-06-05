package lr5.example6;

public class Main {
    public static void main(String[] args) {
        Task6 obj1 = new Task6(5); // Создаем объект с одним значением
        obj1.displayValues(); // Выводим значения полей

        Task6 obj2 = new Task6(10, 20); // Создаем объект с двумя значениями
        obj2.displayValues(); // Выводим значения полей

        obj2.setValues(15, 5); // Изменяем значения полей
        obj2.displayValues(); // Выводим обновленные значения полей

        obj2.setValues(25); // Присваиваем одно значение
        obj2.displayValues(); // Выводим значения полей
    }
}
