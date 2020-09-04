import java.util.Scanner;

public class ад {
	static void dd(int[] bb, int n, int k) {
		int temp;
int a;
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 1 + i; j < n; j++) {
				if (bb[i] > bb[j]) {
					temp = bb[j];
					bb[j] = bb[i];
					bb[i] = temp;

				}
			}
			for (int j = 1 + i; j < n; j++) {
				if (bb[i] == 0)
					break;
				if (bb[i] + bb[j] >= k) {
					count++;
					bb[i] = 0;
					bb[j] = 0;
					break;
				}
			}
		}
		System.out.println(count);

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int bb[] = new int[n];
		for (int i = 0; i < n; i++) {
			bb[i] = s.nextInt();
		}
		dd(bb, n, k);
	}

}
