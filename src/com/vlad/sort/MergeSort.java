package com.vlad.sort;

public class MergeSort {

	   static int [] array = {457, 2303, 53, 54, 14, 157, 74, 421, 13, 578};

	    public static void mergeSort(int a[]) {

	        int tmpArray[] = new int[a.length];
	        mergeSort(a, tmpArray, 0, a.length-1);
	    }

	    private static void mergeSort(int a[], int tmpArray[], int left, int right){

	        if (left < right){
	            int centre = (left+right)/2;
	            mergeSort(a, tmpArray, left, centre);
	            mergeSort(a, tmpArray, centre+1, right);
	            merge(a, tmpArray, left, centre+1, right);
	        }
	    }

	    private static void merge(int a[], int tmpArray[], int leftPos, int rightPos, int rightEnd) {

	        int leftEnd = rightPos-1;
	        int tmpPos = leftPos;
	        int numElements = rightEnd - leftPos + 1;

	        while (leftPos <= leftEnd && rightPos <= rightEnd)
	            if (a[leftPos] <= a[rightPos])
	                tmpArray[tmpPos++] = a[leftPos++];
	            else tmpArray[tmpPos++] = a[rightPos++];

	            while (leftPos <= leftEnd)
	                tmpArray[tmpPos++] = a[leftPos++];
	            while (rightPos <= rightEnd)
	                tmpArray [tmpPos++] = a[rightPos++];
	            for (int i=0; i<numElements; i++, rightEnd--)
	                a[rightEnd] = tmpArray[rightEnd];
	    }

	    public static void main(String args []) {

	        System.out.println("This is the array: ");
	        display(array);

	        System.out.println("After merge sort: ");
	        mergeSort(array);
	        display(array);
	    }

	    private static void display(int x[]) {
	        for (int i=0; i<x.length; i++)
	            System.out.print(x[i] + " ");
	        System.out.println("\n");
	    }
	}