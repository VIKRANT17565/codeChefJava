import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int salary = sc.nextInt();
            double grossSalary, har = 0, da = 0;
            if (salary < 1500) {
                har = 0.1*salary;
                da  = 0.9*salary;
                
            }
            else{
                har = 500;
                da = 0.98*salary;
            }

            grossSalary = salary+har+da;
            System.out.println(String.format("%.2f", grossSalary));
        }
        sc.close();
    }
}
