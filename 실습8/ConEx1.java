package pk1023;

public class ConEx1 {
	String s;
	int age;
		
	void print()
	{
		System.out.println("�̸� : " + s);
		System.out.println("���� : " + age);
	}

	public static void main(String[] args)
	{
		ConEx1  k;

		k = new ConEx1();

		k.s="ȫ�浿";
 		k.age=20;
		
		k.print();		
	}
	
}
