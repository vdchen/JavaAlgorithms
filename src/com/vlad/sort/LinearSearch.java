package com.vlad.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinearSearch {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter size of array: ");
        int n = Integer.parseInt(in.readLine());
        int a[] = new int [n];

        System.out.println("Enter values for the array: ");
        for (int i=0; i<n; i++){
            System.out.print("a[" + i + "]=");
            a[i] = Integer.parseInt(in.readLine());
        }

        System.out.print("\n" + "Enter value to search: ");
        int v = Integer.parseInt(in.readLine());

        boolean found = false;
        System.out.print("Result of linear search. Location(s) of "+ v + " in array is: ");

        for (int i=0; i<n; i++) {
            if (a[i] == v) {
                found = true;
                System.out.print(i + ";  ");
            }
        }
        if (!found){
            System.out.print("Value not found");
            System.out.println("\n");
        }
    }
}
