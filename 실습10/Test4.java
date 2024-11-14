package pk1030;

public class Test4 {
	String name;
	int[] score;
	
	void input(String[] args)
	{
		score = new int[args.length-1];
		name = args[0];
			
		for(int i=1; i<args.length;i++)
				score[i-1] = Integer.parseInt(args[i]);
	}

	void print()
	{
		System.out.println("ÀÌ¸§Àº : " +name);
				
		for(int i=0; i<score.length;i++)
				System.out.println("[" + i + "] : "+ score[i]);
	}
	
	public static void main(String[] args)
	{
		Test4   k = new Test4();
		
		k.input(args);
		k.print();
	}
}
