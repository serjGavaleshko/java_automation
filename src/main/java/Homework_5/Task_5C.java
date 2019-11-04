package Homework_5;

import java.util.Random;

public class Task_5C {

    int n = 14;
    int b = 9;

    public void randee() {
        Random random = new Random();
        int[] evener = new int[n];
        for (int i = 0; i < n; i++) {
            evener[i] = random.nextInt(b);
            System.out.print(evener[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < evener.length; i++) {
            if (evener[i] % 2 == 0 && evener[i] != 0) {
                System.out.print(evener[i] + " ");
            }

        }
        System.out.println();
    }
}