package pk1127;

class Data2{
	private String name;
	private int age;
	private double score;
	
    public void setName(String name)
    {
    	this.name= name;
    }
	
    public void setAge(int age)
    {
    	this.age = age;
    }
    
    public void setScore(double score)
    {
    	this.score = score;
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

public class AppEx3 extends Data2{
	public static void main(String[] args) {
			AppEx3 std= new AppEx3();
			
			std.setName("�ڴ޹�");
			std.setAge(30);
			std.setScore(45.5);
			
			System.out.println( "�̸� : " + std.getName() + "\n"
					          + "���� : " + std.getAge()  + "\n"
							  + "���� : " + std.getScore() );
			
	}

}
