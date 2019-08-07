public class Car{

	int wheelNum;
	String color;

	Car(String i){
		this.color = i;
	}

	public static void main(String[] args) {
		Car a = new Car("Red");
		System.out.println(a.color);
	}
}