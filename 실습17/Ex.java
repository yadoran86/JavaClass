package pk1205;

public class Ex{
		public static void main(String[] args)
		{
			String str = "Hello";
			
			System.out.println("문자열  : "  + str);
			
			if(str.equals("Hello"))
				System.out.println("문자열이 동일합니다.");
			else
				System.out.println("서로 다른 문자열입니다.");

			System.out.println(str.charAt(0));

			if(str.charAt(0) >= 'A'  && str.charAt(0)<= 'Z')
				System.out.println("대문자입니다.");
			else if(str.charAt(0) >= 'a'  && str.charAt(0)<= 'z')
				System.out.println("소문자입니다.");
			else
				System.out.println("알파벳이 아닙니다.");
			
				
			for(int i=0; i<str.length(); i++)
			{
				System.out.print(str.charAt(i) + ", " + (int)(str.charAt(i)) );
			
				if(str.charAt(i) >= 'A' && str.charAt(i) <='Z' )
					System.out.println(" - 대문자입니다  - 소문자로 " + (char)(str.charAt(i) + 32) );
				else if(str.charAt(i) >= 'a' && str.charAt(i) <='z' )
					System.out.println(" - 소문자입니다   - 대문자로 " + (char)(str.charAt(i) - 32) );
				else
					System.out.println(" - 알파벳이 아닙니다");
			}
	
			if(args[0] == "1")
				System.out.println(args[0] + " 신호입니다.");
			else
				System.out.println(args[0] + " 신호입니다.");
			
			if(args[1].charAt(1) >= 'A' && args[1].charAt(1) <='Z' )
				System.out.println("대문자입니다");
			else if(args[1].charAt(1) >= 'a' && args[1].charAt(1) <='z' )
				System.out.println("소문자입니다");
			else
				System.out.println("알파벳이 아닙니다");
		}
}
