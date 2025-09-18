package pattern;

public class Problem16 {
	public static void main(String[] args) {
		
		int o=4;
		for(int i=0;i<o;i++) {
			
			char cha = (char) ('A'+i);
			
			for(int j=0; j<=i;j++) {	
				
				System.out.print(cha+" ");
			}
			System.out.println();
		}
	}

}
