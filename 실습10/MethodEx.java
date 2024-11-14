package pk1030;

public class MethodEx {
	public int sum(int a, int b){ 
		return a+b;
	}
	
	public static void main(String[] args){
		MethodEx me = new MethodEx();
		int res;
		
		res= me.sum(1000, -10);
		System.out.println("res="+res);
	}
}
