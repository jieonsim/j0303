package loop;

import java.util.Scanner;

public class For_practice9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ȧ���� �Է��ϼ��� : ");
		int odd = sc.nextInt(); // ���̾Ƹ�� ũ�⸦ �����ϴ� �߰� ������ �� ����, Ȧ������ ��
		int n = (odd / 2) + 1; // ���̾Ƹ�带 ���Ʒ� �ѷ� ������ �� ��� ���� ���(�߰� ���α��� �����ϱ� ���� �ѷ� ���� �� +1 �ʿ�)

		// ��� �κ�
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) { // ù��° �ٺ��� ������� �߰� ���� �� ���� - 1�� ��ŭ�� ������ �ʿ���
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) { // �� ���� Ȧ������ �����ؾ� ��. 2 * i(¦�� ��� ��) - 1�� �Ͽ� Ȧ���� ���
				System.out.print("*");
			}
			System.out.println(); // ���ϴ� ������ ���� �ٹٲ�
		}
		// �ϴ� �κ�
		for (int i = n - 1; i > 0; i--) { // �߰� ���� �������� �ϳ� �۰� �����ϱ� ���� n - 1
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
