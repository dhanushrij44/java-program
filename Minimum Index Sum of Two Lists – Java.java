
import java.util.*;

class Main {
    public static void main(String[] args) {
        String[] a = {"Shogun", "KFC", "Burger King"};
        String[] b = {"KFC", "Shogun"};

        int min = 999;
        String ans = "";

        for(int i=0; i<a.length; i++)
            for(int j=0; j<b.length; j++)
                if(a[i].equals(b[j]) && i+j<min) {
                    min = i+j;
                    ans = a[i];
                }

        System.out.println(ans);
    }
}
