package Classwork_5;

import java.util.Arrays;
import java.util.Random;

public class CastArrayChar {
    public void charrand() {
        Random random1 = new Random();
        char[] arrchar = new char[20];
        for (int i = 0; i < 20; i++) {
            arrchar[i] = (char) (random1.nextInt(128-33) +33);
            System.out.print(arrchar[i] + " ");
        }
        System.out.println();
        String newstring = Arrays.toString(arrchar);
        System.out.print(newstring);
    }
}






