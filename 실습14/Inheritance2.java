package pk1115;

class C1 {
	  static int x;
	  static int y;
}

class C2 extends C1 {
	  static String x;
}

public class Inheritance2 {
	  public static void main(String args[]) {
	    C2.x = "�ڹ�";
	   
	    C1.x = 30000;
	    C1.y = 20000;
	    System.out.println("Ŭ���� ���� C2.x �� : " + C2.x);
	    System.out.println("Ŭ���� ���� C2.y ��(C1���κ��� ���) : " + C2.y);
	    System.out.println("Ŭ���� ���� C1.x �� : " + C1.x);
	  }
}
