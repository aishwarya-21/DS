import java.util.*;
public class FindEle {
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<arr.length;i++)
        {
            arr[i] = scn.nextInt();

        }
        int no = scn.nextInt();

        int idx = -1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==no)
            {
                idx=i;
                break;

            }
        }
        System.out.print(idx);
    }
}
