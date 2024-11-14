package pk1127;

public class AppEx0_1 {
	
	public void eSwap(int[] d)
	{
		int tmp;
		
		tmp = d[0];
		d[0] = d[1];
		d[1] = tmp;
		
	}
	
	public static void main(String[] args) {
		AppEx0_1   k  = new  AppEx0_1();
		int[] data = new int[2];
		
		data[0]=10;
		data[1]=20;
		
		System.out.println("원본 데이터 : x="+ data[0] + " , y="+ data[1] );
		
		k.eSwap(data);
		
		System.out.println("교체된 데이터 : x="+ data[0] + " , y="+ data[1] );
	}
}
