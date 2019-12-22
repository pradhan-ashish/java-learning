package day10;

public class StaticDemoTest {

	public static void main(String[] args) {
		//System.out.println(a);
		//sayHello();
		// this would have worked if it was in same class (staticDemo)
		
		System.out.println(StaticDemo.a);
		StaticDemo.sayHello();
		// need Static.Demo.sayHello() - which is ClassName.method()
	}

}
