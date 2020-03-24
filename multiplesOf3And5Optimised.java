import java.io.*;
import java.util.*;
class multiplesOf3And5Optimised {
	static int returnSumOfMultiples(int x) {
		int n= 1000;
		int d = n/x;
		int y = ((d)*(d-1))/2;
		return x * y;
	}
	public static void main(String[] args) {
		int s,s3,s5,s15;
		s3 = returnSumOfMultiples(3);
		s5 = returnSumOfMultiples(5);
		s15 = returnSumOfMultiples(15);
		s = (s3 + s5) - s15;
		System.out.print(s);

	}
}
