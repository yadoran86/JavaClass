package pk1030;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] score;
		int cnt;

		System.out.print("�Է��� ������ ������ �Է��ϼ��� : ");
		cnt = sc.nextInt();
		
		score = new int[cnt];
		
		for(int i=0; i<score.length; i++)
		{
			System.out.print("["+ i + "] : ");
			score[i] = sc.nextInt();
		}
		
		System.out.println("�Է��Ͻ� �����ʹ� �Ʒ��� �����ϴ�.  ");
		for(int i=0; i<score.length; i++)
		{
			System.out.println("["+ i + "] : " + score[i]);
			
		}
		
		sc.close();
		
	}
}
