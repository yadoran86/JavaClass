package pk1115;

class AA1 {
	  void show(String str) {
	    System.out.println("����Ŭ������ �޼ҵ� show(String str)���� :" + str);
	  }
}

class BB1 extends AA1 {
	  void show() {
	    System.out.println("����Ŭ������ �޼ҵ� show() ����");
	  }
}
	  
public class OverrideExam1 {
	  public static void main(String args[]) {
	    BB1 over = new BB1();

	    over.show("ȫ�浿"); 
	    over.show();
	  }
}