package bit.r45.ch02;

import java.util.Scanner;

public class ScannerTest {

	//멤버 메소드
	public static void main(String[] args) {

/*		System.out.print("이름을 입력해주세요: ");
		Scanner sc = new Scanner(System.in);
		String li = sc.nextLine();
		
		String str1 = "이름";
		System.out.println(str1 + " : " + li);
		
		
		
		System.out.print("나이를 입력해주세요: ");
		Scanner sc1 = new Scanner(System.in);
		int num = sc1.nextInt();
		
		String str = "나이";
		System.out.println(str + " : " + num);
		
		System.out.print("당신의 이름은 " + li + " 나이는 " + num + " 입니다.");
*/		
		System.out.print("숫자를 입력해주세요: ");
		Scanner sc1 = new Scanner(System.in);
		int num = sc1.nextInt();
		
		if(num>0) {
			System.out.println("입력한 숫자는 양수 입니다.");
		} else if(num<0) {	
			System.out.println("입력한 숫자는 음수 입니다.");
		} else {
			System.out.println("입력한 숫자는 0 입니다.");
	}
	}

}
