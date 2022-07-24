import java.util.ArrayList;
import java.util.Scanner;

public class AujasvitAndTheCircleGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int m = sc.nextInt() -1;
            int x = sc.nextInt();
            int l = 0;
            //int remove = m-1;
            ArrayList<Integer> a = new ArrayList<>();
            //int w[] = new int[x];

            while (m >= x) {
                m -= x;
            }


            for (int j = 1; j <= x; j++) {
                a.add(j);
                l++;
                System.out.print(""+circleGame(a, l, x, m) + " ");
                //w[j-1] = circleGame(a, l, x, m);
            }
            System.out.println();

            

            /*
            for (int j : w) {
                System.out.print(j+" ");
            }System.out.println();

            */
            




            /*
            else{
                for (int j = 1; j <= x; j++) {

                    if (j == 1) {
                        System.out.print(1 + " ");
                    }
                    else if(j > m){
                        if (m%2 == 0) {
                            System.out.print(2 + " ");
                        }
                        else{
                            System.out.print(m-1 + " ");
                        }
                    }
                    else{
                        if (m%2 == 0) {
                            System.out.print(2 + " ");
                        }
                        else{
                            // odd
                        }
                    }
                }
                System.out.println();
            }
            */

            
            
            
        }
        sc.close(); 
    }

    private static int circleGame(ArrayList<Integer> arr, int l, int x, int m) {
        //int w[] = new int[x];
        //int index = x-1;
        int temp = m;
        ArrayList<Integer> a = new ArrayList<>(arr);
        while (l != 1) {
            /*
            System.out.println();
            for (Integer integer : a) {
                System.out.print(integer + " ");
            }System.out.println("length : "+l);
            */
            m = temp;
            if(m < l){
                a.remove(m);
                l--;
            }
            else{
                while (m >= l) {
                    m -= l;
                }
                //System.out.println("removed : "+a.remove(m));
                a.remove(m);
                l--;
            }
            
        }
        return a.get(0);
    }
}
