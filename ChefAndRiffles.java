import java.util.Scanner;

//TLE Error
public class ChefAndRiffles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            long n = sc.nextInt();
            long k = sc.nextInt();

            long arr[] = new long[(int)n];

            long ar1[] = new long[(int)n/2];
            long ar2[] = new long[(int)n/2];

            for (int j = 0; j < arr.length; j++) {
                arr[j] = j+1;
            }
            
            while(true){
                if(k <= n-2){
                    break;
                }
                k = k - (n-2);
                if (k == k-(n-2)) {
                    break;
                }
            }
            

            System.out.println("k : "+k);

            int stop = 0;
            while (stop != k) {
                int j = 0;
                for (int l = 0; l < n; l += 2) {
                    ar1[j] = arr[l];
                    j++;
                }
                j = 0;
                for (int l = 1; l < n; l += 2) {
                    ar2[j] = arr[l];
                    j++;
                }
                

                //mearging ar1 and ar2 in arr
                System.arraycopy(ar1, 0, arr, 0, ar1.length);
                System.arraycopy(ar2, 0, arr, ar1.length, ar2.length);

                stop++;
            }

            //System.out.println(Arrays.toString(arr));

            for (long l : arr) {
                System.out.print(l+" ");
            }
            System.out.println();


        }
        sc.close();
    }
}
