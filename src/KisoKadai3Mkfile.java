import java.io.File;
import java.io.IOException;

public class KisoKadai3Mkfile {
	String fileN,dirN;
	@SuppressWarnings("resource")
	void fdN(){
		System.out.println("ファイルを作成します");
		System.out.println("保存するフォルダを絶対パスで指定してください");
		this.dirN = new java.util.Scanner(System.in) .nextLine();
		System.out.println("ファイル名を入力してください");
		this.fileN = new java.util.Scanner(System.in) .nextLine();
	}
	public void mkfile(){
		File fileC = new File(this.dirN);
		if (fileC.exists()){
			File newfile = new File(this.dirN +"\\"+ this.fileN);
			try {
				newfile.createNewFile();
				System.out.println(this.dirN + "に" + this.fileN + "が作成されました");
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				System.out.println("作成に失敗しました");
				e.printStackTrace();
			}
		}else{
		    System.out.println("フォルダは存在しません。メニューに戻ります。");
		    return;
		}
	}
}
