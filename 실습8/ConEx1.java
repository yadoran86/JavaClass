package pk1023;

public class ConEx1 {
	String s;
	int age;
		
	void print()
	{
		System.out.println("이름 : " + s);
		System.out.println("나이 : " + age);
	}

	public static void main(String[] args)
	{
		ConEx1  k;

		k = new ConEx1();

		k.s="홍길동";
 		k.age=20;
		
		k.print();		
	}
	
}
