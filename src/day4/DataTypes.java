



package day4;

public class DataTypes {
	public static void main(String[] args) {
		
		String gasType = "unleaded";  // here string is datatype, gasType is variable, = is operator, unleaded is literals.
		double gasAmount = 12;
		final double PRICE_PER_GALLON = 2.08;
		boolean b = true;
		char c = '@';  
		
		int a = 5;    // int, long, byte, short for numbers
		
		long n = 654654;
		short s= 5;
		float f = 5.4F;
		
		
		// MAXIMUM AND MINIMUN RANGES OF DIFFERENT DATATYPES
		
		
		byte b1 = 127; // max range
		byte b2 = -128; //min range
		
		short s1 = 32767; //max
		short s2 = -32768; //min
		
		System.out.println(Integer.MAX_VALUE);
		int i1 =2147483647; //max
		int i2 = -2147483648; //min
		
		System.out.println(Long.MAX_VALUE);
		long l1 = 9223372036854775807L; //max value
		long l2 = -9223372036854775808L; //min value
		
		System.out.println(Double.MAX_VALUE);
		double d = 1.7976931348623157E308; // max range
		double d1 = 4.9E-324; // min range
		
		System.out.println(Float.MAX_VALUE);
				
		char c1 =0;
		char c2 = 65535;
		
		
	}

}