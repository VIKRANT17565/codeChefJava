import java.util.Scanner;

public class MaximumFactorsProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //test case
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){

            //input n
            int n = sc.nextInt();
            int k = 2;
            int index = 0;
            int index2 = 0;
            int maxDivisor = 0;
            int m = 0;
            //int arr[] = new int[n];
            double root = Math.sqrt(Math.sqrt(Math.sqrt(Math.sqrt((double)n))));
            System.out.println("root = "+(root+2));
            while (k <=  root+2) {
                int count = 0;
                if (n%k == 0) {
                    m = n/k;

                    while (n % 2 == 0){
                        count += 1;
                        n = n / 2;
                    }

                    for (int j = 1; j <= m; j += 2) {
                        if (m%j == 0) {
                            count++;
                        }

                    }
                    if (count > maxDivisor){
                        maxDivisor = count;
                        index = index2;
                    }
                    //arr[index2] = count;                  
                }
                k++;
                index2++;     
            }
            

            System.out.println(index+2);
            

        }
        sc.close();
    }
}
