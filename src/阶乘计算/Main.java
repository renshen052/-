package �׳˼���;

import java.math.BigInteger;  
import java.util.Scanner;  
/**
 *����������1<n<1000,n!��ܴ�
 *����Ҫ��BigInteger��������ʾ 
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
 * ��һ���������飬
 * �����ĳ��λ����k���Ͻ�λ��
 * Ȼ��ȡ��λ����Ϊ�Լ�����ֵ��
 * �����Ľ�λ�͸���һ��ѭ��
 */
public class Main {  
	public static void main(String[] args) {  
		Scanner input=new Scanner(System.in);  
		int n=input.nextInt();  
		input.close();
		int []max = new int [301];
		max[1] = 1 ;
		for(int i = 1 ; i <= n ; i++ ){
			int jw = 0 ;    //j�ĸ�һλ�����´�ѭ����ʱ��Ӽ���
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

