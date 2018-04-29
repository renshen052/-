package 基础练习十进制转十六进制;


/**
 * 没有使用java自带进制转换函数
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		int n = input.nextInt();
		
		int y = 0;//余数
		while(true){
			y = n % 16;
			n = n / 16;
			switch(y){
			case 10:list.add("A"); break;
			case 11:list.add("B"); break;
			case 12:list.add("C"); break;
			case 13:list.add("D"); break;
			case 14:list.add("E"); break;
			case 15:list.add("F"); break;
			default:list.add(Integer.toString(y)); break;
			}	
			if(n == 0)break;
		}
		
		for(int i = list.size()-1; i >= 0; i--){
			System.out.print(list.get(i));
		}
	}
}


/**
 * 使用java自带进制转换函数
 */

//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		int m = input.nextInt();
//		System.out.println(Integer.toHexString(m));
//	}
//}

