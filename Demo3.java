public class Demo3{			//红色的符号表示平行关系。可以同时存在；
	public static void main(String[] args) {
		// Human a = new Human();
		// System.out.println(a.age);
		// Person a = new Person("XiaoMing");
		// Person b = new Person("XiaoMing");
		// Person c = a;

		// Pencil a = new Pencil("red");
		// Pencil b = new Pencil("red");

		// System.out.println(a);
		// System.out.println(a==b);		//false
		// System.out.println(a==c);		//true
		// System.out.println(a.equals(b));
		Box<Pen> a = new Box<Pen>();
		Box<Pencil> b = new Box<Pencil>();
		Box<Integer> c = new Box<Integer>();

		Pen m = new Pen();
		Pencil n = new Pencil();
		a.putIntoBox(n);				//报错，因为a是只能放pen的box，不能放pencil；
	}
}

//*********  abstract class  *************
abstract class Person{				//抽象class中的method可以是抽象的，也可以是非抽象的；但是抽象class中不能被创建对象；
	//创建一个abstract method，后面没有{};
	abstract void sayHi();			//非抽象class中不能有抽象method；所以一个非抽象class继承一个抽象class，只能override其中的抽象method；

	void sayHi(int i){
		System.out.println(i);
	}


}

class Pencil{
	String color;

	Pencil(String j){
		this.color = j;
	}

	public Boolean equals(Pencil m){
		return this.color == m.color;
	}
}

class Pen{
	String color;
}

class Box<T>{		//<>里面放一个class名字；
	T kind;			//kind代表class的名字，是generic type；
	int size;
	void putIntoBox(T a){
		this.size++;
	}
}

class Person{
	String name;
	Person(String j){
		this.name = j;
	}

	public String toString(){			//是system.out.print的一个指导器, s.o.p会自动去找toString方法；
		return this.name;
	}
}

class Student extends Person implements Human,Xxx,Yyyy{		//一个class后面只能继承一个父类，但是可以接很多接口；抽象类和具体类可以继承抽象类，但是抽象类不能继承具体类；
	void sayHi(){
		System.out.println("Hello");	//强制性让继承的非抽象class override这个抽象class中的抽象method；
		private int age = 18;			//封装性 与private关键字是分割不开的；
	}

	int getAge(){
			return this.age;
	}

	void rewriteAge(int i){

	}
}

//********  interface  ************
interface Human{
	public abstract void sayHi();			//因为interface中的所有method都是public abstract，所以可以省略不写，默认是public abstract；
	void sayHi(int i);						//interface比abstract class慢，主因dynamic dispatch；
}

