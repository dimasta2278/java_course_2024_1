package lr5.example6;

public class Task6 {
    private int max; // Закрытое поле для максимального значения
    private int min; // Закрытое поле для минимального значения

    // Конструктор, который работает по тому же принципу, что и метод для присваивания значений полям
    public Task6(int value) {
        setValues(value); // Используем метод для присвоения значения
    }

    public Task6(int value1, int value2) {
        setValues(value1, value2); // Используем метод для присвоения значений
    }

    // Открытый метод для присвоения значений полям
    public void setValues(int value) {
        this.max = value;
        this.min = value;
    }

    public void setValues(int value1, int value2) {
        // Сравниваем значения и присваиваем их полям
        this.max = Math.max(value1, value2);
        this.min = Math.min(value1, value2);
    }

    // Метод для отображения значений полей
    public void displayValues() {
        System.out.println("Max: " + max + ", Min: " + min);
    }
}
