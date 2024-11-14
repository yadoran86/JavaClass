package pk1113;

public class IfExt1 {
	public static void main(String[] args) {
		int data;
		char c;

		data = 78;
		
		if(data>=90 && data<=100)		c = 'A';
		else if(data>=80 && data<90)	c = 'B';
		else if(data>=70 && data<80)	c = 'C';
		else if(data>=60 && data<70)	c = 'D';
		else	c = 'F';

		System.out.println("당신의 학점은 " + c + "입니다.");
	}
}
