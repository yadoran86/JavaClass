package pk1113;

class Ext3Data{
	int cnt, sum;
}

public class Ext3 extends Ext3Data{
	
	void process()
	{
		for(int i = 1 ; i <= 100 ; i++)
		{
			if(i%5 == 0)
			{
				System.out.printf("%4d", i);
				cnt++;
				sum += i;
				if(cnt%7 == 0)
					System.out.println();
			}
				
		}
	}
	
	void print()
	{
		System.out.println("\n5의 배수의 개수는 "+ cnt );
		System.out.println("합은 "+ sum + "입니다." );
	}
	
	public static void main(String[] args) {
		Ext3 k = new Ext3();
		
		k.process();
		k.print();
		
	}
}
