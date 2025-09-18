package BasicMaths;

public class ReverseNumber {
	
	public static int reverseDigits(int x) {
		int rev=0;
		while(x>0) {
			int ls = x%10;
			x=x/10;
			rev = (rev*10)+ls;
		}
		return rev;
	}

	public static void main(String[] args) {
	
		// if a number has tailing zeros then it's reverse won't
		// contain zeros for example the reverse of 104000 is 401 and not 000401
		
		int x = -53453;
		System.out.println(reverseDigits(x));
		
	}

}
