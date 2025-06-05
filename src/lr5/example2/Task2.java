package lr5.example2;

public class Task2 {
    public char ch1;
    public char ch2;
    public char c;


    public void setCh1(char ch1) {
        this.ch1 = ch1;

    }

    public char getCh1() {
        return ch1;
    }

    public void setCh2(char ch2) {
        this.ch2 = ch2;
    }


    public char getCh2() {
        return ch2;
    }


    public void Show() {
        // Цикл от начального до конечного символа
        for (char c = getCh1(); c <= getCh2(); c++) {
            System.out.print(c);
        }


    }

    public char getC() {
        return c;
    }
}

