package Classwork_5;

import java.util.Random;

public class ClassWork_6 {
    public void array_bool() {
        Random random = new Random();
        boolean[][] bool = new boolean[6][6];
        for (int i = 0; i < bool.length; i++) {
            for (int j = 0; j < bool.length; j++) {
                bool[i][j] = random.nextBoolean();
                System.out.println(bool[i][j] +" ");
            }


        }
    }
}
