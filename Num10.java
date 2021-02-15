public class Num10 
{
    public static void main(String[] args)
    {
        System.out.println("boxSeq(0) -> " + boxSeq(0));
        System.out.println("boxSeq(1) -> " + boxSeq(1));
        System.out.println("boxSeq(2) -> " + boxSeq(2));
        System.out.println("boxSeq(5) -> " + boxSeq(5));
    }
    public static int boxSeq(int n)
    {
        int ret = 0;
        for(int i = 0; i < n; ++i)
        {
            if(i % 2 == 0)
                ret += 3;
            else
                ret -= 1;
        }
        return ret;
    }
}
