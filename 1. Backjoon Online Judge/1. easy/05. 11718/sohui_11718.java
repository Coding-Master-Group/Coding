package backjoon;

import java.util.Scanner;

public class Code_11718 {
	static Scanner scan = null;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		code();
	}

// 	입력 받은 대로 출력하기
// 최대 100줄, 각 줄은 100글자를 넘기지 않으며 빈줄은 주어지지 않음, 각줄은 공백으로 시작하지 않고 공백으로 끝나지 않는다.
	public static void code() {
		while (scan.hasNextLine()) {
			while (scan.hasNextLine()) {
				String input = scan.nextLine();
				System.out.println(input);
			}
			scan.close();
		}
	}
}
