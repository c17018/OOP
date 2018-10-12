class TextFileReader extends TextReader
{
    // オープンするファイルのファイルパス
    private String filePath;

    // アクセス中のファイロ番号を格納する変数
    private int fileNo;

    // コンストラクタ
    public TextFileReader(String filePath)
    {
        super();
        this.filePath = filePath;
    }

    // // setter
    // int setFileNo(int fileNo)
    // {
    //     this.fileNo = fileNo;
    //     return fileNo;
    // }
    
    // // getter
    // int getFileNo()
    // {
    //     return fileNo;
    // }

    // ファイルを開く
    @Override
    public void open()
    {
        fileNo = 100; // ファイルを開いてファイル番号を取得
        System.out.println(filePath + "ファイルを開いて" + fileNo + "を取得");
    }

    // データを読み込む
    @Override
    public char read()
    {
        System.out.println(fileNo + "からデータを読み込む");
        return 'a';
    }

    // ファイルを閉じる
    @Override
    public char close()
    {
        System.out.println(fileNo + "ファイルを閉じた");
        return 0;
    }
}