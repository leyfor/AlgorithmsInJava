package com.leyfor.AlgorithmsInJava;

public class MergeSort {

    private SelectionSort _selectionSort  = new SelectionSort();

    public MergeSort(int[] input, int start, int end) {
        System.out.println();
        System.out.println("MergeSort");
        this._mergeSort( input, start, end);
        this._selectionSort.display(input);


    }

    // Merge the array
    public void _mergeSort(int[] input, int start, int end) {
        if(end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        // We partition the array into left and right respectively
        _mergeSort(input, start, mid);
        _mergeSort(input, mid, end);

        // Now we _merge the arrays
       this._merge(input, start, mid, end);


    }

    // Merge partitions of arrays
    private void _merge(int[] input, int start, int mid, int end) {

        // Check if the first element of the partition(right and right - 1) are equal
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = (input[i] <= input[j]) ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);

    }
}
