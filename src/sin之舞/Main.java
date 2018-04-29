package sinÖ®Îè;

import java.util.Scanner;  

public class Main {  
    public static int n;  
  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        n = sc.nextInt();  
        String str = result(1);  
        System.out.println(str);
    }  
  
    // ÇóSn  
    public static String result(int sn) {  
        if (sn > n) {  
            return "";  
        } else {  
            // Sn=(...(A1+n)A2+n-1)A3+...+2)An+1  
            return "(" + result(sn + 1) + sine(n - sn + 1, 1) + "+" + sn + ")";  
        }  
    }  
  
    // ÇóAn  
    public static String sine(int ns, int i) {  
  
        if (i == ns) {  
            return "sin(" + i + ")";  
        }  
        // An=sin(1¨Csin(2+sin(3¨Csin(4+...sin(n))...)  
        else  
            return "sin(" + i + (i % 2 == 0 ? "+" : "-") + sine(ns, i + 1) + ")";  
    }  
}  

