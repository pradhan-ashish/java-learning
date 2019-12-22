package day8;

public class BreakDemo {

	public static void main(String[] args) {
		for (int i=1; i<=200; i++) {// lets say here temperature is increasing by 1
			if (i==101) {
				break;// loop bata bahira lancha to line 12
			}
			System.out.println(i);
		}
		System.out.println("Boiling point of water reached, donot increase temperature");
	}

}
