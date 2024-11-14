package pk1030;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] score;
		int cnt;

		System.out.print("입력할 점수의 개수를 입력하세요 : ");
		cnt = sc.nextInt();
		
		score = new int[cnt];
		
		for(int i=0; i<score.length; i++)
		{
			System.out.print("["+ i + "] : ");
			score[i] = sc.nextInt();
		}
		
		System.out.println("입력하신 데이터는 아래과 같습니다.  ");
		for(int i=0; i<score.length; i++)
		{
			System.out.println("["+ i + "] : " + score[i]);
			
		}
		
		sc.close();
		
	}
}
