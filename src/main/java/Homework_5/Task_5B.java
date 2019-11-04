package Homework_5;

public class Task_5B {
    public void notevenarray() {

        int n = 100;

        int[] even = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {

                    if (i % 2 == 1) {

                        for (int j = 0; j < n + 1; j++) {
                            even[j] = i;
                        }
                        System.out.print(even[i] + " ");
                    }
                }
                System.out.println();

                for (int k = n; k > 0; --k) {

                    if (k % 2 == 1) {

                        for (int j = 0; j < n + 1; j++) {
                            even[j] = k;
                        }
                        System.out.print(even[k] + " ");
            }
        }
        System.out.println();
    }
}
