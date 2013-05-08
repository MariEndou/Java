import java.util.*;
public class ExHairetu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rnd  = new Random();
		int target;
		int su = scan.nextInt();
		int [] hairetu = new int[su];
		for(int i = 0; i < su ; i++){
			target  = rnd.nextInt(9);
			hairetu[i] = target + 1;
			System.out.println(hairetu[i]);
		}

	}

}
