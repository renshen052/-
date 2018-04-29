package two_n皇后问题;

import java.util.Scanner;

public class Main {
	static int [][]map;//01矩阵棋盘,2表示白皇后，3表示黑皇后
	static int n,count=0;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		map = new int [n][n];
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ;j < n ; j++){
				int k = input.nextInt();
				map[i][j] = k;
			}
		}
		put(0,2);
		System.out.println(count);

	}
	
	/**
	 * 放置皇后的函数
	 */
	public static void put(int t,int s ){//t：第几行，s：表示皇后的类型（2或3）
		if(t == n){
			if(s == 2)put(0,3);//如果白皇后放置成功，则进行黑皇后的放置
			else count++;     //放置方法找到了一种，计数变量进行值加一
			return;			  //当整体放置过程结束，进行程序的回溯
		}
		
		for(int i = 0 ;i < n ; i ++){  //对每一行的值逐个进行操作
			if(map[t][i] != 1)continue; //当前位置是否为1的判断
			if(check(t,i,s))map[t][i] = s;//是否满足题目要求判断，满足赋值
			else continue;				 //不满足，接着同一行的下一个位置
			put(t+1,s);					 //下一行皇后的放置
			map[t][i] = 1;               //回溯法的关键
		}
		return; //进行相应的回溯
	}
	
	public static boolean check(int t,int i,int s){//t：第几行，i：该行的第几列，s：表示皇后的类型（2或3）
		
		//当前位置上方是否进行了相同皇后的放置，这行以下的还没放不检查
		for(int q = t-1 ; q >= 0; q--){  
			if(map[q][i] == s)return false;
		}
		
		//检查左对角线，这行一下的没放，不需要检查
		for(int q=t-1,w=i-1 ; q >= 0 && w >= 0 ; q--,w--){
			if(map[q][w] == s)return false;
		}
		
		//检查右对角线，这行以下的没放不检查
		for(int q=t-1,w=i+1 ; q >= 0 && w < n; q--,w++){
			if(map[q][w] == s)return false;
		}
		
		return true;//都足满的情况下，则可以进行当前皇后的放置
	}

}

