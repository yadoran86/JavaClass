package pk1113;

public class Ext1 {
	// 1부터 100까지의 데이터 중에서 5의 배수를 한행에 7개씩 출력하고
		// 마지막에 5의 개수와 합을 출력하라.
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
				System.out.println("\n5의 배수의 개수는 "+ cnt );
				System.out.println("합은 "+ sum + "입니다." );
			}
}
