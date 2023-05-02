package Exerc059;

import java.util.Arrays;
import java.util.Scanner;

public class Exerc059 {

    static boolean isAnagram(String a, String b) {

        a = a.toLowerCase();
        b = b.toLowerCase();

        boolean flag = false;

        char[] c = a.toCharArray();
        Arrays.sort(c);

        char[] d = b.toCharArray();
        Arrays.sort(d);

        String palavraPorCaracterC = new String(c);

        String palavraPorCaracterD = new String(d);

        if (palavraPorCaracterC.equals(palavraPorCaracterD)) {
            flag = true;
        }

        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagramas" : "Not Anagrams");

        sc.close();
    }
}
