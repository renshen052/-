package 芯片测试;


/**
 * 第一种
 * 从列的角度看
 */

/**
 * 因为好芯片比坏芯片多，所以，
 * 每一个芯片与其它芯片n个比较时，
 * 只要对每一个芯片测试n-1次的结果大于或等于n/2  
 * 就能证明这是好芯片，然后把芯片所在位置输出来即可。
 */
import java.util.Scanner;
public class Main {
    public static int n;
    public static int[][] arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
                if(i == j){
                    arr[i][j] = 0;
                }
            }
        }
        for (int j = 0; j < n; j++){
            int s = 0;
            for (int i = 0; i < n; i++){
                if(i != j){
                    s += arr[i][j];               
                }
            }
            if (s >= n/2)
                System.out.print((j+1)+" ");
        } 
    }

}



/**从行的角度看。
 * 相较于列的角度要麻烦很多
 * 分析：只要是好的芯片，其测试结果的一行一定相同
 * 		 如果是坏的，测试结果可能会相同也可能不同
 * 		 题上说明，好的占大多数。
 * 先假设一块芯片是好的，推出一组结果
 * 然后下一块，找相同的结果数量最多的，就是最后结果
 * 
 * 找相同结果时候，可以将一行转换为String，然后直接比较。
 */
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Scanner;
//
//public class Main {
//	static int n ;//芯片数量
//	static int [][]num;
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		
//		//读数据
//		n = input.nextInt();
//		num= new int [n+1][n+1];
//		for(int i = 1 ; i <= n ; i++){
//			for(int j = 1 ;j <= n ; j++){
//				int temp = input.nextInt();
//				num[i][j] = temp;
//			}
//		}
//		
//		//转换为String
//		String []result = new String [n+1];
//		for(int i = 1 ; i<= n ; i++){
//			String s = "";
//			for(int j = 1 ; j <= n ; j++){
//				s += num[i][j];
//			}
//			result[i] = s;
//		}
//		
//		Map<String,Integer> map = new HashMap<String,Integer>();//每种结果作为一个主键key，每当有一个主键对应的value加一
//		int maxInt = -1;//结果相同最多的数量 的value值
//		String maxKey = "";//结果相同最多的数量 的key值
//		for(int i = 1 ; i <= n ; i++){
//			
//			if(map.containsKey(result[i])){//已经有了这一种结果
//				int k = map.get(result[i])+1;
//				map.put(result[i],k);
//				if(k > maxInt){
//					maxInt = k;
//					maxKey = result[i];
//				}
//				
//			}else{//没有这种结果
//				map.put(result[i], 1);
//			}
//		}
//		
//		//输出结果
//		for(int i = 0 ; i < maxKey.length() ; i++){
//			if(maxKey.charAt(i) == '1')System.out.print((i+1)+" ");
//		}
//
//	}
//
//}





