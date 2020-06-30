import java.util.Arrays;
import java.util.Scanner;

public class SumX {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter n: ");
		int n = Integer.parseInt(scanner.nextLine());
		int[] s = new int[n];

		System.out.println("Enter array: ");
		for (int i = 0; i < n; i++) {
			s[i] = scanner.nextInt();
		}

		System.out.println("Enter X: ");
		int x = scanner.nextInt();

		System.out.println(findPair(s, x));
	}

	public static boolean findPair(int[] A, int sum) {
		Arrays.sort(A);

		int low = 0;
		int high = A.length - 1;

		while (low < high) {

			if (A[low] + A[high] == sum) {
				return true;
			}

			if (A[low] + A[high] < sum) {
				low++;
			} else {
				high--;
			}
		}
		return false;
	}

}
