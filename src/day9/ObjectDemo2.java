package day9;

public class ObjectDemo2 {

	public static void main(String[] args) {
		System.out.println(new ObjectDemo2());// prints packagename.classname@hexadecimal number
		
		ObjectDemo2 ob = new ObjectDemo2();// prints different hexadecmial num
		System.out.println(ob);
		
		ObjectDemo2 obb = new ObjectDemo2();// prints diff hexadecimal num
		System.out.println(obb);
		
		System.out.println(new ObjectDemo2().hashCode());
		System.out.println(ob.hashCode());
		System.out.println(obb.hashCode());

		System.out.println("day9.ObjectDemo2@"+Integer.toHexString(ob.hashCode()));
	}

}
