package pk1115;


class AA2 {
	  void show() {
	    System.out.println("����Ŭ������ �޼ҵ� show(String str) ����");
	  }
}

class BB2 extends AA2 {
	  void show() {
	    System.out.println("����Ŭ������ �޼ҵ� show() ����");
	  }
	  
}
	  
public class OverrideExam2 {
	  public static void main(String args[]) {
	    BB2 over = new BB2();

	    over.show(); 

	  }
}
