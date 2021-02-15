public class Num5 
{
    public static void main(String[] args)
    {
        System.out.println("getDecimalPlaces(\"43.20\") -> " + getDecimalPlaces("43.20"));
        System.out.println("getDecimalPlaces(\"400\") -> " + getDecimalPlaces("400"));
        System.out.println("getDecimalPlaces(\"3.1\") -> " + getDecimalPlaces("3.1"));
    }
    public static int getDecimalPlaces(String str)
    {
        int find_dot = str.indexOf('.');
        if(find_dot == -1)
            return 0;
        return str.length() - 1 - find_dot;
    }
}
