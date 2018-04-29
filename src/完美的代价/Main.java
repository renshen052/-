package 完美的代价;

//这是网上找的代码
/**
【分析】对于字符串第一个字符，从字符串的最后一个字符开始匹配，
如果找到第一个匹配的位置，将它换到倒数第二的位置，并记录这一次转
换所需的次数；如果没有找到匹配的位置，这个字符可能就会是最中间的那
个字符，用一个布尔变量记录是否需要将这个可能是中间的字符是否存在。
题目的关键就是这个可能是中间的字符需不需要换到中间位置的这种情况，
如果将这个字符换到中间，那么以后的字符每次变换都会改变这个中间字符的位置。
这个中间字符的左边是已经变换好的，只需要将中间字符的右边作变换就可以了，
所以可以将中间字符在最后做变换（下面的代码没有在最后实际作变换，只是
统计了它变换需要的次数），最后将右边的字符作回文处理就可以了，如果处理的
过程中再次出现可能是中间的字符，那么这种情况就是不可能的了。*/
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Main {
//	static char[] s;
//	public static void main(String[] args) throws IOException{
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		int len = Integer.parseInt(reader.readLine());
//		 s= reader.readLine().toCharArray();
//		reader.close();
//		if (palindrome(s, 0, len - 1)) {
//			System.out.println(cnt);
//		} else {
//			System.out.println("Impossible");
//		}
//		
//		System.exit(0);
//	}
//	
//	private static int cnt = 0;
//	private static boolean haveMiddle = false;
//	
//	private static boolean palindrome(char[] s, int a, int b) {
//		if (b <= a) {
//			return true;
//		}
//              // 从最后的位置开始遍历字符串
//		for (int i = b; i > a; i--) {
//			if (s[a] == s[i]) {
//				exchangeTo(s, i, b);
//				cnt += getExchangeTimes(i, b);
//				return palindrome(s, a + 1, b - 1);
//			}
//		}
//              // 如果没有出现过中间字符
//		if (!haveMiddle) {
//			haveMiddle = true;
//			cnt += getExchangeTimes(a, s.length / 2);
//			return palindrome(s, a + 1, b);
//		}
//		return false;
//	}
//	
//	private static int getExchangeTimes(int a, int b) {
//		print();
//		return b - a;
//	}
//	
//	private static void exchangeTo(char[] s, int a, int b) {
//		char temp = s[a];
//		for (int i = a; i < b; i++) {
//			s[i] = s[i + 1];
//		}
//		s[b] = temp;
//	}
//	
//	public static void print(){
//		System.out.println("次数"+cnt);
//		for(int i = 0 ; i < s.length ; i++){
//			System.out.print(s[i]+" ");
//		}
//		System.out.println();
//	}
//}




/**
*这个只能过一部分测试数据 
*/

/**
* 分析：
贪心思想，从左向右遍历，对于当前字符，从最右边向左遍历，找到与当前字符相同的，把它移动到正确位置，累加步数。
如果字符串长度为偶数，只要有一个无法配对的字符，就不能变成回文串，若为奇数，只要出现两个无法配对的字符，也不能。
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int n ;
	static String str;
	public static void main(String[] args) {
		//数据的输入
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		str = input.next();
		char []strNew = str.toCharArray();
		
		int s = 0 ; //记录无法配对的数量
		int index = 0 ;//记录无配对字符的索引
		int step = 0 ; //移动步数
		int location = n-1;
		for(int i = 0 ; i < n/2  ; i++){//从左向右遍历(n+1)/2
			boolean is = false ;//表示是否有匹配字符
			char c1 = strNew[i];		//当前字符
			//for(int j = n-1-i ; j > i ; j--){//从右往左遍历找配对
			for(int j = location ; j > i ; j--){
				char c2 = strNew[j];
				if(c2 == c1){				//找到匹配字符后移动到正确位置
					is = true;
					//for(int k = j; k < n-1-i ; k++){
					for(int k = j; k < location ; k++){
						strNew[k] = strNew[k+1];
						step++;				//移动一次步数加一
					}
					strNew[n-1-i] = c2;//zhe li 
					location--;
					break; //交换完成后跳出内层循环
				}
			}
			
			if(!is){
				s++; index = i;//如果找不到配对的，s++,并记录索引
				step += n/2-index;
			} 
			if((n % 2 == 0 && s > 0) || (n % 2 == 1 && s > 1)){//如果是字符串数是偶数，出现奇数次的单个字符
				System.out.println("Impossible");		//如果是字符串数是奇数，并且出现了超过一次奇数次的单个字符
				return ;								//说明不能构成回文，输出Impossible，结束。
			}
				
			for(int m = 0 ; m < strNew.length ; m++){
				System.out.print(strNew[m]+" ");
			}
			System.out.println();
			System.out.println(step);
		}

		System.out.println(step);
	}
}
















/**
* 这个是错误的，思路出了问题,找不到最小移动次数
*/


/**
* 首先判断输入字符串是否为回文，
* 是，则直接输出0
* 否，则进行一系列操作计算移动次数
* 
* 否的情况下思路：
* 统计字符串中字符的种类数num，
* 如果字符串n是奇数，最多只能出现一次奇数个的相同字符
* 如果字符串n是偶数，则一定不能出现奇数个的相同字符
* 如果num > (n+1)/2,一定不能构成回文
* 如果num <= (n+1)/2,则构造一个满足回文的新的字符串newStr
* newStr与旧的字符串对比，距离
*
*/
//import java.util.ArrayList;
//import java.util.Scanner;
//public class Main {
//	static int n ;
//	static String str;
//	static ArrayList<Character> frequency = new ArrayList<Character>();//出现的字符
//	static ArrayList<Integer> strNum = new ArrayList<Integer>(); //每种字符对应的出现次数
//	static char []newStr;
//	public static void main(String[] args) {
//		//数据的输入
//		Scanner input = new Scanner(System.in);
//		n = input.nextInt();
//		str = input.next();
//		
//		if(is(str)){//判断字符串是否就是回文
//			System.out.println(0);
//			return ;
//		}
//		
//		
//		
//		frequency = new ArrayList<Character>();//出现的字符
//		strNum = new ArrayList<Integer>(); //每种字符对应的出现次数
//		newStr = new char [n];
//		
//		//统计字符种类及数量
//		count();
//		for(int i = 0 ; i < frequency.size(); i++){
//			if(strNum.get(i) % 2 == 1)System.out.println(frequency.get(i)+":"+strNum.get(i));
//		}
//		
//		
//		
//		//判断是否可以构成回文
//		if(!check())return;
//		
//		//构造出最终的回文
//		structure();
//		
//		//计算需要的次数
//		reckon();
//	}
//	
//	/**
//	 * 判断字符串是否为回文
//	 * @param str
//	 * @return 如果是回文，那么返回true，如果不是，则返回false
//	 */
//	public static boolean is(String str){
//		for(int i = 0 ; i < str.length()/2 ; i++){
//			if(str.charAt(i) != str.charAt(str.length()-1-i)){
//				return false;
//			}
//		}
//		return true;
//	}
//	
//	
//	
//	
//	
//	/**
//	 * 计算需要的次数
//	 * @return
//	 */
//	/*假设每个字符都是从0位置移到目标位置，
//	 * 那么次数可以这么计算：移到str中位置的次数 - 移到newStr中位置的次数的绝对值*/
//	static ArrayList<Character> size1 = new ArrayList<Character>();//str出现的字符
//	static ArrayList<Integer> num1 = new ArrayList<Integer>(); //每种字符对应的出现次数
//	public static void reckon(){
//		for(int i = 0 ; i < n ; i++){//遍历字符串
//			char a = str.charAt(i);	 //取出第i个字符
//			if(!size1.contains(a)){//如果该字符没有包含进去
//				size1.add(a);		//就在size1里加入一种新的
//				num1.add(i);			//并且在对应的数量组里赋值为i
//			}else{
//				int index = size1.indexOf(a);//获取该字符的索引
//				num1.set(index, num1.get(index)+i );//数量加i
//			}
//		}
//
//		for(int i = 0 ; i < newStr.length ; i++){
//			char a = newStr[i];			 	//取出第i个字符
//			int index = size1.indexOf(a);	//获取该字符的索引
//			num1.set(index, num1.get(index) - i );//数量减i
//		}
//		
//		//计算总次数
//		int s = 0;
//		for(int i = 0 ; i < num1.size() ; i++ ){
//			int num = Math.abs(num1.get(i));
//			s += num;
//		}
//		System.out.println(s-1);
//	}
//	
//	/**
//	 * 构造出最终的回文
//	 */
//	public static void structure(){
//		
//		if(n % 2 == 0){//偶数所有的都要构造
//			
//			structureZero();//对偶数部分处理
//			
//		}else{//奇数字符串出现次数为奇数个的不构造
//			
//			/*先找到奇数次的字符,单独处理*/
//			for(int i = 0 ; i < strNum.size() ; i++){
//				int num = strNum.get(i);
//				if(num % 2 == 1){//找到后单独构造
//					char c = frequency.get(i);
//					newStr[n/2] = c;//首先放到中间位置一个（n/2)
//					for(int j = 1 ; j < num-1 ; j++){//然后在从中间往两边看  0位置<-(n/2位置)->n-1位置
//						newStr[n/2 - j] = c;
//						newStr[n/2 + j] = c;
//
//					}
//					frequency.remove(i);//奇数次的处理完了之后去掉
//					strNum.remove(i);
//					break;
//				}
//			}
//			
//			/*奇数次的处理完毕，剩下的就全是偶数次的，按照偶数次的处理*/
//			structureZero();//对偶数部分处理
//		
//		}//else end
//		
//	}
//	
//	/**
//	 * 配套structure的函数
//	 * 对偶数部分构造的处理
//	 */
//	public static void structureZero(){
//		//偶数所有的都要构造
//		int kk = 0; //记录newStr存放的进度
//		for(int i = 0 ; i < frequency.size() ; i++){
//			char c = frequency.get(i);//要构造的字符
//			int num = strNum.get(i);//总数
//			for(int k = kk ; k < num/2+kk ; k++){
//				newStr[k] = c;
//				newStr[n-1-k] = c;
//			}
//			kk += num/2;//该字符构造完毕后记录进度
//		}
//	}
//	
//	/**
//	 * 判断是否可以构成回文
//	 * @return 能构成返回true，不能则构成返回false
//	 */
//	public static boolean check(){
//		if(frequency.size() > (n+1)/2 ){	//如果num > (n+1)/2,一定不能构成回文
//			System.out.println("Impossible");//无法构成，结束
//			return false;
//		}
//		
//		if(n % 2 == 0 ){//n是偶数
//			for(int i = 0 ; i < strNum.size() ; i++){
//				int num = strNum.get(i);
//				if(num % 2 == 1){			//字符串n是偶数，则一定不能出现奇数个的相同字符
//					System.out.println("Impossible");//无法构成，结束
//					return false;	
//				}
//			}
//		}else{//n是奇数
//			int s = 0 ;//计数，用于判读是否超出一次
//			for(int i = 0 ; i < strNum.size() ; i++){
//				int num = strNum.get(i);
//				if(num % 2 == 1 && s > 1){	//如果字符串n是奇数，最多只能出现一次奇数个的相同字符
//					System.out.println("Impossible");//无法构成，结束
//					return false;					
//				}
//			}
//		}
//		
//		return true;
//	}
//	
//	
//	/**
//	 * 统计字符种类及数量
//	 */
//	public static void count(){
//		for(int i = 0 ; i < n ; i++){//遍历字符串
//			char a = str.charAt(i);	 //取出第i个字符
//			if(!frequency.contains(a)){//如果该字符没有包含进去
//				frequency.add(a);		//就在frequency里加入一种新的
//				strNum.add(1);			//并且在对应的数量组里初始化为1
//			}else{
//				int index = frequency.indexOf(a);//获取该字符的索引
//				strNum.set(index, strNum.get(index)+1 );//数量加一
//			}
//		}
//	}
//
//}

