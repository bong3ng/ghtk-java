import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		input(scan);

	}
	public static int DayByEnum(int month) {
		switch (month) {
		case 1:
			return Month.month1.getDays();
		case 2:
			return Month.month2.getDays();
		case 3:
			return Month.month3.getDays();
		case 4:
			return Month.month4.getDays();
		case 5:
			return Month.month5.getDays();
		case 6:
			return Month.month6.getDays();
		case 7:
			return Month.month7.getDays();
		case 8:
			return Month.month8.getDays();
		case 9:
			return Month.month9.getDays();
		case 10:
			return Month.month10.getDays();
		case 11:
			return Month.month11.getDays();
		case 12:
			return Month.month12.getDays();
			
		default:
			System.out.println("Ban da nhap sai thang trong nam");
			return 0;
		}
	}
	
	public enum Month{
		month1(31),month2(28),month3(31),month4(30),month5(31),month6(30),month7(31),month8(31),month9(30),month10(31),month11(30),month12(31);
		
		private final int days;
		
		public int getDays() {
			return days;
		}
		
		private Month(int i) {
			this.days = i;
			
		}
	}
	
	public static int Days(int month) {
		if(month < 1 || month > 12) {
			System.out.println("Ban da nhap sai thang trong nam");
			return 0;
		}
		
		if (month > 7) {
			month +=1;
		}
		if (month == 2) {
			return 28;
		}
		else if(month % 2 ==1) {
			return 31;
		}
		else {
			return 30;
		}
	}
	
	public static void input(Scanner scan) {
		System.out.println("Nhap so thang ban can tim la: ");
		int month = Integer.parseInt(scan.nextLine());
		int days1 = DayByEnum(month);
		System.out.println("So ngay theo enum va switch la: " + days1);
		int days2 = Days(month);
		System.out.println("So ngay khong theo enum la: " + days2);
		
		
		
	}
}
