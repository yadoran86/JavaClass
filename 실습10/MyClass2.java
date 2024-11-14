package pk1030;

public class MyClass2 {
	String name;
	int age;

	public MyClass2(){
		name = "ȫ�浿";
	}
	public MyClass2(String n){
		name = n;
	}

	public MyClass2(int a, String n){
		age = a;
		name = n;
	}
	public MyClass2(String n, int a){
		age = a;
		name = n;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}
}
