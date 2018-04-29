package »ù´¡Á·Ï°Ñî»ÔÈý½ÇÐÎ;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int [][]r = new int[n][n];
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j <= i; j++){
				if(j == 0 || i ==j )r[i][j] = 1;
				else{
					r[i][j] = r[i-1][j] + r[i-1][j-1];
				}
			}
		}
		
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j <= i; j++){
				System.out.print(r[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}