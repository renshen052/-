package ������ϰ01�ִ�;

import java.util.Scanner;

public class Main_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int []s = new int[n];
		for(int i = 0 ; i < n ; i++){
			s[i] = input.nextInt();
		}
		int m = input.nextInt();
		System.out.println(request(m,s));
		
	}
	
	public static int request(int m,int []s){
		for(int i= 0 ; i < s.length ; i++){
			if(s[i] == m){
				return i+1;
			}
		}
		return -1;
	}

}
