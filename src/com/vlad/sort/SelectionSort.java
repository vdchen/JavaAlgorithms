package com.vlad.sort;

import java.util.Arrays;


@SuppressWarnings("all")
public class SelectionSort {
    private static int[] array;

    public static void main(String[] args) {
        int[] toSort = {547, 23, 523, 547, 54, 15, 7854, 41, 3, 57};
        System.out.println(Arrays.toString(toSort));
        System.out.println("after sorting : ");
        sort(toSort);
        System.out.println(Arrays.toString((toSort)));

    }



    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min=j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
    }


}