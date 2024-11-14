package pk1101;

public class WhileEx4 {
	int cnt, sum;
	int s, e, d, c, temp;
	
	void input(int s, int e, int d, int c)
	{
		this.s= s;
		this.e= e;
		this.d= d;
		this.c = c;
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
				if(ecnt%c == 0)
					System.out.println();
			}
			s++;	
		}
		System.out.println("\n" + d + "의 배수의 개수는 "+ cnt);
		System.out.println("합은 "+ sum + "입니다." );
	}
	
	public static void main(String[] args) {
		WhileEx4 k = new WhileEx4();
		
		k.input(1, 20, 2, 5);
		k.process();
		k.print();
		
	}
}
