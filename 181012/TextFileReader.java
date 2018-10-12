class TextFileReader
{
    // アクセス中のファイロ番号を格納する変数
    private int fileNo;

    // setter
    int setFileNo(int fileNo)
    {
        this.fileNo = fileNo;
    }
    
    // getter
    int getFileNo()
    {
        return fileNo;
    }

    // ファイルを開く
    void open (String pathName)
    {
        fileNo = 100; // ファイルを開いてファイル番号を取得
        System.out.println(pathName + "ファイルを開いて" + fileNo + "を取得");
    }

    // データを読み込む
    char read()
    {
        System.out.println(fileNo + "からデータを読み込む");
        return 'a';
    }

    // ファイルを閉じる
    char close()
    {
        System.out.println(fileNo + "ファイルを閉じた");
        return 0;
    }
}