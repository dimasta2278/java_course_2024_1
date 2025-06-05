package lr5.example5;

public class Task5 {
    private char characterField; // Символьное поле
    private int integerField;     // Целочисленное поле

    // Конструктор с двумя аргументами: целое число и символ
    public Task5(int integerValue, char characterValue) {
        this.integerField = integerValue;
        this.characterField = characterValue;
    }
    // Конструктор с одним аргументом типа double
    public Task5(double value) {
        // Получаем целую часть числа для кода символа
        int charCode = (int) value;
        this.characterField = (char) charCode;

    // Получаем дробную часть числа, умножая на 100, чтобы получить целочисленное значение
    int decimalPart = (int) ((value - charCode) * 100);
        this.integerField = decimalPart;

}

    // Метод для вывода значений полей
    public void display() {
        System.out.println("Символьное поле: " + characterField + " (код: " + (int) characterField + ")");
        System.out.println("Целочисленное поле: " + integerField);
    }
}
