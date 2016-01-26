package javakisoensyu03;

public class Goods {
	String name;
	int cost;
	static double rate;
	public Goods(String n){
		this.name = n;
		this.cost = 0;
	}
	public Goods(String n, int c){
		this.name = n;
		this.cost = c;
	}
	public String getName(){
		return this.name;
	}
	public static double getRate(){
		return rate;
	}
	public int getCost(){
		return this.cost;
	}
	public int getPrice(){
		 return (int) (this.cost * (1 + rate) / 1);
	}
	public void setName(String n){
		this.name = n;
	}
	public void setCost(int c){
		this.cost = c;
	}
	public static void setRate(double r){
		rate = r;
	}
	public void show(){
		System.out.println("商品名 :" + getName());
		System.out.println("税抜き価格 :" + getCost());
		System.out.println("消費税率 :" + getRate());
		System.out.println("消費税込み  :" + getPrice());
	}
}
