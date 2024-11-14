package pk1115;

class AA1 {
	  void show(String str) {
	    System.out.println("상위클래스의 메소드 show(String str)수행 :" + str);
	  }
}

class BB1 extends AA1 {
	  void show() {
	    System.out.println("하위클래스의 메소드 show() 수행");
	  }
}
	  
public class OverrideExam1 {
	  public static void main(String args[]) {
	    BB1 over = new BB1();

	    over.show("홍길동"); 
	    over.show();
	  }
}