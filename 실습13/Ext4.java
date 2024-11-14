package pk1113;

class Ext4Data{
	int cnt, sum;
}

interface Inter{
	void process();
	void print();

}

public class Ext4 extends Ext4Data implements Inter{
	
	public void process()
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
	
	public void print()
	{
		System.out.println("\n5의 배수의 개수는 "+ cnt );
		System.out.println("합은 "+ sum + "입니다." );
	}
	
	public static void main(String[] args) {
		Ext4 k = new Ext4();
		
		k.process();
		k.print();
		
	}
}

