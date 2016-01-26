package javakisoensyu02;

public class Student {
	String name;
	int kokugo,sansu;

	public Student(String name){
		this.name = name;
		this.kokugo = 0;
		this.sansu = 0;
		System.out.println("氏名：" + this.name + "\n国語：" + this.kokugo + "\n算数：" + this.sansu);
	}
	public Student(String name,int kokugo,int sansu){
		this.name = name;
		this.kokugo = kokugo;
		this.sansu = sansu;
		System.out.println("氏名：" + this.name + "\n国語：" + this.kokugo + "\n算数：" + this.sansu);
	}
	public String getName(){
		return this.name;
	}
	public int getKokugo(){
		return this.kokugo;
	}
	public int getSansu(){
		return this.sansu;
	}
	public void setName(String n){
		this.name = n;
		System.out.println("名前：" + this.name);
	}
	public void setKokugo(int k){
		this.kokugo = k;
		System.out.println("国語：" + this.kokugo);
	}
	public void setSansu(int s){
		this.sansu = s;
		System.out.println("算数：" + this.sansu);
	}
}