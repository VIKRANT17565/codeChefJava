import java.util.ArrayList;
import java.util.Scanner;

public class CoinsAndTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int last = 1;
        ArrayList<Integer> dp = new ArrayList<Integer>();
        dp.add(0);
		for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            //int index = 0;

            if (dp.size() > n) {
                System.out.println("in if");
                for (Integer integer : dp) {
                    if (n == integer) {
                        System.out.println(dp.indexOf(integer));
                        break;
                    }
                    else if(n < integer){
                        System.out.println(dp.indexOf(integer)-1);
                        break;
                    }
                }
            }
            else{

                System.out.println("in else");
                boolean f = true;
                int j = last;
                while (f) {
                    dp.add(j, dp.get(j-1)+j);
                    if (dp.get(j) >= n) {
                        f = false;
                    }
                    j++;
                }
                last = j;
                for (Integer integer : dp) {
                    if (n == integer) {
                        System.out.println(dp.indexOf(integer));
                        break;
                    }
                    else if(n < integer){
                        System.out.println(dp.indexOf(integer)-1);
                        break;
                    }
                }
            }

            

            /*
            if (dp.get(n) != null) {
                for (Integer integer : dp) {
                    if (n == integer) {
                        System.out.println(dp.indexOf(integer));
                        break;
                    }
                    else if(n < integer){
                        System.out.println(dp.indexOf(integer)-1);
                    }
                }
                
            }
            else{

                boolean f = true;
                int j = last;
                while (f) {
                    dp.add(j, dp.get(j-1)+j);
                    if (dp.get(j) >= n) {
                        f = false;
                    }
                }
                for (Integer integer : dp) {
                    if (n == integer) {
                        System.out.println(dp.indexOf(integer));
                        break;
                    }
                    else if(n < integer){
                        System.out.println(dp.indexOf(integer)-1);
                    }
                }
                
                last = n;
            }
            */



            /*
            int triangle[] = new int[(int)n+1];
            triangle[0] = 0;
            for (int j = 1; j < triangle.length; j++) {
                triangle[j] += triangle[j-1]+j;
                if (triangle[j] > n) {
                    break;
                }
            }

            
            System.out.print("Triangle : ");
            for (int j : triangle) {
                System.out.print(j+" ");
            }
            System.out.println();
            
            

            for (int j = 1; j < triangle.length; j++) {
                if (n == triangle[j]) {
                    index = j;
                    break;
                }
                else if (n < triangle[j]) {
                    index = j-1;
                    break;
                }
            }
            System.out.println(index);
            */
        
            

        }
        sc.close();
    }
}
