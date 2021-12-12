package backjoon;

import java.util.Scanner;

public class Code_1001 {
	static Scanner scan = null;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		code();
	}
	
// 	두 정수를 입력 받은 후 뺄셈한 값을 출력하시오
	public static void code() {
		System.out.println("뺄셈할 정수 두개를 입력하세요.");

		System.out.print("A: ");
		int iNum1 = scan.nextInt();

		System.out.print("B: ");
		int iNum2 = scan.nextInt();

		int temp = iNum1 - iNum2;
		System.out.println("값: " + temp);
		
        scan.close();
	}

}
