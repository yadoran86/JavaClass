package pk1106;

public class Ex3 {
	
	public static void main(String[] args) {
		int s;
		
		for(int i=1; i<=26; i++)
		{
			s='A';
			for(int j=1; j<=i; j++)
				System.out.print((char)s++);
			
			System.out.println();
		}
	}
}
