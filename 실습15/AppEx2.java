package pk1127;

class Data{
	private String name;
	private int age;
	private double score;
	
	public Data(String name, int age, double score)
	{
		this.name=name;
		this.age=age;
		this.score=score;
	}
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	
	public double getScore()
	{
		return score;
	}
}

public class AppEx2 {
	public static void main(String[] args) {
			String[] n = new String[]{"�ڴ޹�","�۽ÿ�"};

			for(String d:n)
				System.out.println(d);
			
			
			Data std= new Data("ȫ�浿",20,30.5);				
			System.out.println( "�̸� : " + std.getName() + "\n"
					          + "���� : " + std.getAge()  + "\n"
							  + "���� : " + std.getScore() );
			
	}

}
