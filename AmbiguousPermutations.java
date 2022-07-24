import java.util.Scanner;

public class AmbiguousPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isAmbiguousPermutation = true;
        
        while(n != 0){
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int inversePermutation[] = new int[n];
            for (int i = 0; i < n; i++) {
                inversePermutation[arr[i]-1] = i+1;
                if (inversePermutation[arr[i]-1] != arr[arr[i]-1]) {
                    isAmbiguousPermutation = false;   
                    break;                 
                }
            }
            if (isAmbiguousPermutation) {
                System.out.println("ambiguous");
            }
            else{
                System.out.println("not ambiguous");
            }

            /*
            System.out.print("arr o : ");
            for (int i : arr) {
                System.out.print(i);
            }System.out.println();

            System.out.print("arr i : ");
            for (int i : inversePermutation) {
                System.out.print(i);
            }System.out.println();
            */

            n = sc.nextInt();
            isAmbiguousPermutation = true;

        }

        sc.close();
    }
}
