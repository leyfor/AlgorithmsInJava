package com.leyfor.AlgorithmsInJava;

public class Main {

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();

        int[] intArray = {20, 35, -15, 7, 55, 1, -72};

        // For Loop for Selection Sort
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0; // First index
            for (int i = 1; i <= lastUnsortedIndex; i = i + 1) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
            selectionSort.swap(intArray, largest, lastUnsortedIndex);
        }
     for (int elem : intArray) {
         System.out.println(elem);
     }

    }
}
