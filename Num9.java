public class Num9 
{

    public static void main(String[] args)
    {
        System.out.println("isPrefix(\"automation\", \"auto-\") -> " + isPrefix("automation", "auto-"));
        System.out.println("isSuffix(\"arachnophobia\", \"-phobia\") -> " + isSuffix("arachnophobia", "-phobia"));
        System.out.println("isPrefix(\"retrospect\", \"sub-\") -> " + isPrefix("retrospect", "sub-"));
        System.out.println("isSuffix(\"vocation\", \"-logy\") -> " + isSuffix("vocation", "-logy"));
    }
    public static boolean isSuffix(String str, String suffix)
    {
        for(int i = suffix.length() - 2, j = str.length() - 1; i >= 0; --i, --j)
        {
            if(str.charAt(j) == suffix.charAt(i))
                return false;
        }
        return true;
    }
    public static boolean isPrefix(String str, String prefix)
    {
        for(int i = 1; i < prefix.length() - 1; ++i)
        {
            if(str.charAt(i) != prefix.charAt(i))
                return false;
        }
        return true;
    }
}
