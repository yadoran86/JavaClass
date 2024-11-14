package pk1030;

public class Test3 {
	public static void main(String[] args) {
		String name;
		int[] score;
		
		score = new int[args.length-1];
		name = args[0];
			
		for(int i=1; i<args.length;i++)
				score[i-1] = Integer.parseInt(args[i]);
		
	
		System.out.println("ÀÌ¸§Àº : " +name);
				
		for(int i=0; i<score.length;i++)
				System.out.println("[" + i + "] : "+ score[i]);
	}
}
