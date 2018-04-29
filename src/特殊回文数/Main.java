package 特殊回文数;

/**
 * 特殊回文数
 *
 */
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
//		
//		for(int i = 10000; i <= 99999; i++){
//			int one,two,three,four,five;
//			one = i % 10;
//			two = (i / 10) % 10;
//			three = (i /100) % 10;
//			four = (i /1000) % 10;
//			five = i / 10000;
//			
//			if( one+two+three+four+five == n && one == five && two == four){
//				String s = ""+five+four+three+two+one;
//				System.out.println(s);
//			}
//				
//		}
//		
//		for(int i = 100000; i <= 999999; i++){
//			int one,two,three,four,five,six;
//			one = i % 10;
//			two = (i / 10) % 10;
//			three = (i /100) % 10;
//			four = (i /1000) % 10;
//			five = (i / 10000) %10;
//			six = i / 100000;
//			if(one+two+three+four+five+six == n && one == six && two == five && three ==four){
//				String s = ""+six+five+four+three+two+one;
//				System.out.println(s);
//			}
//			
//		}
//
//	}
//
//}


/**
 * 回文数
 */
//public class Main {
//
//	public static void main(String[] args) {		
//		for(int i = 1000; i <= 9999; i++){
//			int one,two,three,four;
//			one = i % 10;
//			two = (i / 10) % 10;
//			three = (i /100) % 10;
//			four = (i /1000) % 10;
//			
//			if(one == four && two == three){
//				String s = ""+four+three+two+one;
//				System.out.println(s);
//			}
//				
//		}
//		
//
//	}
//
//}

/**
 * 特殊的数字
 */
public class Main {

	public static void main(String[] args) {		
		for(int i = 100; i <= 999; i++){
			int one,two,three;
			one = i % 10;
			two = (i / 10) % 10;
			three = (i /100) % 10;
			
			if(one*one*one+two*two*two+three*three*three == i){
				String s = ""+three+two+one;
				System.out.println(s);
			}
				
		}		

	}

}

