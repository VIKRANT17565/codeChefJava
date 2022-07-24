import java.util.Scanner;

public class AgainXORProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            String arr[] = new String[n-(k-1)];
            for (int j = 0; j < n-(k-1); j++) {
                arr[j] = s.substring(j, k+j);
            }

            int c = k;
            //String res = "";
            int binValue = 0;
            int counter = 0;
            while (c != 0) {
                for (int j = 0; j < n-(k-1); j++) {
                    //System.out.println("j : " +j);
                    if (arr[j].charAt(c-1) == '1') {
                        counter++;
                    }
                }
                if (counter%2 != 0) {
                    binValue++;
                }
                counter = 0;
                c--;
            }

            System.out.println(binValue);
        }
        sc.close();
    }
}
