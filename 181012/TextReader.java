abstract class TextReader
{
    // オープン
    abstract void open();
    // クローズ
    abstract char close();
    // データを読み込む
    abstract char read();
}