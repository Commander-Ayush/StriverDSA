package BasicRecursion;

public class BackTracking {

    public static void backTracker(int start, int end) {

        if (start < end) {
            return;
        }
        backTracker(start-1, end);
        System.out.println(start);
    }

    public static void backTracking2(int start, int end){
        if(start == end+1){
            return;
        }
        backTracking2(start+1, end);
        System.out.println(start);
    }



    public static void main(String[] args) {
        backTracker(5,1);

        backTracking2(1,10);
    }


}
