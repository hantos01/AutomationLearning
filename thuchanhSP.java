package packageA;
import java.util.ArrayList;
import java.util.Scanner;

public class thuchanhSP {

	private static Scanner scan;
	private static SanPham sp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		scan = new Scanner(System.in);
		String maSP, tenSP;
		double gia;
		int soluong;
		ArrayList<SanPham> arr = new ArrayList<>();
		
		//nhap 5 san pham
		for (int i=1; i<=2 ; i++)
		{
			System.out.println("nhap san pham thu : " + i);
			maSP = scan.nextLine();
			tenSP = scan.nextLine();
			gia= scan.nextDouble();
			soluong = scan.nextInt();
			
			sp = new SanPham(maSP, tenSP, gia, soluong);
			arr.add(sp);
						
		}
		
		
		//sap xep giam dan thanh tien
	
			SanPham s1= new SanPham();
			for (int i=1; i<=arr.size(); i++) 					
				for (int j=i+1;j<=arr.size(); j++)
				{
					double t1 = arr.get(i).tinhtien();
					double t2 = arr.get(j).tinhtien();
					if (t1> t2)
					{
						s1= arr.get(i);
						arr.set(i, arr.get(j));
						arr.set(j, arr.get(i));
					}
					
					
			}
				
		
		
		//hien thi toan bo
		for (SanPham a: arr) {
			a.displaySP();
		}

	}

}
