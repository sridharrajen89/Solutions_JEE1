package htc.test;

public class Exercise1 {

	public static void main(String[] args) {
		
		Trainee ent = new Trainee(101, "Vijay", 309664562, "test@gmail.com", "Male", 16);
		System.out.println(ent);
		Batch batch = new Batch(101, "1/1/2016", "12/31/2016");
		System.out.println(batch);
	}
}
