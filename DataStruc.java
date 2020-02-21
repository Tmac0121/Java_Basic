class Et{
	public static void sayHi(){
		System.out.println("Hi");
	}
		// for(int i :a){
		// 	System.out.println(a);
		// }
		
	}

public class Datastruc extends Et{
	public static void sayHi(){
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		Et a = new Datastruc();
		a.sayHi();
	}
	
}