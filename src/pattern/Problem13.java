package pattern;

public class Problem13 {
	public static void main(String[] args) {
		
		int m=5;
		int num=0;
		for(int i = 1; i<=m;i++) {
			for(int j=1;j<=i;j++) {
				num=num+1;
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}

}
