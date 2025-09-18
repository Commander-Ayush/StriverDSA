package BasicMaths;

public class CountTheNumberOfDigits {
	
	public static int countNumbers(int x) {
//		int count =0;
//		while(x>0) {
//			x=x/10;
//			count++;
//		}
//		return count;
		
		int count = (int)(Math.log10(x) + 1);
		return count;
		
		// an optimized approach would be:
		// int cnt = (int) (Math.log10(x) + 1); 
		// return cnt;
	}
    public static void main(String[] args) {
        
    	int number = 6;
    	
    	System.out.println(countNumbers(number));
    	System.out.println(number/10);
        
    }
}