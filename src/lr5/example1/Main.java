package lr5.example1;

import lr5.example1.Task1;

public class Main {
    public static void main(String[] args) {


        Task1 task1 = new Task1();// создали экземпляр класса
        task1.setCh1('k');//устанавливаем значение К

        System.out.println("getCodeSymbol" + task1.getCodeSymbol());//вызываем метод getCodeSymbol, получаем число и выводим в консоль

        task1.showCodeAndValue();



    }

}
