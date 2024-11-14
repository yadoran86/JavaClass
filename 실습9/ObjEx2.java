package pk1025;

public class ObjEx2 {
	int sum, cnt;
	
	public ObjEx2()
	{
		sum=0;
		cnt=0;
	}
	
	public void process()
	{
		int i;
	
		
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
		
	}
	
	public void prt()
	{
		System.out.println("\n" + "합은 = " + sum);
		System.out.println("개수는  = " + cnt);
	}
	
	public static void main(String[] args) 
	{
		ObjEx2 k = new ObjEx2();
		
		k.process();
		k.prt();
		
	}
}
