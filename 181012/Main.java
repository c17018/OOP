public class Main 
{
    public static void main (String [] args)
    {
        // // start
        // System.out.println("Hello World!");
        // TextFileReaderのインスタンスを作る
        TextFileReader rd1 = new TextFileReader();

        // ファイルを開く
        rd1.open("var/tmp/data.dat");
        System.out.println("ファイル番号:" + rd1.getFileNo());
        rd1.setFileNo(200);
        // rd1.fileNo = 200; // バグ
        
        // データを読み込む
        char data = rd1.read();
        
        // データを処理する
        System.out.println(data + "を処理");

        // 結果を出力する
        System.out.println("結果を出力");
        
        // ファイルを閉じる
        rd1.close();
    }
}