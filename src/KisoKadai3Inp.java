import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class KisoKadai3Inp {
	String fileN,dirN;
	String input1;
	@SuppressWarnings("resource")
	void fdN(){
		System.out.println("ファイルに追記します");
		System.out.println("フォルダを指定してください");
		this.dirN = new java.util.Scanner(System.in) .nextLine();
	}

	@SuppressWarnings("resource")
	public void inp(){
		File dirC = new File(this.dirN);
		if (dirC.exists()){
			System.out.println("追記したいファイル名を保存場所名から入力してください");
			this.fileN = new java.util.Scanner(System.in) .nextLine();
			File fileC = new File(this.dirN +"\\" + this.fileN);
			if (fileC.exists()){
				System.out.println("追記したい内容を記述してください");
				this.input1 = new java.util.Scanner(System.in) .nextLine();
				FileWriter fw = null;
				try{
					fw = new FileWriter(this.dirN +"\\"+ this.fileN,true);
					fw.write(this.input1 + "\r\n");
					fw.flush();
					System.out.println(this.dirN + "の" + this.fileN + "に"+ this.input1 + "を追記しました");
				}catch(IOException e){
						System.out.println("ファイル書き込みエラーです");
				}finally{
					if(fw != null){
						try{
							if(fw != null){
								fw.close();
							}
						}catch(IOException e2){}
					}
				}
			}else{
			    System.out.println("ファイルは存在しません。メニューに戻ります。");
			    return;
			}
		}else{
		    System.out.println("フォルダは存在しません。メニューに戻ります。");
		    return;
		}
	}
}
