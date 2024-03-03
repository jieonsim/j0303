package loop;

import java.util.Scanner;

public class For_practice9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("홀수를 입력하세요 : ");
		int odd = sc.nextInt(); // 다이아몬드 크기를 결정하는 중간 라인의 별 개수, 홀수여야 함
		int n = (odd / 2) + 1; // 다이아몬드를 위아래 둘로 나눴을 때 상단 높이 계산(중간 라인까지 포함하기 위해 둘로 나눈 후 +1 필요)

		// 상단 부분
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) { // 첫번째 줄부터 순차대로 중간 라인 별 개수 - 1개 만큼의 공백이 필요함
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) { // 별 또한 홀수개씩 증가해야 함. 2 * i(짝수 계산 후) - 1을 하여 홀수개 출력
				System.out.print("*");
			}
			System.out.println(); // 상하단 나누기 위해 줄바꿈
		}
		// 하단 부분
		for (int i = n - 1; i > 0; i--) { // 중간 라인 개수보다 하나 작게 시작하기 위해 n - 1
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
