package pk1127;

public class AppEx1 {

	public void eArray(int[] dt)
	{
		for(int i=0; i<dt.length; i++)
		{
			
			for(int j=i; j<dt.length;j++)
			{
				int temp;
				if(dt[i] > dt[j])
				{
					temp = dt[i];
					dt[i] = dt[j];
					dt[j] = temp;
					
				}
			}
					
		}
	
	}
	
	public static void main(String[] args) {
		AppEx1 obj = new AppEx1();
		int[] data;
		
		data=new int[]{10, 40, 50, 90, 100, 45, 76, 15, 3, 55};
		
		System.out.print("기본데이터 : ") ;
		for(int i=0; i<data.length; i++)
			System.out.print(data[i] + " " );
		System.out.println();
		
		System.out.print("for each 적용 데이터 : ") ;
		for(int n:data)
			System.out.print(n + " " );
		System.out.println();
		
		obj.eArray(data);  // 오름차순 정렬
		
		System.out.print("오름차순 데이터 : ") ;
		for(int n:data)
			System.out.print(n + " " );
		System.out.println();
	}

}
