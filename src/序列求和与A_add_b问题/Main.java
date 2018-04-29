package 序列求和与A_add_b问题;

/**
 * 序列求和
 */
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		long  s = 0 ;
//		long n = input.nextLong();
//		s = ((1 + n)* n)/2;
//		System.out.println(s);
//	}
//
//}

/**
 * A+B问题  
 */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int s = a + b;
		System.out.println(s);
	}

}