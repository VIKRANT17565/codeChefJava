import java.util.ArrayList;
import java.util.Scanner;

public class EvenSubsetXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
    
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();

            arr.add(0);
            int j = 0;
            int val = 1+j-j;
            while (arr.size() != n+1) {
                int a = val;
                if (Integer.bitCount(a)%2 == 0) {
                    arr.add(a);
                }
                j++;
                val++;
            }

            arr.remove(0);

            for (Integer integer : arr) {
                System.out.print(integer+" ");
            }System.out.println();

        }
        sc.close();
    }
}
