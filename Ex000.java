
import java.util.Scanner;
public class Ex000 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);

		//MB→a
		//B→b

		double a , b;
		a = scan.nextDouble();
		while(true)	{
			if(a == 0000){
				break;
			}


			b  = a * (1024*1024);
			System.out.println(b + "B");
			//桁数の計算
			double z = b;
			int count = 0;
			while(z > 1){
				z /= 10;
				count++;
			}
			System.out.println(count);
			//小数点の抽出
			double h = b; //小数点を切り捨てたもの
			double j = b;//少数点を出すもの
			//１０のｎ乗の計算
			while(count > 0){
				int kai = count -1;
				int n = 1;
				while(kai > 0){
					n = n * 10;
					kai = kai -1;
				}
				j = j % n;
				count = count - 1;
			}
			h = h -j;
			System.out.println(j);
			System.out.println(h + "B");
			a = scan.nextDouble();
		}

	}

}




