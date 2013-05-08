import java.util.*;
public class Ex3_16_2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int [] t1 = new int[100];
		int su;
		int j = 0;
		int count = 0;
		int  min = 9999;
		int num  = 0;
		System.out.println("複数の数字を入力してください。９９９９で入力終了");
		//入力
		while(true){
			su = scan.nextInt();
			if(su == 9999){
				break;
			}
			t1[j] = su;
			count++;
			j++;
		}
		System.out.println(count);
		//出力
		for(int g = 0; g < count; g++){
			System.out.print(t1[g] + " ");
		}
		System.out.println(" ");
		//昇順に
		for(int k = 0; k < count;k++){
			min = 9999;
			for(int s = k; s < count;s++){
				if(min > t1[s]){
					min = t1[s];
					num = s;
				}
			}
			t1[count+1] = t1[num];
			t1[num] = t1[k];
			t1[k] = t1[count+1];
		}
		for(int i = 0;i < count; i++){
		System.out.print(t1[i] + " ");
		}
	}

}
