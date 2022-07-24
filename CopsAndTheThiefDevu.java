import java.util.Arrays;
import java.util.Scanner;

public class CopsAndTheThiefDevu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int totalHouse = 100;
            int houseCovered = x * y;
            int house[] = new int[m];
            int arr[][] = new int[m+1][2];
            arr[0][0] = 0;
            arr[0][1] = 0;

            for (int j = 0; j < house.length; j++) {
                house[j] = sc.nextInt();
            }
            Arrays.sort(house);   //This code work for sorted array m house

            for (int j = 0; j < house.length; j++) {
                int start = house[j] - houseCovered -1;
                int end   = house[j] + houseCovered;
                arr[j+1][0] = start;
                arr[j+1][1] = end;
                if (start < 0) {
                    start = 0;
                }
                if (end > 100) {
                    end = 100;
                }
                if (arr[j][1] > start) {
                    start = arr[j][1];
                }

                if (start <= end) {
                    totalHouse -= end - start;                    
                }
                System.out.println(start+" "+end+" "+totalHouse);
                if (totalHouse < 0) {
                    totalHouse = 0;
                    break;                    
                }
            }

            System.out.println(totalHouse);

        }
        sc.close();

    }
}
