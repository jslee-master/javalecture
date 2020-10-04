package scanner;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		//ForSumFrom1To100Example
		System.out.print("숫자를 입력해주세요: ");
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
				
		System.out.print(sum);

		int i;
		for(i=sum; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("~" + (i-1) + " 합 : " + sum);

	}

}
