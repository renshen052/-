package 霍夫曼树;

/**
 * 不排序，只是遍历一遍找出最小和次小
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
		int [] min = new int[2];//0位置放最小的，1位置放次小的
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
	 * 找最小的和次小的
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
 * 以下这个是对数组进行了排序，然后在取最小和次小的
 */
//import java.util.Scanner;
//import java.util.Arrays;
//
//public class Main {
//    // 这题考的是贪心算法
//    static Scanner s = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int n = s.nextInt();
//        if (n < 0 && n > 100) {
//            return;
//        }
//        int[] nums = new int[n]; // 录入的n个数据
//        int cost = 0; // cost
//        for (int i = 0; i < n; i++) {
//            nums[i] = s.nextInt();
//        }
//
//        int i = 0;
//        while (i + 1 < nums.length) {
//            Arrays.sort(nums); // 首先对nums进行排序(升序)处理
//            int temp = nums[i] + nums[i + 1]; // 首先记录这个最小值
//            nums[i + 1] = temp; // 替换掉i+1个元素
//            cost += temp; // 记录下这个值
//            nums = Arrays.copyOfRange(nums, i + 1, nums.length); // 然后删除掉第i个元素
//        }
//
//        System.out.println(cost);
//    }
//}




