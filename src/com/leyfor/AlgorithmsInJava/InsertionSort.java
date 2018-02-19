package com.leyfor.AlgorithmsInJava;

// Insertion sort is an STABLE sort
// cuadratic O(n2)
public class InsertionSort {

    private SelectionSort _selectionSort  = new SelectionSort();

    public InsertionSort(int[] array) {
        System.out.println();
        System.out.println("Insertion Sort");
        this._initialize(array);
    }

    // Implement the Insertion Sort
    private void _initialize(int[] array) {

        // Grow the position by one(plus, plus the array)
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {

            // Saves the value of each unsorted index value, before shifting to the right(avoid overwriting the value)
            int newElement = array[firstUnsortedIndex];

            // Declare i outside the inner for loop, to be able to use it outside the loop
            int i;

            // Compares the elements at each position( index) of the array
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i = i - 1) {
                // i > 0 && array[i - 1] > newElement; mean:
                // i > 0 : means we've not reach index 0(which is assumed as sorted array)
                // array[i - 1]: means checking from right to left
                // > newElement: means should continue to move left as long as element i is greater than new element
                // newElement must be smaller than the element at index - 1 of its position...

                //swap the new element with the element at position index - 1
                array[i] = array[i - 1];

            }
            array[i - 1] = newElement;

        }
        this._selectionSort.display(array);
    }
}
