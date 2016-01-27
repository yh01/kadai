package javakisoensyu05;

public class Exercise05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("--------------------------------\n"
				+ "		社員名簿システム		"
				+ "\n--------------------------------");
		Employee yazawa = new Employee("矢沢",5,28);
		yazawa.display();
		System.out.println("--------------------------------");
		Employee miyamoto = new Employee("宮本",10,33);
		miyamoto.display();
		System.out.println("--------------------------------");
		Employee fuziwara = new Employee("藤原",3,23);
		fuziwara.display();
		System.out.println("--------------------------------");
		Employee tsutiura = new Employee("土浦",25,45);
		tsutiura.display();
		System.out.println("--------------------------------");
		Employee nosaki = new Employee("野崎",18,38);
		nosaki.display();
		System.out.println("--------------------------------");
		Employee asai = new Employee("浅井",8,31);
		asai.display();
		System.out.println("--------------------------------");
	}

}
