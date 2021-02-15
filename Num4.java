import java.util.Arrays;

public class Num4 
{
    public static void main(String[] args)
    {
        int[] test1 = { 1, 2, 3 };
        int[] test2 = { 1, -2, 3 };
        int[] test3 = { 3, 3, -2, 408, 3, 3 };

        System.out.println("cumulativeSum([1, 2, 3]) -> " + Arrays.toString(cumulativeSum(test1)));
        System.out.println("cumulativeSum([1, -2, 3]) -> " + Arrays.toString(cumulativeSum(test2)));
        System.out.println("cumulativeSum([3, 3, -2, 408, 3, 3]) -> " + Arrays.toString(cumulativeSum(test3)));
    }
    public static int[] cumulativeSum(int[] arr)
    {
        int ret[] = new int[arr.length];
        for(int i = 0; i < arr.length; ++i)
        {
            int sum = 0;
            for(int j = 0; j <= i; ++j)
                sum += arr[j];
            ret[i] = sum;
        }
        return ret;
    }
}
