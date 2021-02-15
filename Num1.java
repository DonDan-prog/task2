public class Num1
{
    public static void main(String[] args)
    {
        testcase();

        System.out.println("repeat(\"mice\", 5) -> " + repeat("mice", 5));
        System.out.println("repeat(\"hello\", 3) -> " + repeat("hello", 3));
        System.out.println("repeat(\"stop\", 1) -> " + repeat("stop", 1));
    }
    public static void testcase()
    {
        assert "mmmmmiiiiiccccceeeee".equals(repeat("mice", 5));
        assert "hhheeellllllooo".equals(repeat("hello", 3));
        assert "stop".equals(repeat("stop", 1));
    }
    public static String repeat(String str, int n)
    {
        String ret = "";
        for(int i = 0; i < str.length(); ++i)
            for(int j = 0; j < n; ++j)
                ret += str.charAt(i);
        return ret;
    }
}