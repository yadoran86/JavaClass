package pk1025;

class Box {
  	long idNum;
  	static long boxID = 0;   
	
  	public Box() {
   		 idNum = boxID++;     
  	}
}

public class StaticTest {
  	public static void main(String args[]) {
    		Box mybox1 = new Box();
    		Box mybox2 = new Box();
    		Box mybox3 = new Box();
    		Box mybox4 = new Box();

    		System.out.println("mybox1�� id ��ȣ : " + mybox1.idNum);
    		System.out.println("mybox2�� id ��ȣ : " + mybox2.idNum);
    		System.out.println("mybox3�� id ��ȣ : " + mybox3.idNum);
    		System.out.println("mybox4�� id ��ȣ : " + mybox4.idNum);
    		System.out.println("��ü �ڽ��� ������ "+ Box.boxID + "�Դϴ�.");
   	 	
  	}
}