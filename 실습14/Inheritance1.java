package pk1115;

class B1 {
	  int x;
}

class B2 extends B1 {
	  String x;
}

public class Inheritance1 {
	  public static void main(String args[]) {
	    B2 b2 = new B2();

	    b2.x = "�ڹ�";	
	    System.out.println("��ü b2�� ����ִ� x �� : " + b2.x);

	    B1 b1 = new B1();

	    b1.x = 5000;
	    System.out.println("��ü b1�� ����ִ� x �� : " + b1.x);
	  }
}

/*
��ü b2�� ����ִ� x �� : �ڹ�
��ü b1�� ����ִ� x �� : 5000
*/