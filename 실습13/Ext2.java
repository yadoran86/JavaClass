package pk1113;

public class Ext2 {
	int cnt, sum;

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
		System.out.println("\n5�� ����� ������ "+ cnt );
		System.out.println("���� "+ sum + "�Դϴ�." );
	}
	
	public static void main(String[] args) {
		Ext2 k = new Ext2();
		
		k.process();
		k.print();
		
	}
}
