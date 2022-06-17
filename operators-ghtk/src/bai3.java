
public class bai3 {

	public static void main(String[] args) {
		Tong_DoWhile();
		Tong_DoWhile();
		Tong_For();
	}
	
	public static void Tong_While() {
		int i = 0;
		int sum = 0;
		while(i < 10000) {
			i++;
			sum += i;
		}
		System.out.println(sum);
	}
	
	public static void Tong_DoWhile() {
		int i = 0;
		int sum = 0;
		do {
			i++;
			sum += i;
		}while(i<10000);
		System.out.println(sum);
	}
	
	public static void Tong_For() {
		int sum = 0;
		for(int i = 1; i <= 10000;i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
