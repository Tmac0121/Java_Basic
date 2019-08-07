public class Demo2{

	String name;
	int age;

	//********** Constructor ************

	// Demo2(String i){
	// 	this.name = i;
	// }

	// final void sayHi(){					// final 后面接的方法不能在子类中被override；
	// 	System.out.println("Hi");
	// }

	// final double GRAVITY_INDEX = 9.8;		// final 定义的变量是一个常量，且变量名可以突破大小驼峰的限制；

	void forceSayHi(Demo2 j){
			j.sayHi();					//多态性； 在j进来之前不知道是Demo2还是Student，所以不知道执行哪个sayHi；
	}

	// Demo2(int i){
	// 	System.out.println("I am father");
	// 	this.age = i;
	// }

	public static void main(String[] args){
		// Demo2 a = new Demo2();		//constructor关键字：new;
		Student a = new Student();
		Demo2 b = new Demo2();
		Demo c = new Student();			// c 能做的事情受限于父类，父类能做的c才能做；c做完事情的结果与子类相同；
		// a.sayHi();		//
		// sayHi();		// 因为是static sayHi，所以不需要具体的object来执行；即有static可以没有对象执行，没有static一定要有对象执行；
	}


}


class Student extends Demo2 {
	void takeExam(){
		System.out.println("Score");
	}

	void sayHi(String target){
		system.out.println("Hi," + target);
	}

	// Student(int i){
	// 	super(i+22);			// super 会将子类的 i+22 传递给父类； 而且super的constructor必须写在第一行；
	// 	super.sayHi()；			// 让父类执行sayHi；
	// 	System.out.println("I am son");
	// }
}