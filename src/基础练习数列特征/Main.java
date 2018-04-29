package 基础练习数列特征;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int s = 0;
		int k = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i < n ; i++){//采用的是读进来一个就处理一个
			s = input.nextInt();     //读完后就可以直接输出
			k += s;
			
			if(min > s)min = s;
			if(max < s)max = s;
		}
		System.out.println(max);
		System.out.println(min);		
		System.out.println(k);
	}
	
}


/**
 * 这个是先排了序，然后再取最大最小值
 * 浪费了很多资源，在测试平台上运行超时
 */
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
//		int []s = new int[n];
//		int k = 0;
//		for(int i = 0 ; i < n ; i++){
//			s[i] = input.nextInt();
//			k += s[i];
//		}
//		sort(s);
//		System.out.println(s[n-1]);
//		System.out.println(s[0]);		
//		System.out.println(k);
//	}
//	
//	public static void sort(int []s){
//		int len = s.length;
//		for(int i = 0 ; i < len-1 ; i++){
//			for(int j = 0 ; j < len-1; j++){
//				if(s[j] > s[j+1]){
//					int temp = s[j];
//					s[j] = s[j+1];
//					s[j+1] = temp;
//				}
//			}
//		}
//	}
//}
