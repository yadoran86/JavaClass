package pk1203;


abstract class ABC{
	String name;
	int[] d;
	int sum;
	double avg;
	char c;
	abstract void process(String args[]);
	abstract void print();
}

public class Ex4 extends ABC{

	
	public void process(String args[]) {
		name=args[0];
		
		d=new int[4];
		for (int i=1;i<args.length;i++)
			d[i] = Integer.parseInt(args[i]);
	
		sum = d[1] + d[2] + d[3];
		avg = (double) sum / 3;

		if (avg >= 90 && avg <= 100)
			c = 'A';
		else if (avg >= 80 && avg < 90)
			c = 'B';
		else if (avg >= 70 && avg < 80)
			c = 'C';
		else if (avg >= 60 && avg < 70)
			c = 'D';
		else
			c = 'F';
	}
	
	public void print(){
	System.out.println("[" + name + "]님의 성적은 [" + d[1] + "] [" + d[2] + "] [" + d[3] + "]이고,");
	System.out.println("총점 [" + sum + "],");
	System.out.printf("평균[%.1f],\n", avg);
	System.out.println("학점 [" + c + "] 학점 입니다");
	}

	public static void main(String[] args) {
		Ex4 k=new Ex4();
		k.process(args);
		k.print();
    }
}