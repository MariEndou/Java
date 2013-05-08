import java.util.*;

public class Ex3_16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] t1 = new int[100];
		int su;
		int j = 0;
		int count = 0;
		int taihi, min, max;
		// 入力
		System.out.println("複数の数字を入力してください。９９９９で入力終了");
		while (true) {
			su = scan.nextInt();
			if (su == 9999) {
				break;
			}
			t1[j] = su;
			j = j + 1;
			count = count + 1;
		}
		for (int r = 0; r < count; r++) {
			System.out.print(t1[r] + " ");
		}
		count = count - 1;
		System.out.println(" ");
		for (int h = 0; h < count; h++) {
			for (int k = 0; k < count; k++) {
				if (t1[k] > t1[k + 1]) {
					taihi = t1[k + 1];
					t1[k + 1] = t1[k];
					t1[k] = taihi;
				}
			}
		}
		for (int l = 0; l < count + 1; l++) {
			System.out.print(t1[l] + " ");
		}
		System.out.println(" ");
		System.out.print("MIN;" + t1[0] + "MAX;" + t1[count]);
	}
}
