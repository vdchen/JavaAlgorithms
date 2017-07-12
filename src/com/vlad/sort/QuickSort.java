package com.vlad.sort;

import java.util.Arrays;

public class QuickSort {

	private static int[] numbers = new int[0];

    public static void main(String[] args) {
        int[] toSort = {5, 6, 4, 3, 2, 1, 8, 9, 7, 0, 2};

        System.out.println(Arrays.toString(toSort));
        System.out.println("after sorting : ");
        sort(toSort);
        System.out.println(Arrays.toString(numbers));
        System.out.println(find(9));
        System.out.println(find(0));
        System.out.println(find(2));
        System.out.println(find(13));
    }

    private static String find(int i) {
        int index = -1;
        int low = 0, high = numbers.length, mid;
        while (low < high) {
            mid = (low + high) / 2;
            if (i==numbers[mid]) {
                index = mid;
                break;
            }
            else {
                if (i<mid) high = mid;
                else low=mid+1;
            }
        }
        if(index>=0) return "Index of " + i + " is: " + index;
        else return "no such number";
    }



    public static void sort(int[] toSort) {
        if (toSort==null||toSort.length==0) return;
        numbers = toSort;
        quicksort(0, toSort.length-1);
    }

    private static void quicksort(int low, int high) {
        int i = low, j = high, pivot = numbers[(low + high) / 2];
        while (i <= j) {
            while (numbers[i] < pivot){
                i++;
            }

            while (numbers[j]>pivot){
                j--;
            }
            if (i<=j) {
                int tmp = numbers[i];
                numbers[i++]=numbers[j];
                numbers[j--] = tmp;
            }
        }
        if (low<j) quicksort(low, j);
        if (i<high) quicksort(i, high);
    }


}