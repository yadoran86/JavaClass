package pk1106;

public class Ex1 {
	char sign;
	int cnt;

	public Ex1(char sign) {
		this.sign = sign;
		cnt = 10;
	}
	
	public Ex1(char sign, int cnt) {
		this.sign = sign;
		this.cnt = cnt;
	}
	
	void prt()
	{
		for(int i = 1 ; i <= cnt ; i++)
			System.out.printf("%3c",sign);
	
		System.out.println(" (" + cnt + ")" );
	}
	
	public static void main(String[] args) {
		Ex1  e1 = new Ex1('#');
		Ex1  e2 = new Ex1('#', 20);

		e1.prt();
		e2.prt();
	}
}


/*
[출력결과]
#  #  #  #  #  #  #  #  #  # (10)
#  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  #  # (20)

*/