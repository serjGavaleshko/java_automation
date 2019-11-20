package Homework_12;

import java.util.Arrays;

public class ArraySorterGenerics<T> {

    private T[] arr;
    public ArraySorterGenerics(T[] arr){
        this.arr = arr;
    }

    public void sorter(){
        // sort array accepted in constructor
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }


    public static <T>void sorter(T[] arr){
        // sort array was set as method parameter
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }
}
