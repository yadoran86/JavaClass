package pk1023;

public class ConEx3 {
	int num;

	public ConEx3() {
		num = 2;
	}

	public ConEx3(int num){
		this.num = num;
	}

	public void prt(){
		System.out.println(num + "´Ü");
		for(int i=1; i<=9; i++)
			System.out.println(num + "*" + i + "=" + (num*i));
	}

	public static void main(String[] args){
		ConEx3 obj1 = new ConEx3();
		ConEx3 obj2 = new ConEx3(4);
		ConEx3 obj3 = new ConEx3(7);

 		obj1.prt();
		obj2.prt();
		obj3.prt();
	}
}
