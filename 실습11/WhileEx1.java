package pk1101;

public class WhileEx1 {
	public static void main(String[] args) {
		int i;
		int cnt=0, sum=0;

		i=1;
		while(i <= 100)
		{
			if(i%5 == 0)
			{
				System.out.printf("%4d", i);
				cnt++;
				sum += i;
				if(cnt%7 == 0)
					System.out.println();
			}
			i++;	
			
		}
		System.out.println("\n5�� ����� ������ "+ cnt );
		System.out.println("���� "+ sum + "�Դϴ�." );
	}
}
