import java.util.Iterator;

public class Fortest {

	public static void main(String[] args) {

		System.out.println("=========while============");
		int k = 0; // 반복변수의 초기화
		while (k < 10) { // 반복변수 비교 (반복 조건)
			System.out.println("k=" + k);// 3.반복문 실행
			k++; // 4.반복변수 증가 or 감소
		}
		System.out.println("=======---for============");
		for (int i = 0; i < 10; i++) {
			System.out.println("i=" + i);
		}

		System.out.println("=======---for============");
		for (int i = 10; i > 0; i--) {
			System.out.println("i=" + i);

		}
		System.out.println(">> 홀수만 출력 [1~100]");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1)
				System.out.println(i + " ");

		}

		System.out.println(">> 4의 배수 출력 [1~100]");
		for (int i = 1; i <= 100; i++) {
			if (i % 4 == 0)
				System.out.println("100보다 작은 4의 배수" + i);
		}

		System.out.println("3과 4사이의 공통배수[1~100]");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.println("3과 4사이의 공배수:" + i);

			}

		}

		System.out.println("3과 4사이의 최소공배수[1~100]");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.println("3과 4사이의 최소공배수:" + i);
				break;

			}
		}

		System.out.println(">> 4의 배수가 아닌 수 출력");
		for (int i = 1; i <= 100; i++) {
			if (i % 4 == 0) {
				continue;
				/*
				 * 반복 블록에서만 사용 1.continue문 이후에 for 블록코드 실행하지 않는다. 2.다음 반복문은 계속 실행한다.(continue)
				 */
			}
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println(">>홀수 짝수 합 [1~100]");

		int oddTot = 0;
		int evenTot = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				// 짝수 누적
				evenTot += i;
			else
				// 홀수 누적
				oddTot += i;
		}

		System.out.println("짝수형:" + evenTot);
		System.out.println("홀수형:" + oddTot);
		System.out.println("======문자출력=======");

		for (int a = 2; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				System.out.println(a + "X" + b + "=" + (a * b));
			}
		}

		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(c);
			if (c == 'z') {
				continue; // 마지막 z에서 ,생략하기 위해 if문과 continue 사용함
			}
			System.out.print(",");
		}
		System.out.println();

	}
}