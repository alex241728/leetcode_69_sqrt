public class Sqrt
{
    public int mySqrt(int x)
    {
        // square root of 0 is 0
        if (x == 0 || x == 1)
        {
            return x;
        }

        // bisection method
        int left = 1;
        int right = x;
        int result = 0;
        while (left <= right)
        {
            int mid = (left + right) / 2;
            if (mid > x/mid)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
                result = mid;
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        Sqrt s = new Sqrt();

        /*
            Input: x = 4
            Output: 2
            Explanation: The square root of 4 is 2, so we return 2.
         */
        System.out.println(s.mySqrt(4));

        /*
            Input: x = 8
            Output: 2
            Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is
            returned.
         */
        System.out.println(s.mySqrt(8));

        /*
            Input: x = 2147395600
            Output: 46340
         */
        System.out.println(s.mySqrt(2147395600));
    }
}
