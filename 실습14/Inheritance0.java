package pk1115;

class A {
	  int aa = 1;
}

class B extends A {
	  int bb = 2;
}

class C extends B {
	  int cc = 3;
}

public class Inheritance0{
	  public static void main(String[] args) {
	    C objc = new C();

	    System.out.println("objc��ü�� ��ü�Ӽ����� aa�� ���� " + objc.aa);
	    System.out.println("objc��ü�� ��ü�Ӽ����� bb�� ���� " + objc.bb);
	    System.out.println("objc��ü�� ��ü�Ӽ����� cc�� ���� " + objc.cc);
	  }
}