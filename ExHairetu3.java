import java.util.*;

public class ExHairetu3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		int target;
		// 要素数を入力
		System.out.println("要素数を入力");
		int su = scan.nextInt();
		int hairetu[] = new int[su];
		boolean[] hantei = new boolean[10];
		for (int j = 0; j < 10; j++) {
			hantei[j] = false;
		}
		
		target = rnd.nextInt(10);
		su++;
		for (int k = 0; k < su;) {
			if (hantei[target] == false) {
				hantei[target] = true;
				target++;
				hairetu[k] = target;
				System.out.println(hairetu[k]);
				target = rnd.nextInt(10);
				k++;
			} else if (hantei[target] == true) {
				target = rnd.nextInt(10);
			}
		}

	}
}