public class Employee {
	public int age;
	public Employee(int random){
		this.age = random;
	}


	public static void main(String[] args) {
		Employee a = new Employee(18);
		System.out.println(a.age);
	}
}