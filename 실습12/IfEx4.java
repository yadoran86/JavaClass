package pk1106;
import java.util.*;

public class IfEx4 {
	int data;
	char c;
	String name;


	void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        name = sc.next();
        System.out.print("점수를 입력하세요 : ");
        data = sc.nextInt();
        sc.close();
	}
		
	void process()
	{
		if(data>=90 && data<=100)		c = 'A';
		else if(data>=80 && data<90)	c = 'B';
		else if(data>=70 && data<80)	c = 'C';
		else if(data>=60 && data<70)	c = 'D';
		else	c = 'F';
	}
	
	void print()
	{
		System.out.println("이름 : " + name + 
				        "\n성적 : " + data +
				        "\n학점 : " + c);
	}
	
	public static void main(String[] args) {
		        IfEx4 k1 = new IfEx4();
		        
		        k1.input();
		        k1.process();
		        k1.print();
		        
		        

	}
}
