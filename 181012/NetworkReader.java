class NetworkReader extends TextReader
{
    // ネットワークをオープンする
    void open ()
    {
        System.out.println("ネットワークをオープンしました");
    }

    // ネットワークからデータを読み込む
    char read()
    {
        System.out.println("ネットワークからデータを読み込む");
        return 'a';
    }

    // ネットワークを閉じる
    char close()
    {
        System.out.println("ネットワークを閉じた");
        return 0;
    }
}