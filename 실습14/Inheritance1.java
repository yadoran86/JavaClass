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

	    b2.x = "자바";	
	    System.out.println("객체 b2에 들어있는 x 값 : " + b2.x);

	    B1 b1 = new B1();

	    b1.x = 5000;
	    System.out.println("객체 b1에 들어있는 x 값 : " + b1.x);
	  }
}

/*
객체 b2에 들어있는 x 값 : 자바
객체 b1에 들어있는 x 값 : 5000
*/