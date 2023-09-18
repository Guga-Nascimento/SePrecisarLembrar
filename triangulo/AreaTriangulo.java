package triangulo;

public class AreaTriangulo {
	
	private double ladoA;
	private double ladoB;
	private double base;
	public AreaTriangulo() {
	
	}
	public AreaTriangulo(double ladoA, double ladoB, double base) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.base = base;
	}
	public double getLadoA() {
		return ladoA;
	}
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	public double getLadoB() {
		return ladoB;
	}
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	
	public double calcularArea() {
		
		double p = ((base + ladoA + ladoB)/2);
		//RAIZ QUADRADA
		double area = Math.sqrt(p*(p - base)*(p - ladoA)*(p - ladoB));
		return area;
		
	}
	

}
