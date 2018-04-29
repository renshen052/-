package 基础练习报时助手;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int s = input.nextInt();
		int f = input.nextInt();
		String str = "";
		
		if(f == 0)str = toString(s) + " o'clock";
		else str = toString(s) + " " + toString(f);
		System.out.println(str);
			
	}
	
	public static String toString(int time){
		String str = "";
		String []timeWord = {"zero","one","two","three","four","five","six","seven","eight","nien","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};                                            
		String []th = {"twenty","thirty","forty","fifty"};
		if(time <= 20)str = timeWord[time];
		else {
			int one = time % 10;
			int two = time / 10;
			if(one == 0)str = th[two-2];
			else str = th[two-2]+ " " + timeWord[one];
		}
		return str;
	} 

}

