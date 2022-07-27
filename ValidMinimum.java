import java.util.ArrayList;
import java.util.Scanner;

public class ValidMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int minAB = sc.nextInt();
            int minBC = sc.nextInt();
            int minCA = sc.nextInt();

            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> c = new ArrayList<>();


            a.add(minAB);
            a.add(minCA);

            b.add(minAB);
            b.add(minBC);

            c.add(minBC);
            c.add(minCA);

            boolean ansFound = false;

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    for (int k = 0; k < 2; k++) {
                        if(isSatisfies(minAB, minBC, minCA, a.get(i), b.get(j), c.get(k))){
                            ansFound = true;
                            break;
                        }
                    }
                    if (ansFound) {
                        break;
                    }
                }
                if (ansFound) {
                    break;
                }
                
            }

            if (ansFound) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }

    private static boolean isSatisfies(int minAB, int minBC, int minCA, int i, int j, int k) {

        int minij = (i<j) ? i : j;
        int minjk = (j<k) ? j : k;
        int minki = (k<i) ? k : i;

        if (minAB == minij) {
            if (minBC == minjk) {
                if (minCA == minki) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
