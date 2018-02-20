/* Shell Sort Algorithm */

package com.leyfor.AlgorithmsInJava;


public class ShellSort {

    private SelectionSort _selectionSort  = new SelectionSort();

    public ShellSort(int[] array) {
        System.out.println();
        System.out.println("Shell Sort");
        this._initialize(array);
    }


    private void _initialize(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap = gap / 2) {

            for (int i = gap; i < array.length; i = i + 1) {
                int newElement = array[i];

                int j = i;

                while (j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j = j - gap;

                }
                array[j] = newElement;
            }


        }

        this._selectionSort.display(array);

    }

}
