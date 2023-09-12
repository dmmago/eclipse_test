import eclipse_first.Student;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("鈴木");
		s1.setScore(80);
		Student s2 = new Student();
		s2.setName("桜井");
		s2.setScore(-50);
		
		System.out.println(s1.getName() + "さん:" + s1.getScore() + "点" );
		System.out.println(s2.getName() + "さん:" + s2.getScore() + "点");
	}

}
