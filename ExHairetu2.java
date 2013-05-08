import java.util.*;

public class ExHairetu2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		int target;
		int su = scan.nextInt();
		int[] hairetu = new int[su];
		int count = 0;
		for (int i = 0; i < su; i++) {
			target = rnd.nextInt(9);

			hairetu[i] = target + 1;
			if (i >= 1) {
				if (hairetu[i] == hairetu[i-1]) {
					if (hairetu[i] >= 9) {
						hairetu[i]--;
					} else {
						hairetu[i]++;
					}
				}
			}
			System.out.println(hairetu[i]);
			count++;
		}
		System.out.println(count);
	}
}
