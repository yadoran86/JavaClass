package pk1023;

public class ConEx2 {
	String s;
	int age;		
	
	public ConEx2(){
		s="ȫ�浿";
		age=20;
	}

	public ConEx2(String s, int age){
		this.s=s;
		this.age=age;
	}	
	void print(){
		System.out.println("�̸� : " + s);
		System.out.println("���� : " + age);
	}

	public static void main(String[] args){
		ConEx2  k1 = new ConEx2();
		ConEx2  k2 = new ConEx2("�ڱ���",58);

		k1.print();		
		k2.print();
	}
}
