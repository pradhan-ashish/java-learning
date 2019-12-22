package day5;

public class LogicalOperator {

	public static void main(String[] args) {
		// Logical Operator: && and, ||  or, ! not
		
		// && (for and) all has to be true for result to be true
		// || (for or) any one of the statements has to be true
		
		// example
		boolean KtmCapitalOfNepal = true;
		boolean PkrCapitalOfNepal = false;
		
		System.out.println(KtmCapitalOfNepal && PkrCapitalOfNepal);// result will be false 
		System.out.println(KtmCapitalOfNepal || PkrCapitalOfNepal);// result will be true

	}

}
