package Lab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise7 {
    List<Integer> lists=new ArrayList<>();
    public List<Integer> getSorted(int a[])
    {
        int reverse[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            int rev=0;
            while(a[i]>0)
            {
                int rem=a[i]%10;
                rev=rev*10+rem;
                a[i]=a[i]/10;
            }
            reverse[i]=rev;
        }
        //List<Integer>lists= new ArrayList<>();
        for (int i = 0; i < a.length; i++)
            lists.add(new Integer(reverse[i]));
        Collections.sort(lists);
        return lists;
    }
}
class Reverse {
    public static void main(String args[]) {
        Exercise7 r=new Exercise7();
        int k[]={25,63,56,98};
        List<Integer>li=r.getSorted(k);
        for(Integer lis:li)
        {
            System.out.println(lis);
        }
    }
}