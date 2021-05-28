package packageA;

public class SanPham {
	String maSP, tenSP;
	double gia;
	int soluong;
	
	public SanPham() {
		// TODO Auto-generated constructor stub
	}

	public SanPham(String maSP, String tenSP, double gia, int soluong) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.gia = gia;
		this.soluong = soluong;
	}

	///tinh thanh tien
	public double tinhtien() {
		double thanhtien = 0;
		if (this.soluong > 20)
			thanhtien= this.gia*this.soluong* 0.15;
		else
			thanhtien=this.gia*this.soluong;
		
		return thanhtien;
	}
	
	public void displaySP() {
		System.out.println(this.maSP + " "+ this.tenSP + "  "+ this.gia + "  " + this.soluong +"  " + this.tinhtien());
	}


}
