package BasicMaths;

public class PrimeNumber {
    public static boolean isPrime(int x) {
        if (x <= 1) return false;

        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(13));
    }
}

