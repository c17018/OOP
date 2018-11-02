public class Tripleton
{
    private static Tripleton[] tripletons = 
    {
        new Tripleton(),
        new Tripleton(),
        new Tripleton(),
    };

    static int tripletonConut = 0;

    private Tripleton()
    {
        // System.out.println("インスタンスを生成しました。");
    }
    
    public static Tripleton getInstance()
    {
        tripletonConut = tripletonConut % 3;
        return tripletons[tripletonConut++];
    }

    // static void p()
    // {
    //     System.out.println("インスタンス =>" + tripletons[0]);
    // }
}