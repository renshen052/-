package ���Ķ���;

import java.util.Scanner;

public class Main {
	static String str;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		str = input.nextLine();
		String s = "" ;
		for(int i = 0 ; i < str.length() ; i++){
			int m = Integer.parseInt( str.substring(i, i+1) ) ;
			String st = toString(i,m)+result(i,m);
			s += st;
		}
		//ȥ���ظ���0
		s = s.replaceAll(" ling ling ling ling ling ling ling ling ling", "");
		s = s.replaceAll(" ling ling ling ling ling ling", " ling");
		s = s.replaceAll(" ling ling ling ling ling", " ling");
		s = s.replaceAll(" ling ling ling ling", " ling");
		s = s.replaceAll(" ling ling ling", " ling");
		s = s.replaceAll(" ling ling", " ling");
		
		System.out.println(s);
	}
	
	//�Ӹ�λ��ʼ���ڼ�λ��������Ӧ�ĵ�λ
	public static String result(int i,int n){//i���ڼ�λ��n����ʾ���ּ�
		int k = str.length()-i;
		if(n == 0 && i != str.length()-1){ //0������λ
			return "ling ";
		}
		switch(k){
		case 10:return "shi ";
		case 9:return "yi ";
		case 8: return "qian ";
		case 7: return "bai ";
		case 6: return "shi ";
		case 5: return "wan ";
		case 4: return "qian ";
		case 3: return "bai ";
		case 2: return "shi ";
		default:return "";
		}
	}
	
	public static String toString(int i,int n){//i���ڼ�λ��n����ʾ���ּ�
		switch(n){
		case 9: return "jiu ";
		case 8: return "ba ";
		case 7: return "qi ";
		case 6: return "liu ";
		case 5: return "wu ";
		case 4: return "si ";
		case 3: return "san ";
		case 2: return "er ";
		case 1:{ 		
			int len = str.length();
			if( len-i == 10 || len -i == 6 )return "";//ʮ�ڣ�ʮ�򣬲���һ
			else return "yi ";
		}
		default:return "";
		}
	}

}

