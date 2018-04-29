package 基础练习矩形面积交;


/**
 * 思路：
 * 1.判断出来两个矩形 是否有重叠的部分。
 * 2.公共部分为左边界较大值到右边界最小值，下边界最大值到上边界最小值。
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat  format = new DecimalFormat ("#.00");
		double x11 = input.nextInt();
		double y11 = input.nextInt();
		double x12 = input.nextInt();
		double y12 = input.nextInt();
		double x21 = input.nextInt();
		double y21 = input.nextInt();
		double x22 = input.nextInt();
		double y22 = input.nextInt();
		
		//相交矩形的坐标
		double m1 = Math.min(Math.max(x11, x12), Math.max(x21, x22));//x
		double n1 = Math.min(Math.max(y11,y12), Math.max(y21, y22));//y
		double m2 = Math.max(Math.min(x11, x12), Math.min(x21, x22));//x
		double n2 = Math.max(Math.min(y11,y12), Math.min(y21, y22));//y

		if(m1 > m2 && n1 > n2){
			System.out.println(format.format( (m1-m2)*(n1-n2)));
		}else{
			System.out.println("0.00");
		}
	}

}

