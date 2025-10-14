package nestedClasses;

public class TestBook {

	public static void main(String[] args) {
		Book b=new Book();
		Book b1=new Book();
		Book.Lesson l1=b1.new Lesson();
		l1.m1();
		System.out.println("This method are toString(): "+b.toString());
		

	}

}
