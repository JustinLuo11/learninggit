public class ReverseInteger {
    public static int reverseInteger(int x){
        int rev = 0;
        while(x != 0){
            int pop = x%10;
            x /= 10;
            if(rev > Integer.MAX_VALUE/10 || rev == Integer.MAX_VALUE && pop > 7)
                return 0;
            if(rev < Integer.MIN_VALUE/10 || rev == Integer.MIN_VALUE && pop < -8)
                return 0;
            rev = 10 * rev + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        int m = reverseInteger(-2);
        System.out.println(m);
    }
}
