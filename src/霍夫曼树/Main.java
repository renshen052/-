package ��������;

/**
 * ������ֻ�Ǳ���һ���ҳ���С�ʹ�С
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer> a = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		for(int i = 0 ; i < n ; i++){
			int b = input.nextInt();
			a.add(b);
			
		}
		int [] min = new int[2];//0λ�÷���С�ģ�1λ�÷Ŵ�С��
		int s = 0; 
		for(int i = 0 ; i < n-1 ; i++){
			min[0] = Integer.MAX_VALUE;
			min[1] = Integer.MAX_VALUE;
			request(min);
			a.remove(a.indexOf(min[1]));
			a.remove(a.indexOf(min[0]));
			a.add(min[0]+min[1]);
			s += min[0]+min[1];
		}
		System.out.println(s);
	}
	
	/**
	 * ����С�ĺʹ�С��
	 * @param min
	 */
	public static void request(int[] min){
		for(int i = 0 ; i < a.size() ; i++){
			int b = a.get(i);
			if(b < min[1]){
				if(b<min[0]){
					min[1] = min[0];
					min[0] = b;
					continue;
				}
				min[1] = b; 
			}
		}
	}
}


/**
 * ��������Ƕ��������������Ȼ����ȡ��С�ʹ�С��
 */
//import java.util.Scanner;
//import java.util.Arrays;
//
//public class Main {
//    // ���⿼����̰���㷨
//    static Scanner s = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int n = s.nextInt();
//        if (n < 0 && n > 100) {
//            return;
//        }
//        int[] nums = new int[n]; // ¼���n������
//        int cost = 0; // cost
//        for (int i = 0; i < n; i++) {
//            nums[i] = s.nextInt();
//        }
//
//        int i = 0;
//        while (i + 1 < nums.length) {
//            Arrays.sort(nums); // ���ȶ�nums��������(����)����
//            int temp = nums[i] + nums[i + 1]; // ���ȼ�¼�����Сֵ
//            nums[i + 1] = temp; // �滻��i+1��Ԫ��
//            cost += temp; // ��¼�����ֵ
//            nums = Arrays.copyOfRange(nums, i + 1, nums.length); // Ȼ��ɾ������i��Ԫ��
//        }
//
//        System.out.println(cost);
//    }
//}




