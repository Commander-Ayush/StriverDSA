package pattern;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of Columns ");
		int n = scan.nextInt();
		
		for(int i =1;i<=n;i++) {
			for(int x=1;x<=n-i;x++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++) {
				System.out.print("*");
			}
			for(int x=1;x<=n-i;x++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
