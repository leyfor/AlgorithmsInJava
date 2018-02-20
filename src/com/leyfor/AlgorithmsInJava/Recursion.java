package com.leyfor.AlgorithmsInJava;

public class Recursion {

    public Recursion(int num) {
        System.out.println();
        System.out.println(this._recursiveFactorial(num));
        System.out.println(this._iterativeFactorial(num));

    }

    // 1! = 0! * 1 = 1
    // 2! = 2 * 1 = 2
    // 3! = 3 * 2 * 1 = 3 * 2
    // 4! = 4 * 3 * 2 * 1 = 4 * 3
    // 5! = 5 * 4 * 3 * 2 *  = 5 * 4

    private int _recursiveFactorial(int num) {
        if(num == 0) {
            return 1;
        }
        num = num * _recursiveFactorial(num - 1);
        return num;
    }

    private int _iterativeFactorial(int num) {
        if(num == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= num; i = i + 1) {
            factorial = factorial * i;
        }
        return factorial;

    }
}
