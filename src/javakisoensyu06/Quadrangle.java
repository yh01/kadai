package javakisoensyu06;

public class Quadrangle extends Figure{
	public Quadrangle(int b, int h){
		super(b,h);
	}

	public void show(){
		System.out.println("四角形のデータ");
		super.show();
		super.getArea();
	}

	public double gerArea(){
		return super.getArea();
	}
}
