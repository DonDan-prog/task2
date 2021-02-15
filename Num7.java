public class Num7 
{
    public static void main(String[] args)
    {
        System.out.println("isValid(\"59001\") -> " + isValid("59001"));
        System.out.println("isValid(\"853a7\") -> " + isValid("853a7"));
        System.out.println("isValid(\"732 32\") -> " + isValid("732 32"));
        System.out.println("isValid(\"393939\") -> " + isValid("393939"));
    }
    public static boolean isValid(String str)
    {
        if(str.length() == 5)
        {
            for(int i = 0; i < str.length(); ++i)
            {
                if(!Character.isDigit(str.charAt(i)))
                    return false;
            }
            return true;
        }
        return false;
    }
}
