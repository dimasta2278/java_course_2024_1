package lr6.example9;

public class Task9 {
    public static void rokirovka(char[] string) {
        int l =string.length;
        char[] stroka = new char[l];
        int n = (string.length)/2;
        for (int i = 0; i < n; i++) {
            stroka[0] = string[i];
            string[i] = string[n + 1 - i];
            string[n + 1 - i] = stroka[0];
            System.out.print(stroka[i] + " ");
        }
        System.out.println();
    }

}
