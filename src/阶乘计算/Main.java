package 阶乘计算;

import java.math.BigInteger;  
import java.util.Scanner;  
/**
 *本题中由于1<n<1000,n!会很大，
 *所以要用BigInteger对象来表示 
 */
//public class Main {  
//    public static BigInteger factorial(int n){         
//        if(n>0){ 
//            return BigInteger.valueOf(n).multiply(factorial(n-1));  
//        }else{  
//            return BigInteger.ONE;  
//        }  
//    }   
//    public static void main(String[] args) {  
//        Scanner scanner=new Scanner(System.in);  
//        int n=scanner.nextInt();  
//            System.out.println(factorial(n));  
//          
//   }  
//}  

/**
 * 另一种是用数组，
 * 计算出某个位乘以k加上进位，
 * 然后取个位数作为自己的新值，
 * 其他的进位送给下一次循环
 */
public class Main {  
	public static void main(String[] args) {  
		Scanner input=new Scanner(System.in);  
		int n=input.nextInt();  
		input.close();
		int []max = new int [301];
		max[1] = 1 ;
		for(int i = 1 ; i <= n ; i++ ){
			int jw = 0 ;    //j的高一位，在下次循环的时候加加上
			for(int j = 1 ;  j < 300 ; j++){
				int m = max[j] * i + jw;
				max[j] = m % 10;
				jw = m / 10;
			}				
		}

		int i = 300;
		for( ; i > 0 ; i--){
			if(max[i] != 0)break;
		}
		for(; i > 0 ; i--){
			System.out.print(max[i]);
		}
	}  
}  

