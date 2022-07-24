import java.util.ArrayList;
import java.util.Scanner;

public class AvoidFixedPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int opCount = 0;
            ArrayList<Integer> arrl = new ArrayList<>();
            boolean needModification  = false;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i] == i+1){
                    needModification = true;
                }
            }

            if (needModification) {
                int point = 1;
                for (int i = 0; i < n; i++) {
                    if (arr[i] == point) {
                        if (point == 7) {
                            arrl.add(9);
                        }else{
                            arrl.add(7);
                        }
                        opCount++;
                        point++;
                    }
                    arrl.add(arr[i]);
                    point++;
                }
            }
            
            // for (Integer integer : arrl) {
            //     System.out.print(integer+" ");
            // }System.out.println();

            System.out.println(opCount);

        }
        sc.close();
    }
}
