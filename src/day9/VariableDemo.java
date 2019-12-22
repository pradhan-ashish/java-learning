package day9;

public class VariableDemo {// block starts here

	int a=5;// instance variable(non static variable) (properties, data,object's member data, attributes, field)
	
	static int x =5;// static variable / class member data
	
	// reference variable(non-static)
	VariableDemo ob = new VariableDemo();
	
	// reference variable(static)
	 static VariableDemo obb= new VariableDemo();
	
	public void print(int x){ // here x is also local variable
		String n="ram";// local variable
		//static int y=6;// error coz cant write static variable in 
	}
	
	public static void main(String[] args) {
		// local variable
		double a=3.5;
		
		// reference variable(local)
		// reference to class name VariableDemo
		VariableDemo ob;
	}

}// end block
// block provides scope
