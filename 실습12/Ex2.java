package pk1106;

import java.util.Scanner;

public class Ex2 {
	String sign;
	int cnt;

	void input()
	{
		 Scanner sc = new Scanner(System.in);
	     System.out.print("��ȣ�� �Է��ϼ��� : ");
	     sign = sc.next();
	     System.out.print("�ݺ� Ƚ���� �Է��ϼ��� : ");
	     cnt = sc.nextInt();
	     sc.close();
	}
	
	void prt()
	{
		for(int i = 1 ; i <= cnt ; i++)
			System.out.printf("%2s",sign);
	
		System.out.println(" (" + cnt + ")" );
	}
	
	public static void main(String[] args) {
		Ex2  e1 = new Ex2();

		e1.input();
		e1.prt();
	
	}
}
