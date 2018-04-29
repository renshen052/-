package 基础练习十六进制转八进制;

/**
 * 这是完全正确的
 */
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] sts = new String[n];
        for(int i=0;i<n;i++){
            sts[i] = sc.next();
        }
        sc.close();
        for(int i=0;i<n;i++){
            String strBinary = toBinary(sts[i]);
            int len_strBin = strBinary.length();
            if(len_strBin%3==1) strBinary = "00"+strBinary;
            if(len_strBin%3==2) strBinary = "0"+strBinary;
            String strOctal = toOctal(strBinary);
            System.out.println(strOctal);
        }
    }
    private static String toOctal(String strBinary) {
        int len = strBinary.length();
        int k;
        StringBuffer stb = new StringBuffer();
        if(strBinary.substring(0, 3).equals("000"))
            k=3;
        else
            k=0;
        for(int i=k;i<len-2;i+=3){
            switch (strBinary.substring(i, i+3)) {
                case "000":stb.append("0");break;
                case "001":stb.append("1");break;
                case "010":stb.append("2");break;
                case "011":stb.append("3");break;
                case "100":stb.append("4");break;
                case "101":stb.append("5");break;
                case "110":stb.append("6");break;
                case "111":stb.append("7");break;
                default:break;
            }
        }
        return stb.toString();
    }
    private static String toBinary(String strHex) {
        int len_str = strHex.length();
        StringBuffer stb = new StringBuffer();
        for(int i=0;i<len_str;i++){
            switch (strHex.charAt(i)) {
                case '0':stb.append("0000");break;
                case '1':stb.append("0001");break;
                case '2':stb.append("0010");break;
                case '3':stb.append("0011");break;
                case '4':stb.append("0100");break;
                case '5':stb.append("0101");break;
                case '6':stb.append("0110");break;
                case '7':stb.append("0111");break;
                case '8':stb.append("1000");break;
                case '9':stb.append("1001");break;
                case 'A':stb.append("1010");break;
                case 'B':stb.append("1011");break;
                case 'C':stb.append("1100");break;
                case 'D':stb.append("1101");break;
                case 'E':stb.append("1110");break;
                case 'F':stb.append("1111");break;
                default:break;
            }
        }
        return stb.toString();
    }
}







/**
 * 这个在本jdk环境下可以运行，提交到蓝桥测评运行错误
 * 蓝桥测试平台是jdk1.6，，该版本的witch中没有String类型的比较
 * 在jdk1.7以后才加入的
 * jdk1.6的switch里只可以比较byte、short、int、char（JDK1.6），还有枚举类型，
 * */
//import java.util.*;
//
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);		
//		int n = input.nextInt();
//		String []str = new String[n];
//		for(int i = 0 ; i < n ; i++){
//			String c = input.next();
//			str[i] = c;
//		}
//		input.close();
//		for(int i = 0 ; i < n ; i++){
//			String c = str[i];
//			String er = "";
//			String eight = "";
//			
//			//16转2
//			StringBuffer stb = new StringBuffer();
//			for(int j = 0; j < c.length(); j++){
//				String temp = c.substring(j, j+1);
//				switch (temp) {
//					case "1": stb.append("0001"); break;
//					case "2": stb.append("0010"); break;
//					case "3": stb.append("0011"); break;
//					case "4": stb.append("0100"); break;
//					case "5": stb.append("0101"); break;
//					case "6": stb.append("0110"); break;
//					case "7": stb.append("0111"); break;
//					case "8": stb.append("1000"); break;
//					case "9": stb.append("1001"); break;
//					case "A": stb.append("1010"); break;
//					case "B": stb.append("1011"); break;
//					case "C": stb.append("1100"); break;
//					case "D": stb.append("1101"); break;
//					case "E": stb.append("1110"); break;
//					case "F": stb.append("1111"); break;
//					
//					default:break;					
//				}		
//			}
//			er = stb.toString();
//			
//			
//			//2转8
//			if(er.length() % 3 == 1) er = "00" + er;
//			if(er.length() % 3 == 2) er = "0" + er;
//			StringBuffer stb2 = new StringBuffer();
//			for(int j = 0 ; j < er.length()-2 ; j +=3 ){
//				String temp = er.substring(j,j+3);
//				
//				switch (temp) {
//				case "001":
//					stb2.append("1");
//					break;
//				case "010":
//					stb2.append("2");
//					break;
//				case "011":
//					stb2.append("3");
//					break;
//				case "100":
//					stb2.append("4");
//					break;
//				case "101":
//					stb2.append("5");
//					break;				
//				case "110":
//					stb2.append("6");
//					break;				
//				case "111":
//					stb2.append("7");
//					break;				
//				default:
//					break;
//				}
//
//			}
//			eight = stb2.toString();
//			System.out.println(eight);
//		}
//	}
//
//}


/**
 * 这个使用了java自带的库函数
 * 有限制，只能转换7位极其以下的数字
 * 蓝桥测试的数字很大完全不够用，结果是0分
 */
//import java.util.Scanner;  
//
//public class Main {  
//  
//    public static void main(String[] args) {  
//        Scanner scanner = new Scanner(System.in);  
//        int n = scanner.nextInt();  
//        String[] sts = new String[n+1];  
//        for(int i=0;i<n;i++){  
//            sts[i] = scanner.next();  
//        }  
//        scanner.close();  
//          
//        for(int i=0;i<n;i++){  
//        	
//            String bs1 = Integer.toBinaryString(Integer.valueOf(sts[i], 16));  
//            //二进制转八进制  
//            String os1 = Integer.toOctalString((Integer.valueOf(bs1, 2)));  
//            System.out.println(os1);  
//        	
////            long a = Long.valueOf(sts[i], 16);  
////            String b = Long.toOctalString(a);  
////            System.out.println(b);  
//        }  
//  
//    }  
//  
//} 

