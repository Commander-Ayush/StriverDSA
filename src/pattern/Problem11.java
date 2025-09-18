package pattern;

public class Problem11 {

	public static void main(String[] args) {
		int start=1;
		int n = 5;
		for(int i =1;i<=n;i++) {
			if(i%2==0) {
				start = 0;
			}
			else start=1;
			for(int j=1;j<=i;j++) {
				if(start==-1) {start=1;}
				System.out.print(start);
				start=start-1;
			}
			System.out.println();
		}

	}

}
