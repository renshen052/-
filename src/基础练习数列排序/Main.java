package 基础练习数列排序;

/**
 * 不使用java提供的库函数
 */
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		ArrayList<Integer> b = new ArrayList<Integer>();
//		int n = input.nextInt();
//		for(int i = 0; i < n ; i++){
//			b.add(input.nextInt());
//		}
//		
//		for(int i = 0 ; i < n-1 ; i++){
//			for(int j = 0; j < n-1 ; j++){
//				if(b.get(j) > b.get(j+1)){
//					int temp = b.get(j);
//					b.set(j, b.get(j+1));
//					b.set(j+1, temp);
//				}
//			}
//		}
//		
//		for(int i = 0 ; i < n ; i++){
//			System.out.print(b.get(i)+" ");
//		}
//		
//	}
//	
//}

/**
 * 使用java提供的库函数
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> b = new ArrayList<Integer>();
		int n = input.nextInt();
		for(int i = 0; i < n ; i++){
			b.add(input.nextInt());
		}
		Collections.sort(b);
		for(int i = 0 ; i < n ; i++){
			System.out.print(b.get(i)+" ");
		}
		
	}
	
}