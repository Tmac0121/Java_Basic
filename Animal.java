public class Animal{

	String breed;
	String color;
	int age;

	Animal(String i, String j,int k){
		this.breed = i;
		this.color = j;
		this.age = k;
	}

	void printOld(){
		System.out.println("This animal is " + this.age + " years old.");
	}

	void printBreed(){
		System.out.println("This animal`s breed is " + this.breed);
	}

	void printColor(){
		System.out.println("This animal shows " + this.color);
	}

	public static void main(String[] args) {
		Animal b = new Animal("cat", "red", 8);
		b.printOld();
		b.printBreed();
	}
}





class Dog extends Animal{

	Dog(int i){
		super(i);
	}
	// String owner;
	// int kidNum;

	// Dog(int i){
	// 	this.age = i;
	// }

	void printOld(int i){
		System.out.println("This dog is " + i + "years old.");
	}
}