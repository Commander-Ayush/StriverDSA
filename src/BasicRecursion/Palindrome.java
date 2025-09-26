package BasicRecursion;

public class Palindrome {

    public static boolean palindrome(String name, int n) {
        if (n >= name.length() / 2) {
            return true;
        }
        if (palindrome(name, n + 1)) {
            return name.charAt(n) == name.charAt(name.length() - n - 1);
        }
        else return false;
    }

    public static void main(String[] args) {

        System.out.println(palindrome("ABtCBA", 0));



    }
}
