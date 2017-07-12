package com.vlad.sort;

public class HeapSort {

    public static void main(String[] args) {

        int [] x = {547, 23, 523, 547, 54, 15, 7854, 41, 3, 57};

        System.out.println("Unsorted list: ");
        display(x);
        heapSort(x);
        System.out.println("Sorted list: ");
        display(x);
    }

    private static void heapSort(int[] x) {

     int n = x.length;
     int i, elt, s, f, ivalue, pass = 1;

     for (i=1; i<n; i++){
         elt = x [i];
         s = i;
         f = (s-1)/2;

         while ((s>0) && (x[f])<elt){
             x[s] = x[f];
             s = f;
             f = (s-1)/2;
         }
         x[s] = elt;
     }
     for (i=n-1; i>0; i--){
         ivalue = x[i];
         x[i] = x[0];
         f = 0;

         if (i == 1)
             s = -1;
         else s = 1;

         if ((i>2) && (x[2]> x[1]))
             s = 2;

         while ((s>=0) && (ivalue<x[s])){
             x[f] = x[s];
             f = s;
             s = 2*f+1;

             if ((s+1 <= i-1) && (x[s]<x[s+1]))
                 s = s+1;
             if (s>(i-1))
                 s=-1;
         }
         x[f] = ivalue;
         System.out.println("Pass"+(pass++)+": ");
         display(x);
     }
    }

    private static void display(int[] x) {
        for (int i=0; i<x.length; i++)
            System.out.print(x[i]+" ");
        System.out.println("\n");
    }
}