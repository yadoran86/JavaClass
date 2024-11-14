package pk1115;


class AA2 {
	  void show() {
	    System.out.println("상위클래스의 메소드 show(String str) 수행");
	  }
}

class BB2 extends AA2 {
	  void show() {
	    System.out.println("하위클래스의 메소드 show() 수행");
	  }
	  
}
	  
public class OverrideExam2 {
	  public static void main(String args[]) {
	    BB2 over = new BB2();

	    over.show(); 

	  }
}
