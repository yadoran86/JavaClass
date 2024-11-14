package pk1113;

abstract class Ext5Data{
	int cnt, sum;
	
	abstract void process();
	abstract void print();
}

public class Ext5 extends Ext5Data {
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
		System.out.println("\n5�� ����� ������ "+ cnt );
		System.out.println("���� "+ sum + "�Դϴ�." );
	}
	
	public static void main(String[] args) {
		Ext5 k = new Ext5();
		
		k.process();
		k.print();
		
	}
}

