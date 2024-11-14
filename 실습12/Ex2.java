package pk1106;

import java.util.Scanner;

public class Ex2 {
	String sign;
	int cnt;

	void input()
	{
		 Scanner sc = new Scanner(System.in);
	     System.out.print("기호를 입력하세요 : ");
	     sign = sc.next();
	     System.out.print("반복 횟수를 입력하세요 : ");
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
