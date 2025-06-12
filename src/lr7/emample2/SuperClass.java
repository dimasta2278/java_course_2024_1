package lr7.emample2;

public class SuperClass {
    private String field;

    SuperClass(String arg){
        field = arg;
    }

    public void setField(String arg){
        field = arg;
    }

    public int getFieldLenght(){
        return field.length();
    }
}
