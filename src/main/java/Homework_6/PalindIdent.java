package Homework_6;


import java.util.Scanner;

public class PalindIdent {
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input string to check palindrome: ");
        String word1 = in.next();
        in.close();

// Var_1
        System.out.println("Var_1");
        word1 = word1.toLowerCase();//equilse.ignorecase
        char[] chars = word1.toCharArray();
        int p = 0;
        char[] charsret = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            charsret[i] = chars[chars.length - 1 - i];
        }
        for (int j = 0; j < chars.length; j++) {
            p++;
            if (chars[j] != charsret[j]) {
                System.out.println("Your string is NOT palindrome!");
                break;
            }
        }
        if (p == chars.length) {
            System.out.println("Your string is palindrome!");
        }

        // Var_2
        System.out.println("Var_2");

        int ink = 0;
        for (int k = 0; k < chars.length / 2; k++) {
            if (chars[k] == chars[chars.length - k - 1]) {
                ink++;
            } else {
                System.out.println("Your string is NOT palindrome!");
                break;
            }
        }
        if (ink >= chars.length / 2) {
            System.out.println("Your string is palindrome!");
        }

// Var_3
        System.out.println("Var_3");
        for (int h = 0; h < chars.length; h++) {
            int check1 = Character.getNumericValue(chars[h]);
            int check2 = Character.getNumericValue(charsret[h]);
            int deltafinder = check1 - check2;
            if (deltafinder == 0) {
                System.out.println("Your string is palindrome!");
                break;
            } else {
                System.out.println("Your string is NOT palindrome!");
                break;
            }
        }
    }
}

