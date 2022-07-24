import java.util.Scanner;

public class AntipodalPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            long points[][] = new long[n][2];
            for (int i = 0; i < n; i++) {
                points[i][0] = sc.nextLong();
                points[i][1] = sc.nextLong();
            }

            long count = 0;
            for (int i = 0; i < n-2; i++) {
                for (int j = i+1; j < n-1; j++) {
                    for (int k = j+1; k < n; k++) {
                        System.out.println((i+1)+" "+(j+1)+" "+(k+1));
                        if ((NonCollinear(points[i], points[j], points[k])) && antipolde(points[i], points[j], points[k])) {
                            count++;
                        }
                    }
                }
            }

            System.out.println(count);

        }
        sc.close();
    }

    private static boolean antipolde(long[] p1, long[] p2, long[] p3) {

        double d1 = (((p1[1]-p2[1])*(p1[1]-p2[1]))+((p1[0]-p2[0])*(p1[0]-p2[0])));
        double d2 = (((p1[1]-p3[1])*(p1[1]-p3[1]))+((p1[0]-p3[0])*(p1[0]-p3[0])));
        double d3 = (((p3[1]-p2[1])*(p3[1]-p2[1]))+((p3[0]-p2[0])*(p3[0]-p2[0])));
        double d4 = 0;

        double m = Math.max(Math.max(d1, d2), d3);

        double midPoint[] = new double[2];
        if(m == d1){
            midPoint[0] = (p1[0]+p2[0])/2;
            midPoint[1] = (p1[1]+p2[1])/2;

            d4 = ((((p3[1]-midPoint[1])*(p3[1]-midPoint[1]))+((p3[0]-midPoint[0])*(p3[0]-midPoint[0]))));
        }
        else if(m == d2){
            midPoint[0] = (p1[0]+p3[0])/2;
            midPoint[1] = (p1[1]+p3[1])/2;

            d4 = ((((midPoint[1]-p2[1])*(midPoint[1]-p2[1]))+((midPoint[0]-p2[0])*(midPoint[0]-p2[0]))));
        }
        else{
            midPoint[0] = (p3[0]+p2[0])/2;
            midPoint[1] = (p3[1]+p2[1])/2;

            d4 = ((((p1[1]-midPoint[1])*(p1[1]-midPoint[1]))+((p1[0]-midPoint[0])*(p1[0]-midPoint[0]))));
        }

        if (d4 == m/4) {
            return true;
        }

        return false;
    }

    private static boolean NonCollinear(long[] p1, long[] p2, long[] p3) {
        
        if ((p3[1]-p2[1])*(p3[0]-p1[0]) != (p3[1]-p1[1])*(p3[0]-p2[0])) {
            // System.out.println("NonCollinear");
            return true;
        }

        return false;
    }
}
