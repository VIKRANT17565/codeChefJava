import java.util.Scanner;

public class ClosingTheTweets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];
        sc.nextLine();
        for (int i = 0; i < k; i++) {
            String s = sc.nextLine();

            int openCount = 0;
            if (s.charAt(6) == 'L') {
                for (int j = 0; j < n; j++) {
                    if (arr[j] == 1) {
                        arr[j] = 0;
                    }
                }
            }
            else{
                int x = Integer.parseInt(s.substring(6));
                if (arr[x-1] == 0) {
                    arr[x-1] = 1;
                }
                else if(arr[x-1] == 1){
                    arr[x-1] = 0;
                }
            }
            

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 1) {
                    openCount++;
                }
            }

            System.out.print("arr : ");
            for (int j : arr) {
                System.out.print(j+" ");
            }
            System.out.println();

            System.out.println(openCount);
        }

        sc.close();
    }
}
