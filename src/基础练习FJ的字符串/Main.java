package »ù´¡Á·Ï°FJµÄ×Ö·û´®;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(print(n));
	}
	
	public static String print(int n ){
		if(n == 1){
			return "A";
		}else{
			char c = (char)(n+64);
			return print(n-1)+ c + print(n-1);
		}
	}
}
