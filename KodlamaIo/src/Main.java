
public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setName("Deniz");
		student.setLastName("Durmaz");
		student.setAge(24);
		student.setEmail("durmazdeniz7@gmail.com");
		student.setPassword("123456");
		
		StudentManager manager =new StudentManager();
	manager.Add(student);
	}

}
