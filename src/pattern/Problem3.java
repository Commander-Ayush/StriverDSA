package pattern;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter edge: ");
		int edge = scanner.nextInt();
		
		for(int i=1;i<=edge;i++){
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}		

	}

}
