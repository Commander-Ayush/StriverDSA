package BasicRecursion;

public class oneToN {
    //Given an integer n, write a function to print all numbers from 1 to n (inclusive) using recursion.
    //
    //You must not use any loops such as for, while, or do-while.
    //The function should print each number on a separate line, in increasing order from 1 to n.

    // input = 5
    // output =
    // 1
    // 2
    // 3
    // 4
    // 5

    static int m = 1;
    public static void printNumbers(int n) {
        if(m > n){
            return;
        }
        System.out.println(m);
        m++;
        printNumbers(n);
    }

    public static void main(String[] args) {
        printNumbers(5);
    }

}
