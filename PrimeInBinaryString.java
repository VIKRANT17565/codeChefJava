import java.util.Scanner;

public class PrimeInBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
		for (int i = 0; i < t; i++){
            String s = sc.nextLine();
            //String subString = "";
            int arr[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
            int n = 0;

            for (int j = 0; j < arr.length; j++) {
                if (s.contains(Integer.toBinaryString(arr[j]))) {
                    System.out.println("Yes");
                    n = 1;
                    break;
                }
            }
            if (n != 1) {
                System.out.println("No");
            }
            

            /*
            for (int j = 0; j < s.length(); j++) {
                for (int k = j+1; k < s.length()+1; k++) {
                    subString = s.substring(j, k);
                    n = Integer.parseInt(subString, 2);
                    if (isPrime(n)) {
                        break;                        
                    }
                }
                if (isPrime(n)) {
                    break;
                }
            }
                      

            if (isPrime(n)) {
                System.out.println("Yes");                
            }
            else{
                System.out.println("No");
            }
            */
        }        
        sc.close();
    }

    public static boolean isPrime(int n){
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
