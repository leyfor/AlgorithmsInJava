package com.leyfor.AlgorithmsInJava;

// Selection sort is an unstable sort
// cuadratic O(n2)
public class SelectionSort {

    public void swap(int[] array, int i, int j) {
        if(i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
