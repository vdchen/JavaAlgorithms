package com.vlad.sort;

public class InsertionSort {

    public static void main(String[] args) {

        int [] x = {547, 23, 523, 547, 54, 15, 7854, 41, 3, 57};

        System.out.println("Unsorted list: ");
        display(x);
        insertion(x);
        System.out.println("Sorted list: ");
        display(x);
    }

    private static void insertion(int[] x) {

        int i, k, y;

        for (k=1; k<x.length; k++){
            y=x[k];
            for (i=k-1; i>=0 && y<x[i]; i--)
                x[i+1] = x[i];
            x[i+1] = y;
        }
    }

    public static void display (int[] x) {
        for (int i=0; i<x.length; i++)
            System.out.print(x[i] + " ");
        System.out.println("\n");
    }
}