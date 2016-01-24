import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KisoKadai3 {
	@SuppressWarnings("resource")
	public static void Mkdir(){
		String dirN1,dirN2;
		System.out.println("フォルダを作成します");
		System.out.println("保存するフォルダを絶対パスで指定してください");
		dirN1 = new java.util.Scanner(System.in) .nextLine();
		File fileC = new File(dirN1);
		if (fileC.exists()){
		    System.out.println("フォルダは存在します");
		    System.out.println("フォルダ名を入力してください");
			dirN2 = new java.util.Scanner(System.in) .nextLine();
			File newdir = new File(dirN1 +"\\"+ dirN2);
			newdir.mkdir();
			System.out.println(dirN1 + "に" + dirN2 + "が作成されました");
		}else{
		    System.out.println("フォルダは存在しません。メニューに戻ります。");
		    return;
		}

	}

	@SuppressWarnings("resource")
	public static void Mkfile(){
		String fileN,dirN;
		System.out.println("ファイルを作成します");
		System.out.println("保存するフォルダを指定してください");
		dirN = new java.util.Scanner(System.in) .nextLine();
		File fileC = new File(dirN);
		if (fileC.exists()){
		    System.out.println("フォルダは存在します");
		    System.out.println("ファイル名を入力してください");
			fileN = new java.util.Scanner(System.in) .nextLine();
			File newfile = new File(dirN +"\\"+ fileN);
			try {
				newfile.createNewFile();
				System.out.println(dirN + "に" + fileN + "が作成されました");
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

	@SuppressWarnings("resource")
	public static void Inp(){
		String fileN,dirN,input1;
		System.out.println("ファイルに追記します");
		System.out.println("追記したいファイルが保存してあるフォルダを絶対パスで指定してください");
		dirN = new java.util.Scanner(System.in) .nextLine();
		File dirC = new File(dirN);
		if (dirC.exists()){
			System.out.println("追記したいファイル名を入力してください");
			fileN = new java.util.Scanner(System.in) .nextLine();
			File fileC = new File(dirN + "\\" + fileN);
			if (fileC.exists()){
				System.out.println("追記したい内容を記述してください");
				input1 = new java.util.Scanner(System.in) .nextLine();
				FileWriter fw = null;
				try{
					fw = new FileWriter(dirN +"\\"+ fileN,true);
					fw.write(input1 + "\r\n");
					fw.flush();
					System.out.println(dirN + "の" + fileN + "に"+ input1 + "を追記しました");
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

	@SuppressWarnings("resource")
	public static void Out(){
		String fileN,dirN;
		System.out.println("ファイルを出力します。");
		System.out.println("出力したいファイルが保存してあるフォルダを絶対パスで指定してください");
		dirN = new java.util.Scanner(System.in) .nextLine();
		File dirC = new File(dirN);
		if (dirC.exists()){
			System.out.println("出力するファイル名を入力してください");
			fileN = new java.util.Scanner(System.in) .nextLine();
			File fileC = new File(dirN + "\\" + fileN);
			if (fileC.exists()){
				FileReader fileR = null;
				try{
					fileR = new FileReader(dirN +"\\"+ fileN);
					System.out.println(dirN + "の" + fileN + "を出力します");
				  	int ch;
					while((ch = fileR.read()) != -1){
					  System.out.print((char)ch);
					}

				}catch(FileNotFoundException e){
					  System.out.println(e);
				}catch(IOException e){
					  System.out.println(e);
				}finally{
					if(fileR != null){
						try{
							if(fileR != null){
								fileR.close();
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

	@SuppressWarnings("resource")
	public static void Dlt(){
		String dfN;
		System.out.println("ファイルまたはフォルダを削除します");
		System.out.println("削除したいファイル、またはフォルダを絶対パスで指定してください");
		dfN = new java.util.Scanner(System.in) .nextLine();
		 File dfC = new File(dfN);

		    if (dfC.exists()){
		      if (dfC.delete()){
		        System.out.println(dfN + "を削除しました");
		      }else{
		        System.out.println(dfN + "の削除に失敗しました。メニューに戻ります");
		        return;
		      }
		    }else{
		      System.out.println(dfN + "が見つかりません。メニューに戻ります");
		      return;
		    }
	}


	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		int end = 0;
		do{
			System.out.println("\n\n--メニュー--\n\n1:フォルダを作成する\n2:ファイルを作成する\n3:ファイルに追記する\n4:ファイルを出力する\n5:ファイル、フォルダを削除する\n99:終了\nのどれかをキー入力してください");
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
				Mkdir();

			}
			if(nu == 2){
				System.out.println("ファイルを作成");
				Mkfile();

			}
			if(nu == 3){
				System.out.println("ファイルに追記");
				Inp();

			}
			if(nu == 4){
				System.out.println("ファイルを出力");
				Out();
			}
			if(nu == 5){
				System.out.println("ファイルまたはフォルダを削除");
				Dlt();
			}
		}while(end < 1);
		System.out.println("--処理終了--");
	}
}
