package lr6.example7;

public class Task7 {
    private static void print(int number) {
        String result = String.format("Номер символа %s в таблице Unicode - %d", (char) number, number);
        System.out.println(result);
    }
}
