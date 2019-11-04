package Homework_5;
//Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99]. Вывести массив на экран.

import java.util.Random;

public class Task_5E {
    int a = 8;
    int b = 5;

    public void twodarra() {
        int[][] twoarray = new int[b][a];
        Random random = new Random();
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                twoarray[i][j] = random.nextInt(99) + 10;
                System.out.println(twoarray[i][j] + " ");
            }
            //System.out.print(Arrays.toString(twoarray));
        }
    }

}
