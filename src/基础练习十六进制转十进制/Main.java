package 基础练习十六进制转十进制;

/**
 * 使用了java自带进制转换函数
 */
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		String str = input.next();
//		if(str.length() < 8){
//			Integer m = Integer.valueOf(str, 16);
//			System.out.println(m);			
//		}		
//		else
//		{
//			long seven = 16*16*16*16*16*16*16;
//			long six = 16*16*16*16*16*16;
//			long five = 16*16*16*16*16;
//			long s = toInt(str.charAt(0))*seven + toInt(str.charAt(1))*six + toInt(str.charAt(2))*five + toInt(str.charAt(3))*16*16*16*16 + toInt(str.charAt(4))*16*16*16 + toInt(str.charAt(5))*16*16 + toInt(str.charAt(6))*16 + toInt(str.charAt(7));			
//			System.out.println(s);
//		}
//						
//	}
//	
//	public static long toInt(char a){
//		switch(a){
//		case '0':return 0;
//		case '1':return 1;
//		case '2':return 2;
//		case '3':return 3;
//		case '4':return 4;
//		case '5':return 5;
//		case '6':return 6;
//		case '7':return 7;
//		case '8':return 8;
//		case '9':return 9;
//		case 'A':return 10;
//		case 'B':return 11;
//		case 'C':return 12;
//		case 'D':return 13;
//		case 'E':return 14;
//		case 'F':return 15;
//		default: break; 
//		}
//		return 0;
//	}
//}



/**
 * 没有使用java自带进制转换函数
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long seven = 16*16*16*16*16*16*16;
		long six = 16*16*16*16*16*16;
		long five = 16*16*16*16*16;
		Scanner input = new Scanner(System.in);
		String str = input.next();

		int len = str.length();
		long s = 0;
		switch(len){
		case 1:
			s = toInt(str.charAt(0));
			System.out.println(s);
			break;
		case 2:
			s = toInt(str.charAt(0))*16 + toInt(str.charAt(1));
			System.out.println(s);
			break;
		case 3:
			s = toInt(str.charAt(0))*16*16 + toInt(str.charAt(1))*16 + toInt(str.charAt(2));
			System.out.println(s);
			break;
		case 4:
			s = (toInt(str.charAt(0))*16*16*16 + toInt(str.charAt(1))*16*16 + toInt(str.charAt(2)))*16 + toInt(str.charAt(3));
			System.out.println(s);
			break;
		case 5:
			s = toInt(str.charAt(0))*16*16*16*16 + toInt(str.charAt(1))*16*16*16 + toInt(str.charAt(2))*16*16 + toInt(str.charAt(3))*16 + toInt(str.charAt(4));
			System.out.println(s);
			break;
		case 6:
			s = toInt(str.charAt(0))*five + toInt(str.charAt(1))*16*16*16*16 + toInt(str.charAt(2))*16*16*16 + toInt(str.charAt(3))*16*16 + toInt(str.charAt(4))*16 + toInt(str.charAt(5));
			System.out.println(s);
			break;
		case 7:
			s = toInt(str.charAt(0))*six + toInt(str.charAt(1))*five + toInt(str.charAt(2))*16*16*16*16 + toInt(str.charAt(3))*16*16*16 + toInt(str.charAt(4))*16*16 + toInt(str.charAt(5))*16 + toInt(str.charAt(6));
			System.out.println(s);
			break;
		case 8:
			s = toInt(str.charAt(0))*seven + toInt(str.charAt(1))*six + toInt(str.charAt(2))*five + toInt(str.charAt(3))*16*16*16*16 + toInt(str.charAt(4))*16*16*16 + toInt(str.charAt(5))*16*16 + toInt(str.charAt(6))*16 + toInt(str.charAt(7));
			System.out.println(s);
			break;
			default: break;
		}
	}
	
	public static long toInt(char a){
		switch(a){
		case '0':return 0;
		case '1':return 1;
		case '2':return 2;
		case '3':return 3;
		case '4':return 4;
		case '5':return 5;
		case '6':return 6;
		case '7':return 7;
		case '8':return 8;
		case '9':return 9;
		case 'A':return 10;
		case 'B':return 11;
		case 'C':return 12;
		case 'D':return 13;
		case 'E':return 14;
		case 'F':return 15;
		default: break; 
		}
		return 0;
	}

}
