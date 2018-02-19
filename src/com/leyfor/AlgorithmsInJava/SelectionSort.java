package com.leyfor.AlgorithmsInJava;

// Selection sort is an unstable sort
// cuadratic O(n2)
public class SelectionSort {

    public SelectionSort(int[] intArray) {
        this._initialize(intArray);

    }

    private void _swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Implementation for Selection Sort
    private void _initialize(int[] intArray) {
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0; // First index
            for (int i = 1; i <= lastUnsortedIndex; i = i + 1) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
            this._swap(intArray, largest, lastUnsortedIndex);
        }

        this._display(intArray);
    }

    //Display the elements to the console
    private void _display(int[] intArray) {
        for (int elem : intArray) {
            System.out.println(elem);
        }
    }
}
