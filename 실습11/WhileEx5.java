package pk1101;

import java.util.*;

public class WhileEx5{
	Scanner sc ;
	int cnt, sum;
	int s, e, d, temp;
	
	void input()
	{
		sc = new Scanner(System.in);
		System.out.print("�ʱⰪ�� �Է��ϼ��� : ");
		s = sc.nextInt();
		System.out.print("�������� �Է��ϼ��� : ");
		e = sc.nextInt();
		System.out.print("����� �Է��ϼ��� : ");
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
		System.out.println("\n" + d + "�� ����� ������ "+ cnt);
		System.out.println("���� "+ sum + "�Դϴ�." );
	}
	
	public static void main(String[] args) {
		WhileEx5 k = new WhileEx5();
		
		k.input();
		k.process();
		k.print();
		
	}
}
