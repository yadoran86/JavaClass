package pk1030;

import java.util.Scanner;

public class Test2 {
	Scanner sc;
	int[] score;
	int cnt;

	void input()
	{
		sc= new Scanner(System.in);
		System.out.print("�Է��� ������ ������ �Է��ϼ��� : ");
		cnt = sc.nextInt();
	
		score = new int[cnt];
	
		for(int i=0; i<score.length; i++)
		{
			System.out.print("["+ i + "] : ");
			score[i] = sc.nextInt();
		}
		sc.close();
	}
	
	void print()
	{
		System.out.println("�Է��Ͻ� �����ʹ� �Ʒ��� �����ϴ�.  ");
		for(int i=0; i<score.length; i++)
		{
			System.out.println("["+ i + "] : " + score[i]);
		
		}
	}	
	
	public static void main(String[] args) {
		Test2 k = new Test2();
		
		k.input();
		k.print();
	}
}
