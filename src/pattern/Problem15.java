package pattern;

public class Problem15 {
	public static void main(String[] args) {
		
		int n=4;
		for(int i =n-1; i>=0;i--) {
			for(char ch = 'A'; ch<='A'+i;ch++) {
				System.out.print(ch+" ");				
			}
			System.out.println();
		}
	}

}
