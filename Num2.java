public class Num2 
{
    public static void main(String[] args)
    {
        int[] first_test = { 10, 4, 1, 4, -10, -50, 32, 21 };
        int[] second_test = { 44, 32, 86, 19 };

        System.out.println("differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) -> " + differenceMaxMin(first_test));
        System.out.println("differenceMaxMin([44, 32, 86, 19]) -> " + differenceMaxMin(second_test));
    }
    public static void testcase()
    {
        int[] first_test = { 10, 4, 1, 4, -10, -50, 32, 21 };
        int[] second_test = { 44, 32, 86, 19 };

        assert differenceMaxMin(first_test) == 82;
        assert differenceMaxMin(second_test) == 67;
    }
    public static int differenceMaxMin(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i : arr)
        {
            if(i < min) min = i;
            if(i > max) max = i;
        }
        return max - min;
    }
}
