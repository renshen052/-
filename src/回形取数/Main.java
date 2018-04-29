package 回形取数;

/**
 * 第一种：
 * 使用了标记数组，标记已经访问过的。
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();//行
		int n = input.nextInt();//列
		int [][]num = new int[m+1][n+1];
		
		//填充-1
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
			
			//下
			while(num[++i][j] > 0 && i < m){
				System.out.print(num[i][j]+" ");
				num[i][j] = -1;
				count--;
			}
			i--;
			
			//右
			while(num[i][++j] > 0 && j < n){
				System.out.print(num[i][j]+" ");
				num[i][j] = -1;
				count--;
			}
			j--;
			
			//上
		try{		//这里有num[-1][j]>0的判断，会越界，为了这里不影响全局，所以加入异常
			while(num[--i][j] > 0 && i >= 0){
				System.out.print(num[i][j]+" ");
				num[i][j] = -1;
				count--;
			}			
		}catch(Exception e){}

			i++;
			
			
			//左
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
 * 方法二
 */
/**
 * 根据回形取数的方法观察取数的路线，
 * 我们可以发现两个圈读取的方法是相同的（但下
 * 个循环的行数和列数都比前一个循环的少2），
 * 所以我们可以采用循环来实现这种取法，循
 * 环需要个终止条件，我们不难想到只要取出
 * 的个数等于矩阵的总数就让它跳出循环。
 */
//import java.util.Scanner;//回形取数  
//
//public class Main {  
//  
//    public static void main(String[] args) {  
//        Scanner input=new Scanner(System.in);  
//        
//        //数据输入
//        int m=input.nextInt(),n=input.nextInt();  
//        int arr[][]=new int[m][n];  
//        for(int i=0;i<m;i++){  
//            for(int j=0;j<n;j++){  
//                arr[i][j]=input.nextInt();  
//            }  
//        }  
//        
//        int count=0;  
//        //这是4条基准线
//        int a = 0, b = m;//第一行和最后一行
//        int q = 0, w = n;//第一列和最后一列
//        int num = m*n;
//        //每一趟都输出最外层的一圈
//        while(true){  
//        	
//        	//向下
//            for(int i= a ; i < b ; i++){  
//                System.out.print(arr[i][q]+" ");  
//                count++;  
//            }  
//            if(count==num)break; 
//            //向右
//            for(int j = q+1 ; j < w ; j++){  
//                System.out.print(arr[b-1][j]+" ");  
//                count++;  
//            }  
//            if(count==num)break; 
//            //向上
//            for(int i = b-2 ; i > a ; i--){  
//                System.out.print(arr[i][w-1]+" ");  
//                count++;  
//            }  
//            if(count==num)break; 
//            //向左
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
 * 进一步优化
 * 由于上面的方法是通过计数来判断是否取完的这样效率比较低，
 * 通过分析我们可以发现循环的次数N小于行数的一半且小于列数的一半。
 */

//import java.util.Scanner;//回形取数  
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
//        int i=0,j=0;  //上一个方法用了四个变量来表示边界，这个只用一个
//        for (i = 0; i < (n + 1) / 2 && i < (m + 1) / 2; i++)  
//        {  
//            for (j = i; j < m - i; j++)  
//                System.out.print(arr[j][i]+" ");  
//            for (j = i + 1; j < n - i; j++)  
//                System.out.print(arr[m - i - 1][j]+" ");  
//            if (n - i - 1 > i)/*（当n为奇数时最后一次循环只有左一列的数据。） 
//                                前面每进一次循环都读了对称的两列数据，前面i-1次循环读了2i个数据（i从0开始）在这次判断之前又读了一列数据 
//                                所以判断有没有对称的右列数据只要判断n-2*i-1是否大于0（等价于n - i - 1 > i）  */  
//                for (j = m - i - 2; j >= i; j--)  
//                    System.out.print( arr[j][n - i - 1]+" ");  
//            if (m - i - 1 > i)  
//                for (j = n - i - 2; j > i; j--)  
//                    System.out.print( arr[i][j]+" ");  
//        } 
//    }  
//}  
