import java.util.Scanner;

public class ADITYASNEWVENTURE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int noOfCups = 0;
            while (n != 0) {
                if (n >= 5) {
                    n -= 5;
                    noOfCups++;
                }
                else if (n >= 3) {
                    n -= 3;
                    noOfCups++;
                }
                else{
                    n -= 1;
                    noOfCups++;
                }
            }

            System.out.println(noOfCups);
        }
        sc.close();
    }
}
