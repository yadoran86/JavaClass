package pk1030;

public class Test5 {
	String name;
	int[] score;
	
	
	public Test5(String[] args)
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
		Test5   k = new Test5(args);
		
		k.print();
	}
}
