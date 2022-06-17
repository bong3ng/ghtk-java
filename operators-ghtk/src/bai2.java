import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class bai2 {

	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Nhap ngay thang nam cua nam can tinh (moc thoi gian 1):");
		  Date date1 = nhapNgayThangNam(scan);
		  System.out.println("Nhap ngay thang nam cua nam can tinh (moc thoi gian 2):");
		  Date date2 = nhapNgayThangNam(scan);
		  
		  long getDiff = date1.getTime() - date2.getTime();

		  long getDaysDiff = getDiff / (24 * 60 * 60 * 1000);

		  System.out.println("So ngay giua 2 moc thoi gian la: "+  getDaysDiff + " ngay.");

		 }
	
	 public static Date nhapNgayThangNam(Scanner scan) {
		 DateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		 Date date = new Date();
		 System.out.println("Nhap ngay thang nam: ");
		 System.out.println("Ngay: ");
		 int ngay = Integer.parseInt(scan.nextLine());
		 System.out.println("Thang: ");
		 int thang = Integer.parseInt(scan.nextLine());
		 System.out.println("Nam: ");
		 int nam = Integer.parseInt(scan.nextLine());
		 
		 String dateString = ngay + "-" + thang + "-" + nam;	
		 
		 try {
			date = simpleDateFormat.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return date;
	 }
	
	
//	public static void tinhSoNgay(int y1, int m1, int d1, int y2, int m2, int d2) {
//		
//		
//		int year = y1 - y2;
//		int dayOfY1 = dayFrom1(m1) + d1;
//		int dayOfY2 = dayFrom1(m2) + d2;
//		int ketQua = year*365 + dayOfY1 - dayOfY2;
//		
//				
////		t1 0; t2 31; t3 59; t4 90; t5 120; t6 151; t7 181; t8 212; t9 243; t10 273; t11 304; t12 334
//	}
//	
//	public static int dayFrom1(int month) {
//		final int t1 = 0;
//		final int t2 = 31;
//		final int t3 = 59;
//		final int t4 = 90;
//		final int t5 = 120;
//		final int t6 = 151;
//		final int t7 = 181;
//		final int t8 = 212;
//		final int t9 = 243;
//		final int t10 = 273;
//		final int t11 = 304;
//		final int t12 = 334;
//		
//		
//		switch(month) {
//		case 1:
//			return t1;
//		case 2:
//			return t2;
//		case 3:
//			return t3;
//		case 4:
//			return t4;
//		case 5:
//			return t5;
//		case 6:
//			return t6;
//		case 7:
//			return t7;
//		case 8:
//			return t8;
//		case 9:
//			return t9;
//		case 10:
//			return t10;
//		case 11:
//			return t11;
//		case 12:
//			return t12;
//		default:
//			return 0;
//		}
//	}
}
