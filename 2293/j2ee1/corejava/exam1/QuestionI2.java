package j2ee1.corejava.exam1;

public class QuestionI2 {

	public QuestionI2() {
		super();
	}

	static{
		System.out.println("---------I am from static block--------");
	}
	
	{
		System.out.println("---------I am from default block--------");
	}
	
	public static void main(String args[]) {
		QuestionI2 obj1 = new QuestionI2();
		QuestionI2 obj2 = new QuestionI2();
		
		System.out.println("-------------------"+QuestionI3.KEY);
	}
}
