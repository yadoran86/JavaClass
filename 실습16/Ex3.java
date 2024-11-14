package pk1203;


interface A{
	void process(String args[]);
	void print();
}

public class Ex3 implements A{
	String name;
	int[] d;
	int sum;
	double avg;
	char c;
	
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
	System.out.println("[" + name + "]���� ������ [" + d[1] + "] [" + d[2] + "] [" + d[3] + "]�̰�,");
	System.out.println("���� [" + sum + "],");
	System.out.printf("���[%.1f],\n", avg);
	System.out.println("���� [" + c + "] ���� �Դϴ�");
	}

	public static void main(String[] args) {
		Ex3 k=new Ex3();
		k.process(args);
		k.print();
    }
}