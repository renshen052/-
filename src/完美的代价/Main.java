package �����Ĵ���;

//���������ҵĴ���
/**
�������������ַ�����һ���ַ������ַ��������һ���ַ���ʼƥ�䣬
����ҵ���һ��ƥ���λ�ã��������������ڶ���λ�ã�����¼��һ��ת
������Ĵ��������û���ҵ�ƥ���λ�ã�����ַ����ܾͻ������м����
���ַ�����һ������������¼�Ƿ���Ҫ������������м���ַ��Ƿ���ڡ�
��Ŀ�Ĺؼ���������������м���ַ��費��Ҫ�����м�λ�õ����������
���������ַ������м䣬��ô�Ժ���ַ�ÿ�α任����ı�����м��ַ���λ�á�
����м��ַ���������Ѿ��任�õģ�ֻ��Ҫ���м��ַ����ұ����任�Ϳ����ˣ�
���Կ��Խ��м��ַ���������任������Ĵ���û�������ʵ�����任��ֻ��
ͳ�������任��Ҫ�Ĵ�����������ұߵ��ַ������Ĵ���Ϳ����ˣ���������
�������ٴγ��ֿ������м���ַ�����ô����������ǲ����ܵ��ˡ�*/
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
//              // ������λ�ÿ�ʼ�����ַ���
//		for (int i = b; i > a; i--) {
//			if (s[a] == s[i]) {
//				exchangeTo(s, i, b);
//				cnt += getExchangeTimes(i, b);
//				return palindrome(s, a + 1, b - 1);
//			}
//		}
//              // ���û�г��ֹ��м��ַ�
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
//		System.out.println("����"+cnt);
//		for(int i = 0 ; i < s.length ; i++){
//			System.out.print(s[i]+" ");
//		}
//		System.out.println();
//	}
//}




/**
*���ֻ�ܹ�һ���ֲ������� 
*/

/**
* ������
̰��˼�룬�������ұ��������ڵ�ǰ�ַ��������ұ�����������ҵ��뵱ǰ�ַ���ͬ�ģ������ƶ�����ȷλ�ã��ۼӲ�����
����ַ�������Ϊż����ֻҪ��һ���޷���Ե��ַ����Ͳ��ܱ�ɻ��Ĵ�����Ϊ������ֻҪ���������޷���Ե��ַ���Ҳ���ܡ�
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int n ;
	static String str;
	public static void main(String[] args) {
		//���ݵ�����
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		str = input.next();
		char []strNew = str.toCharArray();
		
		int s = 0 ; //��¼�޷���Ե�����
		int index = 0 ;//��¼������ַ�������
		int step = 0 ; //�ƶ�����
		int location = n-1;
		for(int i = 0 ; i < n/2  ; i++){//�������ұ���(n+1)/2
			boolean is = false ;//��ʾ�Ƿ���ƥ���ַ�
			char c1 = strNew[i];		//��ǰ�ַ�
			//for(int j = n-1-i ; j > i ; j--){//����������������
			for(int j = location ; j > i ; j--){
				char c2 = strNew[j];
				if(c2 == c1){				//�ҵ�ƥ���ַ����ƶ�����ȷλ��
					is = true;
					//for(int k = j; k < n-1-i ; k++){
					for(int k = j; k < location ; k++){
						strNew[k] = strNew[k+1];
						step++;				//�ƶ�һ�β�����һ
					}
					strNew[n-1-i] = c2;//zhe li 
					location--;
					break; //������ɺ������ڲ�ѭ��
				}
			}
			
			if(!is){
				s++; index = i;//����Ҳ�����Եģ�s++,����¼����
				step += n/2-index;
			} 
			if((n % 2 == 0 && s > 0) || (n % 2 == 1 && s > 1)){//������ַ�������ż�������������εĵ����ַ�
				System.out.println("Impossible");		//������ַ����������������ҳ����˳���һ�������εĵ����ַ�
				return ;								//˵�����ܹ��ɻ��ģ����Impossible��������
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
* ����Ǵ���ģ�˼·��������,�Ҳ�����С�ƶ�����
*/


