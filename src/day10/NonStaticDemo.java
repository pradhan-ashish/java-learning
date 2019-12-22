package day10;


public class NonStaticDemo {

			// non-static variable 
		 public int a =5;
		
		// non-static method(behavior)
		public void sayHello() {
			System.out.println("Hello!!");
		}

		public static void main(String[] args) {
			NonStaticDemo ob = new NonStaticDemo();
			// to access above non-static variable a=5, you need to call NonStaticDemo ob in main method
			System.out.println(ob.a);
			
			ob.sayHello();
			// need ob.sayHello() to call non-static method inside main method

		}

	}