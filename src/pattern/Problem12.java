package pattern;

public class Problem12 {

	public static void main(String[] args) {
		
		int n=40
				;
		for(int i=1;i<=n;i++) {
			
			int m= (2*n)-(2*i);
			
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=1;k<=m;k++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}