/**
* �����ж������ַ����Ƿ�Ϊ���ģ�
* �ǣ���ֱ�����0
* �������һϵ�в��������ƶ�����
* 
* ��������˼·��
* ͳ���ַ������ַ���������num��
* ����ַ���n�����������ֻ�ܳ���һ������������ͬ�ַ�
* ����ַ���n��ż������һ�����ܳ�������������ͬ�ַ�
* ���num > (n+1)/2,һ�����ܹ��ɻ���
* ���num <= (n+1)/2,����һ��������ĵ��µ��ַ���newStr
* newStr��ɵ��ַ����Աȣ�����
*
*/
//import java.util.ArrayList;
//import java.util.Scanner;
//public class Main {
//	static int n ;
//	static String str;
//	static ArrayList<Character> frequency = new ArrayList<Character>();//���ֵ��ַ�
//	static ArrayList<Integer> strNum = new ArrayList<Integer>(); //ÿ���ַ���Ӧ�ĳ��ִ���
//	static char []newStr;
//	public static void main(String[] args) {
//		//���ݵ�����
//		Scanner input = new Scanner(System.in);
//		n = input.nextInt();
//		str = input.next();
//		
//		if(is(str)){//�ж��ַ����Ƿ���ǻ���
//			System.out.println(0);
//			return ;
//		}
//		
//		
//		
//		frequency = new ArrayList<Character>();//���ֵ��ַ�
//		strNum = new ArrayList<Integer>(); //ÿ���ַ���Ӧ�ĳ��ִ���
//		newStr = new char [n];
//		
//		//ͳ���ַ����༰����
//		count();
//		for(int i = 0 ; i < frequency.size(); i++){
//			if(strNum.get(i) % 2 == 1)System.out.println(frequency.get(i)+":"+strNum.get(i));
//		}
//		
//		
//		
//		//�ж��Ƿ���Թ��ɻ���
//		if(!check())return;
//		
//		//��������յĻ���
//		structure();
//		
//		//������Ҫ�Ĵ���
//		reckon();
//	}
//	
//	/**
//	 * �ж��ַ����Ƿ�Ϊ����
//	 * @param str
//	 * @return ����ǻ��ģ���ô����true��������ǣ��򷵻�false
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
//	 * ������Ҫ�Ĵ���
//	 * @return
//	 */
//	/*����ÿ���ַ����Ǵ�0λ���Ƶ�Ŀ��λ�ã�
//	 * ��ô����������ô���㣺�Ƶ�str��λ�õĴ��� - �Ƶ�newStr��λ�õĴ����ľ���ֵ*/
//	static ArrayList<Character> size1 = new ArrayList<Character>();//str���ֵ��ַ�
//	static ArrayList<Integer> num1 = new ArrayList<Integer>(); //ÿ���ַ���Ӧ�ĳ��ִ���
//	public static void reckon(){
//		for(int i = 0 ; i < n ; i++){//�����ַ���
//			char a = str.charAt(i);	 //ȡ����i���ַ�
//			if(!size1.contains(a)){//������ַ�û�а�����ȥ
//				size1.add(a);		//����size1�����һ���µ�
//				num1.add(i);			//�����ڶ�Ӧ���������︳ֵΪi
//			}else{
//				int index = size1.indexOf(a);//��ȡ���ַ�������
//				num1.set(index, num1.get(index)+i );//������i
//			}
//		}
//
//		for(int i = 0 ; i < newStr.length ; i++){
//			char a = newStr[i];			 	//ȡ����i���ַ�
//			int index = size1.indexOf(a);	//��ȡ���ַ�������
//			num1.set(index, num1.get(index) - i );//������i
//		}
//		
//		//�����ܴ���
//		int s = 0;
//		for(int i = 0 ; i < num1.size() ; i++ ){
//			int num = Math.abs(num1.get(i));
//			s += num;
//		}
//		System.out.println(s-1);
//	}
//	
//	/**
//	 * ��������յĻ���
//	 */
//	public static void structure(){
//		
//		if(n % 2 == 0){//ż�����еĶ�Ҫ����
//			
//			structureZero();//��ż�����ִ���
//			
//		}else{//�����ַ������ִ���Ϊ�������Ĳ�����
//			
//			/*���ҵ������ε��ַ�,��������*/
//			for(int i = 0 ; i < strNum.size() ; i++){
//				int num = strNum.get(i);
//				if(num % 2 == 1){//�ҵ��󵥶�����
//					char c = frequency.get(i);
//					newStr[n/2] = c;//���ȷŵ��м�λ��һ����n/2)
//					for(int j = 1 ; j < num-1 ; j++){//Ȼ���ڴ��м������߿�  0λ��<-(n/2λ��)->n-1λ��
//						newStr[n/2 - j] = c;
//						newStr[n/2 + j] = c;
//
//					}
//					frequency.remove(i);//�����εĴ�������֮��ȥ��
//					strNum.remove(i);
//					break;
//				}
//			}
//			
//			/*�����εĴ�����ϣ�ʣ�µľ�ȫ��ż���εģ�����ż���εĴ���*/
//			structureZero();//��ż�����ִ���
//		
//		}//else end
//		
//	}
//	
//	/**
//	 * ����structure�ĺ���
//	 * ��ż�����ֹ���Ĵ���
//	 */
//	public static void structureZero(){
//		//ż�����еĶ�Ҫ����
//		int kk = 0; //��¼newStr��ŵĽ���
//		for(int i = 0 ; i < frequency.size() ; i++){
//			char c = frequency.get(i);//Ҫ������ַ�
//			int num = strNum.get(i);//����
//			for(int k = kk ; k < num/2+kk ; k++){
//				newStr[k] = c;
//				newStr[n-1-k] = c;
//			}
//			kk += num/2;//���ַ�������Ϻ��¼����
//		}
//	}
//	
//	/**
//	 * �ж��Ƿ���Թ��ɻ���
//	 * @return �ܹ��ɷ���true�������򹹳ɷ���false
//	 */
//	public static boolean check(){
//		if(frequency.size() > (n+1)/2 ){	//���num > (n+1)/2,һ�����ܹ��ɻ���
//			System.out.println("Impossible");//�޷����ɣ�����
//			return false;
//		}
//		
//		if(n % 2 == 0 ){//n��ż��
//			for(int i = 0 ; i < strNum.size() ; i++){
//				int num = strNum.get(i);
//				if(num % 2 == 1){			//�ַ���n��ż������һ�����ܳ�������������ͬ�ַ�
//					System.out.println("Impossible");//�޷����ɣ�����
//					return false;	
//				}
//			}
//		}else{//n������
//			int s = 0 ;//�����������ж��Ƿ񳬳�һ��
//			for(int i = 0 ; i < strNum.size() ; i++){
//				int num = strNum.get(i);
//				if(num % 2 == 1 && s > 1){	//����ַ���n�����������ֻ�ܳ���һ������������ͬ�ַ�
//					System.out.println("Impossible");//�޷����ɣ�����
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
//	 * ͳ���ַ����༰����
//	 */
//	public static void count(){
//		for(int i = 0 ; i < n ; i++){//�����ַ���
//			char a = str.charAt(i);	 //ȡ����i���ַ�
//			if(!frequency.contains(a)){//������ַ�û�а�����ȥ
//				frequency.add(a);		//����frequency�����һ���µ�
//				strNum.add(1);			//�����ڶ�Ӧ�����������ʼ��Ϊ1
//			}else{
//				int index = frequency.indexOf(a);//��ȡ���ַ�������
//				strNum.set(index, strNum.get(index)+1 );//������һ
//			}
//		}
//	}
//
//}

