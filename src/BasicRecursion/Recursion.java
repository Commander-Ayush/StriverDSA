package BasicRecursion;

// print a name 5 times
// print from 1 to N
// print from N to 1

import java.util.Scanner;

public class Recursion {
    static int nameCounter = 0;
    static int depth = 0;
    static int n=90;

    public static void setNameCounter() {
        System.out.println("name");
        if (nameCounter == 4) {
            return;
        }
        nameCounter++;
        setNameCounter();
    }

    public static void oneToN() {
        depth++;
        oneToN();
    }

    public static void nToONe(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        n--;
        nToONe(n);

    }

    public static void main(String[] args) {

        // Printing name 5 times
        setNameCounter();


        //one to N
        try {
            oneToN();
        } catch (StackOverflowError e) {
            System.out.println("Bottom reached at " + depth);
        }


        // N to 1


        n =50;

        nToONe(n);

    }
}
