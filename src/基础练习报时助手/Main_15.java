package ������ϰ��ʱ����;

import java.util.ArrayList;

public class Main {
	int nc = 4;//���и���
	int dc = 4;//Ŀ����еı��
	int nr = 3;//��ͼ�ϵĵ�·����		
	int nj = 2;//����
	int [][]road = new int[nc+1][nc+1];//��·
	int []location = new int[nj+1];//��ʼλ��
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		int nc = input.nextInt();//���и���
//		int dc = input.nextInt();//Ŀ����еı��
//		int nr = input.nextInt();//��ͼ�ϵĵ�·����
//		
//		int [][]road = new int[nc+1][nc+1];//��·
//		for(int i = 1 ; i < nc+1 ; i++){
//			for(int j = 1 ; j < nc+1 ; j++){
//				road[i][j] = Integer.MAX_VALUE;
//			}		
//		}
//		for(int i = 1 ; i < nc+1 ; i++ ){
//			int c1 = input.nextInt();
//			int c2 = input.nextInt();
//			int dist = input.nextInt();
//			road[c1][c2] = dist;
//			road[c2][c1] = dist;
//		}
//		
//		int nj = input.nextInt();//����
//		int []location = new int[nj+1];//��ʼλ��
//		for(int i = 1 ; i < nj+1 ; i++ ){
//			location[i] = input.nextInt();
//		}
		
		System.out.println("������ɣ���ʼ����");
		new Main().start();

		/**
		 * �������
		 * distance = 5
		 * 1-3-4
		 * 2-3-4
		 */

	}
	
	public  void start(){
		set();
		request();
	}
	
	int []D = new int[nj+1];
	ArrayList<Integer> v = new ArrayList<Integer>();
	public  void request(){
		for(int k = 1 ; k < nj+1 ; k++){
			int locate = location[k];
			for(int i = 1 ; i < nc+1 ; i++){
		//		road[locate][i]getClass(),,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
			}			
		}
		
	
	}
	
	
	
	
	
	
	
	
	
	
	public void set(){
		for(int i = 1 ; i < nc+1 ; i++){
			for(int j = 1 ; j < nc+1 ; j++){
				road[i][j] = Integer.MAX_VALUE;
			}		
		}
		road[1][3] = 1;  road[3][1] = 1;
		road[2][3] = 2;  road[3][2] = 2;
		road[4][3] = 2;  road[3][4] = 2;
		location[1] = 1; location[2] = 2;
				
	}
}













