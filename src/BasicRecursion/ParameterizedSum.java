package BasicRecursion;

public class ParameterizedSum {
    // Using Recursion

    public static void paramSum(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        paramSum(i-1, sum+i);
    }

    public static int funcSum(int n){
        if(n<1){
            return 0;
        }
        n = n + funcSum(n-1);
        return n;

    }

    public static void main(String[] args) {
        paramSum(3, 0);
        System.out.println(funcSum(9));
    }
}
