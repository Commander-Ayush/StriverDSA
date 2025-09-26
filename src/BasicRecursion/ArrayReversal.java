package BasicRecursion;

import java.util.Arrays;


public class ArrayReversal {

    //<T> means type parameter, can be used as a generic datatype, in case we don't know
    // what's about to come
    public static <T> void swap(T[] x, int a, int b) {
        T temp;
        temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

    public static <T> void arrayReverse(T[] x, int start, int end) {

        if ((start == end) || start > end) {
            return;
        }
        swap(x, start, end);
        arrayReverse(x, start + 1, end - 1);
    }

    public static <T> T[] arrayReversalS(T[] x, Integer i){

        if(i>=x.length/2){
            return x;
        }
        swap(x , i, x.length-i-1);
        return arrayReversalS(x, i+1);
    }

    public static void main(String[] args) {
        Integer[] arr = {23, 34, 4, 2, 45, 23, 2, 36, 687, 45, 3, 323};
        System.out.println(Arrays.toString(arr));
        arrayReverse(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

        String[] names = {"Ayush", "Raj", "Sita", "Mohan"};
        String[] result= arrayReversalS(names, 0);
        System.out.println(java.util.Arrays.toString(result));
    }

}
