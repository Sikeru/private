package ex14;

public class StudentTest2 {

	public static void main(String[] args) {
		Student s = new University("홍길동", 3, 20);

//		System.out.println(s.getCourses);
		University u = (University) s;
		System.out.println("학점은 >>" + u.getCourses() + "점");
	}

}
