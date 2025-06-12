package lr7.example5;

public class TwoSubClass extends SuperClass{
    private char field2;

    TwoSubClass(String arg1, char arg2) {
        super(arg1);
        field2 = arg2;
    }

    public void PrintData(){
        String className = this.getClass().getSimpleName();
        System.out.println("Class name: " +
                className + "\nПоле 1: " +
                this.getField1() + "\nПоле 2: "
                + field2 );
    }
}
