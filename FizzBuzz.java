import java.util.*;

public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count = 1;
		int a, b;
		System.out.println("a,ｂ,を入力してください");
		a = scan.nextInt();
		b = scan.nextInt();
		int c = a * b;
		if (a != 0 && b != 0) {

			while (count < 101) {
				if (count % a == 0 && count % b != 0) {
					System.out.println("Fizz");
				} else if (count % b == 0 && count % a != 0) {
					System.out.println("Buzz");
				} else if (count % c == 0) {
					System.out.println("FizzBuzz");
				} else {
					System.out.println(count);
				}
				count++;
			}
		} else {
			System.out.println("０ではできません");

		}
	}

}
