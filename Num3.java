public class Num3 
{
    public static void main(String[] args)
    {
        testcase();

        int[] test1 = { 1, 3 };
        int[] test2 = { 1, 2, 3, 4 };
        int[] test3 = { 1, 5, 6 };
        int[] test4 = { 1, 1, 1 };
        int[] test5 = { 9, 2, 2, 5 };

        System.out.println("isAvgWhole([1, 3]) -> " + isAvgWhole(test1));
        System.out.println("isAvgWhole([1, 2, 3, 4]) -> " + isAvgWhole(test2));
        System.out.println("isAvgWhole([1, 5, 6]) -> " + isAvgWhole(test3));
        System.out.println("isAvgWhole([1, 1, 1]) -> " + isAvgWhole(test4));
        System.out.println("isAvgWhole([9, 2, 2, 5]) -> " + isAvgWhole(test5));
    }
    public static void testcase()
    {
        int[] test1 = { 1, 3 };
        int[] test2 = { 1, 2, 3, 4 };
        int[] test3 = { 1, 5, 6 };
        int[] test4 = { 1, 1, 1 };
        int[] test5 = { 9, 2, 2, 5 };

        assert isAvgWhole(test1) == true;
        assert isAvgWhole(test2) == false;
        assert isAvgWhole(test3) == true;
        assert isAvgWhole(test4) == true;
        assert isAvgWhole(test5) == false;
    }
    public static boolean isAvgWhole(int[] arr)
    {
        int sum = 0;
        for(int i : arr) sum += i;
        double avg = (double)sum / (double)arr.length;
        return Math.floor(avg) == avg;
    }
}
