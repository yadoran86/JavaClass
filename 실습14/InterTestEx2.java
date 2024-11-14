package pk1115;

interface Inter1{
	public int getA();
  }
 
interface Inter2{
	public int getA();
}

interface Inter3 extends Inter1,Inter2{
	public int getData();
}

public class InterTestEx2 implements Inter3{
	int a = 100;
	public int getA(){
		return a;
	}
	public int getData(){
		return a+10;
	}
	public static void main(String[] args){
		InterTestEx2 it = new InterTestEx2();
		Inter1 it1 = new InterTestEx2(); //it;
		Inter2 it2 = new InterTestEx2(); //it;
		Inter3 it3 = new InterTestEx2(); //it;
		
		System.out.println(it.getA());
		System.out.println(it.getA());
		System.out.println(it.getData());
	
		System.out.println(it1.getA());
		System.out.println(it2.getA());
		System.out.println(it3.getData());
	}
  }
