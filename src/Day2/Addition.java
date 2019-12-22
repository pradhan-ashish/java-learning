package Day2;

import day10.NonStaticDemo;
import day10.StaticDemo;

public class Addition {

		public static void main(String[] args) {
			int num1 = 5;
			int num2 = 6;
			int sum = num1 + num2;
			System.out.println("Sum is "+sum);
			System.out.println("The sum of "+num1+ " and "+num2+ " is "+sum);
			
		NonStaticDemo ob = new NonStaticDemo();
				
		day10.NonStaticDemoTest obb = new day10.NonStaticDemoTest(); // no need to import // only use this type when u need to call one time
		
		//from day10.NonStaticDemo.java
		System.out.println(ob.a); // this doesnt work because in NonStaticDemo.java  , int a is not public
		ob.sayHello();
		
		//from day10.StaticDemo.java
		System.out.println(StaticDemo.a);
		StaticDemo.sayHello();
		
		}
}
