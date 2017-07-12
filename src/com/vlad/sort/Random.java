package com.vlad.sort;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Random {
	 public static int[] fillArray(int size) {
	        Set<Integer> ints = new LinkedHashSet<>();
	        IntStream.range(1, size).forEach(value -> ints.add((int) (Math.random() * size)));
	        int[] result = new int[ints.size()];
	        int iterator = 0;
	        for (Integer i : ints) {
	            result[iterator++]=i;
	        }
	        return result;
	    }
	}