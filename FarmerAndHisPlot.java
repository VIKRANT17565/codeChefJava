import java.util.Scanner;

public class FarmerAndHisPlot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();           //length
            int m = sc.nextInt();           //breadth
            int totalArea = n*m;
            int hcf = hcf(n, m);
            int areaOfSubPlot = hcf*hcf;
            System.out.println(totalArea/areaOfSubPlot);
        }
        sc.close();
    }

    private static int hcf(int n, int m) {
        int max = (n < m)? n : m;
        while (max != 0) {
            if (n%max == 0 && m%max == 0) {
                return max;
            }
            max--;
        }
        return -1;
    }
}
