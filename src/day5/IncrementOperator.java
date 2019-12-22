package day5;

public class IncrementOperator {

	public static void main(String[] args) {
		// 3. Increment/ Decrement operator
				// ++ --
				// Post/ Pre Increment, a++, ++a
				// Post/ Pre Decrement, a--, --a
				
				int c = 5;
				// if you want to increase by just one
				c++; //c = c+1;
				System.out.println(c);
				
				// next example
				int i =4;
				System.out.println(i);// [4] because i is simply 4 here.
				System.out.println(i++);// still [4] because this is post increment ++. first it operates, i.e, prints i=4, and then increases by 1 for next;
				System.out.println(i);// [5] because in previous one, it already increased i to 5 from 4.
				
				// next example
				 int x=5;
				 int y =x++;
				 System.out.println(x);//[6] because x++ is already increased by the end of last step
				 System.out.println(y);//[5] because x++ is post increments, i.e, y= 5(present value of x before increment) since increment is post.
				 
				 // next example
				 int j =5;
				 j= j++ + ++j + j +1;
				 System.out.println(j);//[20] because [ 5(but increased by 1 for next step makes it 6) + and again increased by 1(pre) makes it 7 + new value 7 + 1
				 
				
	}

}
