package day10;


public class StaticDemo {

	// static variable 
	 public static int a =5;
	
// static method(behavior)
	public static void sayHello() {
		System.out.println("Hello!!");
		
	}

	public static void main(String[] args) {
		System.out.println(a);
		sayHello();
		// no need to create object like non-static object
		
		System.out.println(StaticDemo.a);
		StaticDemo.sayHello();
		// works as above, but this is better way to do.
	}

}
