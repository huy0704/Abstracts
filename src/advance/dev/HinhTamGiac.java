package advance.dev;

public class HinhTamGiac extends Hinh {
	private double canhA;
	private double canhB;
	private double canhC;
	private double duongCao;
	public HinhTamGiac(double canhA, double canhB, double canhC, double duongCao) {
		super();
		this.canhA = canhA;
		this.canhB = canhB;
		this.canhC = canhC;
		this.duongCao = duongCao;
	}
	@Override
	double chuVi() {
		
		// TODO Auto-generated method stub
		return (canhA + canhB + canhC);
	}
	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		return (canhA*1/2*duongCao);
	}
	
}
