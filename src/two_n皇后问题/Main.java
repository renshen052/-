package two_n�ʺ�����;

import java.util.Scanner;

public class Main {
	static int [][]map;//01��������,2��ʾ�׻ʺ�3��ʾ�ڻʺ�
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
	 * ���ûʺ�ĺ���
	 */
	public static void put(int t,int s ){//t���ڼ��У�s����ʾ�ʺ�����ͣ�2��3��
		if(t == n){
			if(s == 2)put(0,3);//����׻ʺ���óɹ�������кڻʺ�ķ���
			else count++;     //���÷����ҵ���һ�֣�������������ֵ��һ
			return;			  //��������ù��̽��������г���Ļ���
		}
		
		for(int i = 0 ;i < n ; i ++){  //��ÿһ�е�ֵ������в���
			if(map[t][i] != 1)continue; //��ǰλ���Ƿ�Ϊ1���ж�
			if(check(t,i,s))map[t][i] = s;//�Ƿ�������ĿҪ���жϣ����㸳ֵ
			else continue;				 //�����㣬����ͬһ�е���һ��λ��
			put(t+1,s);					 //��һ�лʺ�ķ���
			map[t][i] = 1;               //���ݷ��Ĺؼ�
		}
		return; //������Ӧ�Ļ���
	}
	
	public static boolean check(int t,int i,int s){//t���ڼ��У�i�����еĵڼ��У�s����ʾ�ʺ�����ͣ�2��3��
		
		//��ǰλ���Ϸ��Ƿ��������ͬ�ʺ�ķ��ã��������µĻ�û�Ų����
		for(int q = t-1 ; q >= 0; q--){  
			if(map[q][i] == s)return false;
		}
		
		//�����Խ��ߣ�����һ�µ�û�ţ�����Ҫ���
		for(int q=t-1,w=i-1 ; q >= 0 && w >= 0 ; q--,w--){
			if(map[q][w] == s)return false;
		}
		
		//����ҶԽ��ߣ��������µ�û�Ų����
		for(int q=t-1,w=i+1 ; q >= 0 && w < n; q--,w++){
			if(map[q][w] == s)return false;
		}
		
		return true;//������������£�����Խ��е�ǰ�ʺ�ķ���
	}

}

