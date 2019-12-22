package day8;

public class ContinueDemo {

	public static void main(String[] args) {
		System.out.println("");
		
		for (int i=1; i<=5; i++) {
			
			if (i==3) {
				continue;// just like break it will not print 3 , but will continue to 4 and 5
			}
			System.out.println(i);
		}
		System.out.println("exit");
	}

	

}
