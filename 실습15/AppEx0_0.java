package pk1127;

public class AppEx0_0 {
	
	public void eSwap(int x, int y)
	{
		int temp;
		
		temp = x;
		x=y;
		y=temp;
		
	}
	
	public static void main(String[] args) {
		AppEx0_0   k  = new AppEx0_0();
		int x, y;
		
		x=10;
		y=20;
		
		System.out.println("���� ������ : x="+ x + " , y="+ y );
		
		k.eSwap(x, y);
		
		System.out.println("��ü�� ������ : x="+ x + " , y="+ y );
	}
}
