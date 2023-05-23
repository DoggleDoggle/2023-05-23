
public class WhileUse {

	public static void main(String[] args) {

		// i 가 0 일때
		int i = 0;
		while (i <= 10) {
			System.out.println("stmt1:i=" + i);
			i++;
		}
		System.out.println("============================");
		int t = 1;
		while (t <= 10) {
			System.out.println("stmt1:t=" + t);
			t++;
		}

		System.out.println(">>1 1-10 사이의 정수 출력(10회)");
		i = 0;
		while (i < 10) {
			System.out.print((i + 1) + " ");
			i++;

		}
		System.out.println("\n");// 라인 종결자
		i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		System.out.println(">>1-10[홀수]");
		i = 1;
		while (1 <= 10) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
			i++;

		}
		//System.out.println();
		//System.out.println(">> 1 -100사이[4의 배수]");
		//i = 1;
		while (1 <= 100) {
			if (i % 4 == 0) {
				System.out.println(i + " ");
			}
			i++;
		}
		System.out.println();
		System.out.println("1900년에서 2023년 사이까지 윤년을 출력하라");
		int year = 1900;
		while (year <= 2023) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println(year + "\t");
			}
			year++;
		}
		System.out.println(">> 1-100 사이의 정수합[누적]");
		int tot = 0; // 누적합
		int oddTot=0;//홀수합
		int evenTot=0;//짝수합
		i = 1;
		while (i <= 100) {
			//tot = tot + 1;+ㅅ
			tot += i; //연산 흐 대입연산자
			if(i%2==0) {
				evenTot+=1;
			}else {
				oddTot+=i;
			}
			i++;
		}
		System.out.println(">>1-100사이의 정수합"+tot);
		System.out.println(">>1-100사이의 짝수합"+evenTot);
		System.out.println(">>1-100사이의 홀수합"+oddTot);
	}
}
