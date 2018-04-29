package 求圆的面积;

import java.text.DecimalFormat;

import java.util.*;

public class Main

{

	final static double pi = 3.14159265358979323;

	public static void main(String[] args)

	{

		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();

		double s = pi * r * r;

		DecimalFormat df = new DecimalFormat("#.0000000");

		System.out.println(df.format(s));

	}

}
