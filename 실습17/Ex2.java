package pk1205;

public class Ex2 {
	 public boolean isNumeric(String s) 
	 {
         try {
                Double.parseDouble(s);
                return true;
         } catch (Exception e) {
              return false;
        }
     }
	 
	public static void main(String[] args)
	{
		Ex2 k =new Ex2();
		
		String str = "g";   //str="123";
		if (k.isNumeric(str))
				System.out.println("숫자입니다.");
		else
			System.out.println("숫자가 아닙니다.");
	}
}