package equals_ex1;

public class MyStudent {
	private String name;
	private int grade;

	public MyStudent(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	// equals() 메서드 오버라이딩
//	public boolean equals(Object o) {
//		boolean result = false;
//		if (o instanceof MyStudent) {
//			MyStudent s = (MyStudent) o;
//			if (name.equals(s.name) && (grade == s.grade)) {
//				result = true;
//			}
//		}
//		return result;
//	}
	// toString() 오버라이딩
	public String toString() {
		return "이름 : " + name + ", 학년 : " + grade;
	}
}
