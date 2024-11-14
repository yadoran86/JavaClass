package pk1101;

import java.util.*;

public class WhileEx5{
	Scanner sc ;
	int cnt, sum;
	int s, e, d, temp;
	
	void input()
	{
		sc = new Scanner(System.in);
		System.out.print("초기값을 입력하세요 : ");
		s = sc.nextInt();
		System.out.print("최종값을 입력하세요 : ");
		e = sc.nextInt();
		System.out.print("배수를 입력하세요 : ");
		d = sc.nextInt();
		
		temp = s;
	}
	
	void process()
	{
		while(s <= e)	{
			if(s%d == 0){
				cnt++;
				sum += s;
			}
			s++;	
		}
	}
	void print()
	{
		int ecnt=0;
		s=temp;
		while(s <= e)
		{
			if(s%d == 0)
			{
				System.out.printf("%4d", s);
				ecnt++;
				if(ecnt%7 == 0)
					System.out.println();
			}
			s++;	
		}
		System.out.println("\n" + d + "의 배수의 개수는 "+ cnt);
		System.out.println("합은 "+ sum + "입니다." );
	}
	
	public static void main(String[] args) {
		WhileEx5 k = new WhileEx5();
		
		k.input();
		k.process();
		k.print();
		
	}
}
