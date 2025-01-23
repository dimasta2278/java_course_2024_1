package lr4;

import java.util.Scanner;

public class example8 {
    static String encrypt(String text, int key) {
        char[] symbols = text.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            symbols[i] += key;
        }
        return new String(symbols);
    }

    static String decrypt(String enc_text, int key) {
        char[] symbols = enc_text.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            symbols[i] -= key;
        }
        return new String(symbols);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите текст для шифрования");
        String text = input.nextLine();
        System.out.println("Введите ключ:");
        int key = input.nextInt();
        String encrypted_text = encrypt(text, key);
        System.out.println("Зашифрованный текст:");
        System.out.println(encrypted_text);
        System.out.println("Выполнить обратное преобразование? y/n");
        String answer = input.next();
        while (true) {
            if (answer.equals("y")) {
                System.out.println(decrypt(encrypted_text, key));
                break;
            } else if (answer.equals("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ (y/n)");
                System.out.println("Выполнить обратное преобразование? ");
                answer = input.next();
            }
        }
    }
}
//8.	Напишите программу «Шифр Цезаря», которая зашифровывает введенный текст.
// Используете кодовую таблицу символов. При запуске программы в консоль необходимо вывести сообщение:
// «Введите текст для шифрования», после ввода текста, появляется сообщение: «Введите ключ». После того как введены все данные,
// необходимо вывести преобразованную строку с сообщением «Текст после преобразования: ». Далее необходимо задать вопрос пользователю:
// «Выполнить обратное преобразование? (y/n)», если пользователь вводит «y», тогда выполнить обратное преобразование.
// Если пользователь вводит «n», того программа выводит сообщение «До свидания!». Если пользователь вводит что-то другое,
// отличное от «y» или «n», то программа ему выводит сообщение: «Введите корректный ответ».





