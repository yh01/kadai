import java.io.File;

public class KisoKadai3Dlt {
	String dfN;
	@SuppressWarnings("resource")
	public void Dlt(){
		System.out.println("ファイルまたはフォルダを削除します");
		System.out.println("削除したいファイル、またはフォルダを絶対パスで指定してください");
		this.dfN = new java.util.Scanner(System.in) .nextLine();
		 File dfC = new File(this.dfN);

		    if (dfC.exists()){
		      if (dfC.delete()){
		        System.out.println(this.dfN + "を削除しました");
		      }else{
		        System.out.println(this.dfN + "の削除に失敗しました。メニューに戻ります");
		        return;
		      }
		    }else{
		      System.out.println(this.dfN + "が見つかりません。メニューに戻ります");
		      return;
		    }
	}
}
