package оƬ����;


/**
 * ��һ��
 * ���еĽǶȿ�
 */

/**
 * ��Ϊ��оƬ�Ȼ�оƬ�࣬���ԣ�
 * ÿһ��оƬ������оƬn���Ƚ�ʱ��
 * ֻҪ��ÿһ��оƬ����n-1�εĽ�����ڻ����n/2  
 * ����֤�����Ǻ�оƬ��Ȼ���оƬ����λ����������ɡ�
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



/**���еĽǶȿ���
 * ������еĽǶ�Ҫ�鷳�ܶ�
 * ������ֻҪ�Ǻõ�оƬ������Խ����һ��һ����ͬ
 * 		 ����ǻ��ģ����Խ�����ܻ���ͬҲ���ܲ�ͬ
 * 		 ����˵�����õ�ռ�������
 * �ȼ���һ��оƬ�Ǻõģ��Ƴ�һ����
 * Ȼ����һ�飬����ͬ�Ľ���������ģ����������
 * 
 * ����ͬ���ʱ�򣬿��Խ�һ��ת��ΪString��Ȼ��ֱ�ӱȽϡ�
 */
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Scanner;
//
//public class Main {
//	static int n ;//оƬ����
//	static int [][]num;
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		
//		//������
//		n = input.nextInt();
//		num= new int [n+1][n+1];
//		for(int i = 1 ; i <= n ; i++){
//			for(int j = 1 ;j <= n ; j++){
//				int temp = input.nextInt();
//				num[i][j] = temp;
//			}
//		}
//		
//		//ת��ΪString
//		String []result = new String [n+1];
//		for(int i = 1 ; i<= n ; i++){
//			String s = "";
//			for(int j = 1 ; j <= n ; j++){
//				s += num[i][j];
//			}
//			result[i] = s;
//		}
//		
//		Map<String,Integer> map = new HashMap<String,Integer>();//ÿ�ֽ����Ϊһ������key��ÿ����һ��������Ӧ��value��һ
//		int maxInt = -1;//�����ͬ�������� ��valueֵ
//		String maxKey = "";//�����ͬ�������� ��keyֵ
//		for(int i = 1 ; i <= n ; i++){
//			
//			if(map.containsKey(result[i])){//�Ѿ�������һ�ֽ��
//				int k = map.get(result[i])+1;
//				map.put(result[i],k);
//				if(k > maxInt){
//					maxInt = k;
//					maxKey = result[i];
//				}
//				
//			}else{//û�����ֽ��
//				map.put(result[i], 1);
//			}
//		}
//		
//		//������
//		for(int i = 0 ; i < maxKey.length() ; i++){
//			if(maxKey.charAt(i) == '1')System.out.print((i+1)+" ");
//		}
//
//	}
//
//}





