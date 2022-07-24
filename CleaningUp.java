import java.util.ArrayList;
import java.util.Scanner;

public class CleaningUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            ArrayList<Integer> a  = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                a.add(sc.nextInt());
            }

            ArrayList<Integer> chef  = new ArrayList<>();
            ArrayList<Integer> assit = new ArrayList<>();

            for (int j = 1; j < n+1; j++) {
                if (!a.contains(j)) {
                    chef.add(j);
                }
            }

            for (int j = 1; j <= (n-m)/2; j++) {
                assit.add(chef.get(j));
                chef.remove(chef.get(j));
            }

            for (Integer integer : chef) {
                System.out.print(integer+" ");
            }System.out.println();

            for (Integer integer : assit) {
                System.out.print(integer+" ");
            }System.out.println();
        }
        sc.close();
    }
}
