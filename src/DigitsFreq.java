import java.util.*;
public class DigitsFreq {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int no =scn.nextInt();

        int count = 0;
        while(n!=0) {
            int d = n % 10;
            if (d == no) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("freq of "+no+" is "+count);
    }
}
