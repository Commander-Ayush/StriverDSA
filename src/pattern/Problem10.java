package pattern;

import java.util.Scanner;

public class Problem10 {
	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter edge: ");
		int edge = scanner.nextInt();
		
		for(int i=0;i<=edge;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=edge;i>=1;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
