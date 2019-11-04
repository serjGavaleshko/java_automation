package Homework_5;
//Создайте массив из 15 случайных целых чисел из отрезка [0;999].
// Выведите массив на экран.
// Выведите минимальное и максимальное значение элементов массива

import java.util.Random;

/**
 * pihdugkikitdjg;]
 * kurhbkutrboirjt
 */


public class Task_5D {
    public void randminmax() {
        int n = 999;
        int b = 15;


        Random random = new Random();
        int[] arrrand = new int[b];
        for (int i = 0; i < b; i++) {
            arrrand[i] = random.nextInt(n);
            System.out.print(arrrand[i] + " ");
        }
        System.out.println();

        int max = 0;
        int min = arrrand[0];
        for (int i = 0; i < b-1; i++) {
            if (arrrand[i] > max) {
                max = arrrand[i];
            }

            if (arrrand[i] < min) {
                min = arrrand[i];
            }
        }
        System.out.print("Max= " + max +" Min = " + min);
        System.out.println();
        }

               }


