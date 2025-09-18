package pattern;

import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter edge: ");
		int edge = scanner.nextInt();
		
		System.out.println();
		
		for(int i=edge;i>=1;i--){
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
