package Homework_5;

public class Task_5A {


    public void evenarray() {
        int n = 20;

        int[] even = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {

            if (i % 2 == 0) {

                for (int j = 0; j < n + 1; j++) {
                    even[j] = i;
                }
                System.out.print(even[i] + " ");
            }
        }
        System.out.println();
    }
}
