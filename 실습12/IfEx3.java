package pk1106;

public class IfEx3 {
	int data;
	char c;
	String name;


	void input(String name, int data) {
		this.name = name;
		this.data = data;
	}
	
	void input()
	{
		this.name = "홍길동";
		this.data = 78;
	}
	
	void process()
	{
		if(data>=90 && data<=100)		c = 'A';
		else if(data>=80 && data<90)	c = 'B';
		else if(data>=70 && data<80)	c = 'C';
		else if(data>=60 && data<70)	c = 'D';
		else	c = 'F';
	}
	
	void print()
	{
		System.out.println("이름 : " + name + 
				        "\n성적 : " + data +
				        "\n학점 : " + c);
	}
	
	public static void main(String[] args) {
				IfEx3 k1 = new IfEx3();
				IfEx3 k2 = new IfEx3();
				
				k1.input();
				k1.process();
				k1.print();
				
				k2.input("박미자", 96);
				k2.process();
				k2.print();
	}
}
