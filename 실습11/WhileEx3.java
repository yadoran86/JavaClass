package pk1101;

public class WhileEx3 {
	int cnt, sum;
	int s, e, d,temp;
	
	public WhileEx3(int s, int e, int d)
	{
		this.s= s;
		this.e= e;
		this.d= d;
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
		System.out.println("\n" + d + "의 배수의 개수는 "+ cnt );
		System.out.println("합은 "+ sum + "입니다." );
	}
	
	public static void main(String[] args) {
		WhileEx3 k = new WhileEx3(1,100,7);
		
		k.process();
		k.print();
		
	}
}
