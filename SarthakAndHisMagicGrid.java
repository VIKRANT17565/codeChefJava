import java.util.Scanner;

public class SarthakAndHisMagicGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int grid[][] = new int[n][n];
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        grid[j][k] = 1;
                    }
                }

            /*
            }else{
                for (int j = 0; j < n; j++) {
                    int count = 1;
                    for (int k = j; k < n; k++) {
                        grid[j][k] = count;
                        count++;
                    }
                }
                for (int j = 0; j < n; j++) {
                    int count = n - j +1;
                    for (int k = 0; k < j; k++) {
                        grid[j][k] = count;
                        count++;
                    }
                }
            }
            */
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.print(grid[j][k] + " ");
                }System.out.println();
            }
            
        }
        sc.close(); 
    }
}
