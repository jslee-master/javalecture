package scanner;

import java.util.Scanner;

public class While {

//	public static void main(String[] args) {

/*		//WhilePrintFrom1To10Example
		System.out.print("1부터 10 사이의 숫자를 입력해주세요: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		System.out.println(i + "부터 10까지 출력");
		
		while (i<=10) {
			System.out.println(i);
			i++;
		}
*/

/*		//WhileSumForm1To100Example
		System.out.print("1부터 100 사이의 숫자를 입력해주세요: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		int sum = 0; 

		System.out.print(i);
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("~" + (i-1) + " 합 : " + sum);
*/
		
		//WhileKeyControlExample
		public static void main(String[] args) throws Exception {
			boolean run = true;		
			int speed = 0;
			int keyCode = 0;
			
			while(run) {
				if(keyCode!=13 && keyCode!=10) {
					System.out.println("-----------------------------");
					System.out.println("1.증속 | 2.감속 | 3.중지");
					System.out.println("-----------------------------");
					System.out.print("선택: ");
				}
				
				keyCode = System.in.read();
				
				if (keyCode == 49) { //1
					speed++;
					System.out.println("현재 속도=" + speed);
				} else if (keyCode == 50) { //2
					speed--;
					System.out.println("현재 속도=" + speed);
				} else if (keyCode == 51) { //3
					run = false;
				}
			}	
			
			System.out.println("프로그램 종료");

	}

}
