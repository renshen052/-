package ������ϰ��������;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int s = 0;
		int k = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i < n ; i++){//���õ��Ƕ�����һ���ʹ���һ��
			s = input.nextInt();     //�����Ϳ���ֱ�����
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
 * �������������Ȼ����ȡ�����Сֵ
 * �˷��˺ܶ���Դ���ڲ���ƽ̨�����г�ʱ
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
