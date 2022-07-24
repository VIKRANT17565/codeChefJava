import java.util.Scanner;

public class BitwiseSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            boolean canSortf = true;

            boolean canSortb = true;

            int c = 0;
            int tl = 100;
            System.out.println(c+" "+tl);
            for (int i = 0; i < n; i++) {
                // c++;
                // if (c == tl) {
                //     break;
                // }
                int pSmall = arr[i];
                int small = arr[i];
                int min = arr[i];
                int index = 0;
                for (int j = i+1; j < n; j++) {
                    if (small > arr[j] && (pSmall & arr[j]) != 0) {
                        small = arr[j];
                        index = j;
                    }
                    if (min > arr[j]) {
                        min = arr[j];
                    }
                }
                
                // System.out.println("pSmall : "+pSmall);
                // System.out.println("small : "+small);
                
        

                // if (!canSort) {
                //     break;
                // }
                
                if (arr[i] > small) {
                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                }

                if (min < small) {
                    if (small == pSmall) {
                        canSortf = false;
                        break;
                    }
                    i--;
                }
                // System.out.print("Array : ");
                // for (int k : arr) {
                //     System.out.print(k+" ");
                // }System.out.println();
            }

            // System.out.print("Array : ");
            // for (int k : arr) {
            //     System.out.print(k+" ");
            // }System.out.println();

            c = 0;
            for (int i = n-1; i > -1; i--) {
                // c++;
                // if (c == tl) {
                //     break;
                // }
                int pSmall = arr[i];
                int small = arr[i];
                int min = arr[i];
                int index = 0;
                for (int j = i-1; j > -1; j--) {
                    if (small < arr[j] && (pSmall & arr[j]) != 0) {
                        small = arr[j];
                        index = j;
                    }
                    if (min < arr[j]) {
                        min = arr[j];
                    }
                }
                
                // System.out.println("pLarge : "+pSmall);
                // System.out.println("large : "+small);
                
        

                // if (!canSort) {
                //     break;
                // }
                
                if (arr[i] < small) {
                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                }

                if (min > small) {
                    if (small == pSmall) {
                        canSortb = false;
                        break;
                    }
                    i++;
                }
                // System.out.print("Array : ");
                // for (int k : arr) {
                //     System.out.print(k+" ");
                // }System.out.println();
            }

            // System.out.print("Array : ");
            // for (int k : arr) {
            //     System.out.print(k+" ");
            // }System.out.println();

            if (canSortf || canSortb) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
        sc.close();
    }
}
