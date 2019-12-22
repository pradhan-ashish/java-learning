package day3;
// four types of identifiers
//1. Class Identifier
//2. Variable Identifier
//3. Constant Identifier
//4. Method Identifier

public class Identifiers {// here Class Identifier is "Identifiers".
	
		int anyVar =12; // here anyVar is Variable Identifier.
		
		final double VALUE_OF_PIE = 3.14; // Constant Identifier. ( final means it is a constant value)
		
		public void /*method identifier*/ sayHello() {
			System.out.println("Hello...");
		}

}
// Rules
// 1. cannot use digits (0-9) at first place of an identifier ( 2HelloWorld cannot be done).
// 2. But we can use digits in between (Hello2World)
// 3. Cannot use whitespace (any Var)
// 4. We cannot use any special symbols at any places of an identifier ( except _ underscore)
// 5. We can use $ dollar sign at any places of an identifier ($any$Value) but is not encouraged to use. 

//Conventions
//1. 