package ����ȡ��;

/**
 * ��һ�֣�
 * ʹ���˱�����飬����Ѿ����ʹ��ġ�
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();//��
		int n = input.nextInt();//��
		int [][]num = new int[m+1][n+1];
		
		//���-1
		for(int i = 0 ; i < m+1 ; i++){
			for(int j = 0 ; j < n+1; j++){
				num[i][j] = -1;
			}
		}
		for(int i = 0 ; i < m ; i++){
			for(int j = 0 ; j < n ; j++){
				int a = input.nextInt();
				num[i][j] = a;
			}
		}
		
		
		int i = -1 , j = 0;
		int count = m*n;
		while(count > 0){
			
			//��
			while(num[++i][j] > 0 && i < m){
				System.out.print(num[i][j]+" ");
				num[i][j] = -1;
				count--;
			}
			i--;
			
			//��
			while(num[i][++j] > 0 && j < n){
				System.out.print(num[i][j]+" ");
				num[i][j] = -1;
				count--;
			}
			j--;
			
			//��
		try{		//������num[-1][j]>0���жϣ���Խ�磬Ϊ�����ﲻӰ��ȫ�֣����Լ����쳣
			while(num[--i][j] > 0 && i >= 0){
				System.out.print(num[i][j]+" ");
				num[i][j] = -1;
				count--;
			}			
		}catch(Exception e){}

			i++;
			
			
			//��
			while(num[i][--j] > 0 && j >= 0){
				System.out.print(num[i][j]+" ");
				num[i][j] = -1;
				count--;
			}
			j++;
		}
		
	}

}

/**
 * ������
 */
/**
 * ���ݻ���ȡ���ķ����۲�ȡ����·�ߣ�
 * ���ǿ��Է�������Ȧ��ȡ�ķ�������ͬ�ģ�����
 * ��ѭ������������������ǰһ��ѭ������2����
 * �������ǿ��Բ���ѭ����ʵ������ȡ����ѭ
 * ����Ҫ����ֹ���������ǲ����뵽ֻҪȡ��
 * �ĸ������ھ������������������ѭ����
 */
//import java.util.Scanner;//����ȡ��  
//
//public class Main {  
//  
//    public static void main(String[] args) {  
//        Scanner input=new Scanner(System.in);  
//        
//        //��������
//        int m=input.nextInt(),n=input.nextInt();  
//        int arr[][]=new int[m][n];  
//        for(int i=0;i<m;i++){  
//            for(int j=0;j<n;j++){  
//                arr[i][j]=input.nextInt();  
//            }  
//        }  
//        
//        int count=0;  
//        //����4����׼��
//        int a = 0, b = m;//��һ�к����һ��
//        int q = 0, w = n;//��һ�к����һ��
//        int num = m*n;
//        //ÿһ�˶����������һȦ
//        while(true){  
//        	
//        	//����
//            for(int i= a ; i < b ; i++){  
//                System.out.print(arr[i][q]+" ");  
//                count++;  
//            }  
//            if(count==num)break; 
//            //����
//            for(int j = q+1 ; j < w ; j++){  
//                System.out.print(arr[b-1][j]+" ");  
//                count++;  
//            }  
//            if(count==num)break; 
//            //����
//            for(int i = b-2 ; i > a ; i--){  
//                System.out.print(arr[i][w-1]+" ");  
//                count++;  
//            }  
//            if(count==num)break; 
//            //����
//            for(int j = w-1 ; j > q ; j--){  
//                System.out.print(arr[a][j]+" ");  
//                count++;  
//            }  
//            if(count==num)break;  
//            a++;
//            b--;
//            q++;
//            w--;
//        }  
//        
//
//    }  
//}  



/**
 * ��һ���Ż�
 * ��������ķ�����ͨ���������ж��Ƿ�ȡ�������Ч�ʱȽϵͣ�
 * ͨ���������ǿ��Է���ѭ���Ĵ���NС��������һ����С��������һ�롣
 */

//import java.util.Scanner;//����ȡ��  
//
//public class Main {  
//  
//    public static void main(String[] args) {  
//        Scanner input=new Scanner(System.in);  
//        int m=input.nextInt(),n=input.nextInt();  
//        int arr[][]=new int[m][n];  
//        for(int i=0;i<m;i++){  
//            for(int j=0;j<n;j++){  
//                arr[i][j]=input.nextInt();  
//            }  
//        }  
//        int i=0,j=0;  //��һ�����������ĸ���������ʾ�߽磬���ֻ��һ��
//        for (i = 0; i < (n + 1) / 2 && i < (m + 1) / 2; i++)  
//        {  
//            for (j = i; j < m - i; j++)  
//                System.out.print(arr[j][i]+" ");  
//            for (j = i + 1; j < n - i; j++)  
//                System.out.print(arr[m - i - 1][j]+" ");  
//            if (n - i - 1 > i)/*����nΪ����ʱ���һ��ѭ��ֻ����һ�е����ݡ��� 
//                                ǰ��ÿ��һ��ѭ�������˶ԳƵ��������ݣ�ǰ��i-1��ѭ������2i�����ݣ�i��0��ʼ��������ж�֮ǰ�ֶ���һ������ 
//                                �����ж���û�жԳƵ���������ֻҪ�ж�n-2*i-1�Ƿ����0���ȼ���n - i - 1 > i��  */  
//                for (j = m - i - 2; j >= i; j--)  
//                    System.out.print( arr[j][n - i - 1]+" ");  
//            if (m - i - 1 > i)  
//                for (j = n - i - 2; j > i; j--)  
//                    System.out.print( arr[i][j]+" ");  
//        } 
//    }  
//}  
