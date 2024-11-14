package pk1127;


public class AppEx0 {
	public static void main(String[] args) {
		int x, y, temp;
		
		x=10;
		y=20;
		
		System.out.println("원본 데이터 : x="+ x + " , y="+ y );
		
		temp = x;
		x=y;
		y=temp;
		
		System.out.println("교체된 데이터 : x="+ x + " , y="+ y );
	}

}
