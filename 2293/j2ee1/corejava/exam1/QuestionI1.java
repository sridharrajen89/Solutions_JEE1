package j2ee1.corejava.exam1;

public class QuestionI1 {

	int val;
	
	public QuestionI1() {
		super();
		System.out.println("------I am from Constructer-------"+val);
	}
	
	
	public QuestionI1(int val) {
		super();
		this.val = val;
		System.out.println("------I am from parameterized Constructer-------"+val);
	}

	public void setVal(int val) {
		this.val = val;
	}

	public static void main(String args[]) {
		QuestionI1 obj = new QuestionI1(2);
		QuestionI1 obj2 = new QuestionI1(3);
		obj.setVal(5);
		System.out.println(obj.val);
		obj.setVal(6);
		System.out.println(obj.val);
	}
	
}
