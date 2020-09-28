package bit.r45.ch02;

public class VariableScope {

	static void myprint() {
		System.out.println(v4);
	}

	//멤버 메소드
	public static void main(String[] args) {

		char a = 'a';
		char b = 'b', c = 'c'; // 문자형
	
		String str = "Hi."; // 문자열
		System.out.println(str);
		//		System.out.println(ch);
		//System.out.println(ch);
		
		myprint();
		run();
		printVar();
	}
	
	static void printVar() {
		byte val1 = 125;
		int val2 = 125;
		
		for(int i=0; i<5; i++) {
			val1++;
			val2++;
			System.out.println("val1: " + val1 + "\t" + "val2: " + val2);
		}
	}
	
	
	static void run() {
//		System.out.println(a);
//		System.out.println(str);
		System.out.println(ch);
		
		int v1 = 10, v2 = 0;
		if(v1 > 10) {
			v2 = v1 - 5;
		}
		int v3 = v1 + v2 + 10; //
		
		//v4계산
		v4 = v3 + 10;
	}

	//멤버 필드
	static char ch = 'a';
	static int v4 = 0;

}
