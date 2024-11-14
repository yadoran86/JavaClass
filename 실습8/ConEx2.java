package pk1023;

public class ConEx2 {
	String s;
	int age;		
	
	public ConEx2(){
		s="홍길동";
		age=20;
	}

	public ConEx2(String s, int age){
		this.s=s;
		this.age=age;
	}	
	void print(){
		System.out.println("이름 : " + s);
		System.out.println("나이 : " + age);
	}

	public static void main(String[] args){
		ConEx2  k1 = new ConEx2();
		ConEx2  k2 = new ConEx2("박길자",58);

		k1.print();		
		k2.print();
	}
}
