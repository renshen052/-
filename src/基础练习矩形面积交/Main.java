package ������ϰ���������;


/**
 * ˼·��
 * 1.�жϳ����������� �Ƿ����ص��Ĳ��֡�
 * 2.��������Ϊ��߽�ϴ�ֵ���ұ߽���Сֵ���±߽����ֵ���ϱ߽���Сֵ��
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
		
		//�ཻ���ε�����
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

