package lr5.example1;

public class Task1 {
    private char ch1;//закрытое символьное поле

    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }// открытое символьное поле, присваивает значение полю

    public int getCodeSymbol() {// метод при вызове возвращает результатом код символа int
        return ch1;
    }

    public void showCodeAndValue() {// выводит в консоль символ, значение поля и код символа
        System.out.println("Value = " + ch1);
        System.out.println("Code = " + (int) ch1);
    }
}
