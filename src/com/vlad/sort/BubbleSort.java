package com.vlad.sort;

public class BubbleSort {

    public static void main(String[] args) {

        int array[] = {547, 23, 523, 547, 54, 15, 7854, 41, 3, 57};

        System.out.println("Unsorted array: ");
        printArray(array);

        for (int i=0; i<array.length-1; i++){
            for (int j=0; j<array.length-1; j++){
                if (array[j] > array[j+1]){
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
            System.out.println("End of pass" + (i+1));
            printArray(array);
        }
        System.out.println("Sorted array: ");
        printArray(array);
}

    private static void printArray(int[] a) {
        for (int i=0; i<a.length; i++)
            System.out.print(a[i]+" ");
            System.out.println("\n");

    }
    }