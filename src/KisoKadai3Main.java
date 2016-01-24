import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KisoKadai3Main {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		KisoKadai3Inp i = new KisoKadai3Inp();
		KisoKadai3Mkdir d = new KisoKadai3Mkdir();
		KisoKadai3Out o = new KisoKadai3Out();
		KisoKadai3Mkfile f = new KisoKadai3Mkfile();
		KisoKadai3Dlt dl = new KisoKadai3Dlt();

		int end = 0;
		do{

			System.out.println("\n\n--メニュー--\n\n1:フォルダを作成する\n2:ファイルを作成する\n3:ファイルに追記する\n4:ファイルを出力する\n5:ファイル、フォルダを削除\n99:終了\nのどれかをキー入力してください");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			int nu = 0;

			if(str.matches("^[0-9]+$")){
				nu = Integer.parseInt(str);
			}else{
				System.out.println("\n----------\n半角数値でメニューを選択してください。\n----------\n");
			}

			if(nu == 99){
				System.out.println("終了");
				break;
			}
			if(nu == 1){
				System.out.println("フォルダを作成");
				d.fdN();
				d.mkdir();
			}
			if(nu == 2){
				System.out.println("ファイルを作成");
				f.fdN();
				f.mkfile();
			}
			if(nu == 3){
				System.out.println("ファイルに追記");
				i.fdN();
				i.inp();
			}
			if(nu == 4){
				System.out.println("ファイルを出力");
				o.fdN();
				o.out();
			}
			if(nu == 5){
				System.out.println("ファイル、フォルダを削除");
				dl.Dlt();
			}
		}while(end < 1);
		System.out.println("--処理終了--");
	}
}
