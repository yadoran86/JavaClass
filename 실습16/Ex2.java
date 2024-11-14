package pk1203;

public class Ex2 {
	String name;
	int[] d;
	int sum;
	double avg;
	char c;
	
	void process(String args[]) {
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
	
	void print(){
	System.out.println("[" + name + "]���� ������ [" + d[1] + "] [" + d[2] + "] [" + d[3] + "]�̰�,");
	System.out.println("���� [" + sum + "],");
	System.out.printf("���[%.1f],\n", avg);
	System.out.println("���� [" + c + "] ���� �Դϴ�");
	}

	public static void main(String[] args) {
		Ex2 k=new Ex2();
		k.process(args);
		k.print();
    }
}
