package pk1205;

public class Ex{
		public static void main(String[] args)
		{
			String str = "Hello";
			
			System.out.println("���ڿ�  : "  + str);
			
			if(str.equals("Hello"))
				System.out.println("���ڿ��� �����մϴ�.");
			else
				System.out.println("���� �ٸ� ���ڿ��Դϴ�.");

			System.out.println(str.charAt(0));

			if(str.charAt(0) >= 'A'  && str.charAt(0)<= 'Z')
				System.out.println("�빮���Դϴ�.");
			else if(str.charAt(0) >= 'a'  && str.charAt(0)<= 'z')
				System.out.println("�ҹ����Դϴ�.");
			else
				System.out.println("���ĺ��� �ƴմϴ�.");
			
				
			for(int i=0; i<str.length(); i++)
			{
				System.out.print(str.charAt(i) + ", " + (int)(str.charAt(i)) );
			
				if(str.charAt(i) >= 'A' && str.charAt(i) <='Z' )
					System.out.println(" - �빮���Դϴ�  - �ҹ��ڷ� " + (char)(str.charAt(i) + 32) );
				else if(str.charAt(i) >= 'a' && str.charAt(i) <='z' )
					System.out.println(" - �ҹ����Դϴ�   - �빮�ڷ� " + (char)(str.charAt(i) - 32) );
				else
					System.out.println(" - ���ĺ��� �ƴմϴ�");
			}
	
			if(args[0] == "1")
				System.out.println(args[0] + " ��ȣ�Դϴ�.");
			else
				System.out.println(args[0] + " ��ȣ�Դϴ�.");
			
			if(args[1].charAt(1) >= 'A' && args[1].charAt(1) <='Z' )
				System.out.println("�빮���Դϴ�");
			else if(args[1].charAt(1) >= 'a' && args[1].charAt(1) <='z' )
				System.out.println("�ҹ����Դϴ�");
			else
				System.out.println("���ĺ��� �ƴմϴ�");
		}
}
