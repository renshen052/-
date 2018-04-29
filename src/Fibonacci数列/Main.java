package FibonacciÊıÁĞ;

//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		int m = 0;
//		Scanner input = new Scanner(System.in);
//		m = input.nextInt();
//		System.out.println(f(m));
//	}
//	public static int f(int m ){
//		if(m == 1 || m == 2)return 1;
//		else return (f(m-1))%10007 + (f(m-2))%10007;
//	}
//}

//import java.util.Scanner;  
//
//public class Main {  
//
//  public static void main(String[] args) {  
//      Scanner cin = new Scanner(System.in);  
//      int a = 1, b = 1, ans = 1,c=cin.nextInt();  
//      for (int i = 1; i <=  c- 2; i++) {  
//          ans = (a + b) % 10007;  
//          a = b;  
//          b = ans;  
//      }  
//      System.out.println(ans);  
//  }  
//}  


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int m = 0;
		int s = 1;
		Scanner input = new Scanner(System.in);
		m = input.nextInt();
		int a = 1;
		int b = 1;
		for(int i = 1; i <= m - 2; i++)
		{
			s = (a + b) % 10007;
			a = b;
			b = s;
		}
		System.out.println(s);
	}
}

