import java.util.Scanner;

public class CuttingRecipes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            //int sol[] = new int[n];
            int max = 0;

            for (int j = 0; j < n; j++) {
                arr[j] =  sc.nextInt();
                if (max < arr[j]) {
                    max = arr[j];
                }
            }

            //boolean div = true;
            boolean f = true;
            while(f){
                int count = 0;
                for (int k = 0; k < arr.length; k++) {
                    if (arr[k]%max == 0) {
                        count++;
                    }
                    else{
                        count = 0;
                    }
                }
                if (count == n) {
                    for (int j = 0; j < arr.length; j++) {
                        arr[j] = arr[j]/max;
                    }                    
                }


                if(max == 1){
                    f = false;
                }
                max--;
            }
            
            for (int j : arr) {
                System.out.print(j+" ");
            }System.out.println();
            
        }
        sc.close();
    }
}
