package pk1101;

public class WhileEx2 {
	int cnt, sum;

	void process()
	{
		int i=1;
		while(i <= 100)	{
			if(i%5 == 0){
				cnt++;
				sum += i;
			}
			i++;	
		}
	}
	void print()
	{
		int i=1, cnt=0;
		while(i <= 100)
		{
			if(i%5 == 0)
			{
				System.out.printf("%4d", i);
				cnt++;
				if(cnt%7 == 0)
					System.out.println();
			}
			i++;	
		}
		System.out.println("\n5�� ����� ������ "+ cnt );
		System.out.println("���� "+ sum + "�Դϴ�." );
	}
	
	public static void main(String[] args) {
		WhileEx2 k = new WhileEx2();
		
		k.process();
		k.print();
		
	}
}
