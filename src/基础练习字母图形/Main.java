package 基础练习字母图形;

//import java.util.Scanner;
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		int m = input.nextInt();
//		int n = input.nextInt();
//		
//		for(int i = 0 ; i < m ; i++){
//			for(int j = 0 ; j < n ; j++){
//				char a = 'A';
//				int b = (int)a + Math.abs(j - i);
//				char c = (char)b;
//				System.out.print(c);
//			}
//			System.out.println();
//		}
//
//	}
//
//}


/**
* 这是另一种稍有区别的写法
* 性能比第一种要差一些
*/
import java.util.Scanner;  

public class Main {  

  public static void main(String[] args) {  
      Scanner cin = new Scanner(System.in);  
      int n = cin.nextInt(), m = cin.nextInt();  
		long start = System.nanoTime();

      char c[] = new char[51];  
      for (int i = 0; i < 26; i++) {  
          c[i] = (char) (i + 65);  
          c[50 - i] = (char) (65 + i);  
      }  
      for (int i = 0; i < n; i++) {  
          for (int j = 0; j < m; j++)  
              System.out.print(c[j]);  
          System.out.println();  
          for (int j = 49; j >= 0; j--)  
              c[j + 1] = c[j];  
          c[0] = c[50];  
      }  
		long end = System.nanoTime();
		System.out.println((end-start)/1000+"ms");
  }  
}  

