package pk1113;

public class Ext1 {
	// 1���� 100������ ������ �߿��� 5�� ����� ���࿡ 7���� ����ϰ�
		// �������� 5�� ������ ���� ����϶�.
			public static void main(String[] args) {
				int i;
				int cnt=0, sum=0;

				for(i = 1 ; i <= 100 ; i++)
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
				System.out.println("\n5�� ����� ������ "+ cnt );
				System.out.println("���� "+ sum + "�Դϴ�." );
			}
}
