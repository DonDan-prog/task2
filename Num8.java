public class Num8 
{
    public static void main(String[] args)
    {
        System.out.println("isStrangePair(\"ratio\", \"orator\") -> " + isStrangePair("ratio", "orator"));
        System.out.println("isStrangePair(\"sparkling\", \"groups\") -> " + isStrangePair("sparkling", "groups"));
        System.out.println("isStrangePair(\"bush\", \"hubris\") -> " + isStrangePair("bush", "hubris"));
        System.out.println("isStrangePair(\"\", \"\") -> " + isStrangePair("", ""));
    }
    public static boolean isStrangePair(String str1, String str2)
    {
        if(str1.length() == 0 && str2.length() == 0) // if two str's are empty
            return true;
        else if(str1.length() == 0 && str2.length() != 0 || str1.length() != 0 && str2.length() == 0) // if either first or second str empty when other - not
            return false;

        boolean a = str1.charAt(0) == str2.charAt(str2.length() - 1);   // first sentence
        boolean b = str1.charAt(str1.length() - 1) == str2.charAt(0);   // second sentence
        return a && b;  // first AND second
    }
}
