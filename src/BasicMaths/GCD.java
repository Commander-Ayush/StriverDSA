package BasicMaths;

public class GCD {
    public static int gcd(int x, int y){
        int gdc = 1;
        int m = x-y > 0 ? x : y;
        int min = x==m ? y : x;

        for(int i=m/2; i>=1; i--){
            if((m%i == 0) && (min%i ==0) ){
                gdc = i;
                return gdc;
            }
            else continue;

        }
        return gdc;

    }

    public static void main(String[] args) {

        System.out.println(gcd(2500,125));


    }
}
