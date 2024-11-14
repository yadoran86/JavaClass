package pk1025;

public class ObjEx4 {
	int  avg;
	char hak;
	
	public ObjEx4()
	{
		avg = 78;
	}
	
	public ObjEx4(int avg)
	{
		this.avg = avg;
	}
	
	public void cal()
	{
		if(avg>=90 && avg<=100)		hak = 'A';
		else if(avg>=80 && avg<90)	hak = 'B';
		else if(avg>=70 && avg<80)	hak = 'C';
		else if(avg>=60 && avg<70)	hak = 'D';
		else	hak = 'F';
	}
	
	public void prt()
	{
		System.out.println("점수는 : " + avg);
		System.out.println("학점은 : " + hak);
	}
	
	public static void main(String[] args) 
	{
		ObjEx4 obj1=new ObjEx4();
		ObjEx4 obj2=new ObjEx4(90);
		
		
		obj1.cal();
		obj1.prt();		
		
		obj2.cal();
		obj2.prt();		
	
	}
}
