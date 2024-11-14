package pk1025;

public class ObjEx1 { // 1   100   5   7    cnt     sum
	public static void main(String[] args) 
	{
		int i, sum, cnt;
		
		sum=0;
		cnt=0;
	
		for(i = 1 ; i <= 100 ; i++)
		{
			if(i%5 == 0)
			{
				System.out.print(i+"  ");
				sum =sum+i;
				cnt = cnt + 1;
				if(cnt%7 == 0)
					System.out.print("\n");   // System.out.println();
			}
		}
		
		System.out.println("\n" + "합은 = " + sum);
		System.out.println("개수는  = " + cnt);
	
	}
}
