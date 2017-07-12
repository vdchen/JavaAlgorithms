package com.vlad.sort;

public class ShellSort {

    public static void main(String[] args) {

        int[] x = {45, 456, 75, 1, 2369, 2569, 74, 3, 021};

        System.out.println("Unsorted list: ");
        display(x);

        int inc[] = {5, 3, 1};
        int numic = inc.length;
        shell(x, inc, numic);

        System.out.println("Sorted list: ");
        display(x);
    }

    private static void shell(int x[], int inc[], int numic) {

        int i, span, y, j, k;
        int n = x.length;

        for (i=0; i<numic; i++){
            span = inc[i];
            for (j=span; j<n; j++){
                y = x[j];
                for (k=j-span; k>=0 && y<x[k]; k-=span)
                    x[k+span] = x[k];
                x[k+span] = y;
            }
        }
    }

    private static void display(int x[]){

        for (int i=0; i<x.length; i++)
            System.out.print(x[i] + " ");
        System.out.println("\n");
    }
}