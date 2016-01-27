package javakisoensyu05;

public class Employee {
	 private static int number = 0;
	  private int code;
	  private String name;
	  private int year;
	  private int age;

	  //コンストラクタの定義
	  public Employee(String name,int year,int age){
	    setName(name);
	    setYear(year);
	    setAge(age);
	    code = ++number;
	  }
	  public Employee(){
	    this("未定",0,0);
	  }
	  public Employee(String name){
	    this(name,0,0);
	  }
	  public Employee(String name,int age){
		    this(name,0,age);
	  }

	  //フィールドのデータを表示するメソッド
	  public void display(){
	    System.out.println("社員番号："+code);
	    System.out.println("社員名："+name);
	    System.out.println("入社年数："+year);
	    System.out.println("年齢："+age);
	  }
	  //社員名を設定するメソッド
	  public void setName(String name){
	    this.name = name;
	  }
	  //入社年数を設定するメソッド
	  public void setYear(int year){
	    if(year > 0){
	      this.year = year;
	    }
	  }
	  //年齢を設定するメソッド
	  public void setAge(int age){
	    if(age > 0){
	      this.age = age;
	    }
	  }
	  //社員番号を取得するメソッド
	  public int getCode(){
	    return code;
	  }
	  //社員名を取得するメソッド
	  public String getName(){
	    return name;
	  }
	  //入社年数を取得するメソッド
	  public int getYear(){
	    return year;
	  }
	  //年齢を取得するメソッド
	  public int getAge(){
	    return age;
	  }
	  //総社員数を表示するメソッド
	  public static void showTotalNumber(){
	    System.out.println("総社員数は"+number+"人です。");
	  }
}
