package advance.dev;
import advance.dev.Hinh;
import advance.dev.HinhChuNhat;
import advance.dev.HinhTamGiac;
import advance.dev.HinhTron;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hinh h = new HinhTron(5);
		h.chuVi();		
		h.dienTich();
		System.out.println("Chu vi: " + h.chuVi());
		System.out.println("Dien tich: " + h.dienTich());
		
		Hinh h1 = new HinhChuNhat(10,2,5);
		h1.chuVi();
		h1.dienTich();
		System.out.println("-------------------");
		System.out.println("Chu vi: " + h1.chuVi());
		System.out.println("Dien tich: " + h1.dienTich());
		
		Hinh h2 = new HinhTamGiac(11, 8, 6, 5);
		h2.chuVi();
		h2.dienTich();
		System.out.println("-------------------");
		System.out.println("Chu vi: " + h2.chuVi());
		System.out.println("Dien tich: " + h2.dienTich());
		
	}

}
