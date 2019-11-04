package Homework_4;

public class TriangleDraw {
    public void drawing_t() {
 int v = 5;

        for (int i = 0; i < v; i++) {
            System.out.println("");
            for (int a = 0; a < (2 * v); a++) {
                if ( a <= (v + i) && a >= (v - i) ) {
                    System.out.print("*");
                    System.out.print(" ");
                } else  System.out.print("  ");
                                         }
                                    }
            }
        }



