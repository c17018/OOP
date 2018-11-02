public class Main
{
    public static void main(String[] args)
    {
        Tripleton hoge1 = Tripleton.getInstance();
        System.out.println(hoge1);
        Tripleton hoge2 = Tripleton.getInstance();
        System.out.println(hoge2);
        Tripleton hoge3 = Tripleton.getInstance();
        System.out.println(hoge3);
        Tripleton hoge4 = Tripleton.getInstance();
        System.out.println(hoge4);
        Tripleton hoge5 = Tripleton.getInstance();
        System.out.println(hoge5);
        Tripleton hoge6 = Tripleton.getInstance();
        System.out.println(hoge6);
        Tripleton hoge7 = Tripleton.getInstance();
        System.out.println(hoge7);
        Tripleton hoge8 = Tripleton.getInstance();
        System.out.println(hoge8);
    }
}