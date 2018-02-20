package com.leyfor.AlgorithmsInJava;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -72};

        SelectionSort selectionSort = new SelectionSort(intArray);
        InsertionSort insertionSort = new InsertionSort(intArray);
        ShellSort shellSort = new ShellSort(intArray);
        Recursion recursion = new Recursion(5);
    }
}
