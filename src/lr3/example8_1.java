package lr3;

public class example8_1 {
    public static void main(String[] args) {
        int array_size = 10;
        char current_char = 'A';

        //Массив гласных
        char[] vowels = {'A', 'E', 'I', 'O', 'U','Y'};
        char[] chars= new char[array_size]; //инициализация массива chars
        int index = 0; // инициализация index

        while (index < array_size) {
            boolean isVowel = false;
            for (char vowel : vowels)
                if (current_char == vowel) {
                    isVowel = true;
                    break;
                }
            if (isVowel) {
                current_char++;
                continue;
            }
            chars[index] = current_char;
            current_char++;
            index++;
        }

        for (char ch : chars) {
            System.out.println(ch + " ");
        }
        System.out.println();
    }

}
