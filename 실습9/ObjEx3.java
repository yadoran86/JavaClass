package pk1025;

public class ObjEx3 {
	public static void main(String[] args) {
		int  avg;
		char hak;
	
		avg = 78;
		
		if(avg>=90 && avg<=100)		hak = 'A';
		else if(avg>=80 && avg<90)	hak = 'B';
		else if(avg>=70 && avg<80)	hak = 'C';
		else if(avg>=60 && avg<70)	hak = 'D';
		else	hak = 'F';
		
		System.out.println("점수는 : " + avg);
		System.out.println("학점은 : " + hak);
	}
}
