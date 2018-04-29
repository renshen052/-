package 基础练习01字串;

/**
 * 第一种写法，
 *相比第二种效率要高一些
 */
//public class Main {
//
//	public static void main(String[] args) {
//		for(int i = 0 ; i < 32 ; i++){
//			String m = Integer.toBinaryString(i);
//			int len = m.length();
//			if(len % 5 == 0)System.out.println(m);
//			if(len % 5 == 1)System.out.println("0000"+m);
//			if(len % 5 == 2)System.out.println("000"+m);
//			if(len % 5 == 3)System.out.println("00"+m);
//			if(len % 5 == 4)System.out.println("0"+m);
//		}
//	}
//
//}

/**
 * 第二种写法，
 * for循环较第一种多
 */
public class Main {

	public static void main(String[] args) {
		for(int i = 0 ; i < 2 ; i++){	
			for(int j = 0 ; j < 2 ; j++){	
				for(int k = 0 ; k < 2 ; k++){	
					for(int m = 0 ; m < 2 ; m++){	
						for(int n = 0 ; n < 2 ; n++){	
							String s = "" +i+j+k+m+n;
							System.out.println(s);
						}
					}
				}
			}
		}
	}

}
