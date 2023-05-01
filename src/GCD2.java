import java.util.Scanner;

public class GCD2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n;
        boolean keepAsking = true;
        while (keepAsking){
            System.out.println("Enter two numbers (negative to exit) :");
            m = input.nextInt();
            n = input.nextInt();
            if(m<0 || n<0){
                keepAsking = false;
            }else{
                System.out.println("GCD of " + m + " and " + n + " is " + gcd2(m,n));
            }
        }

    }
    public static int gcd2(int m, int n){
        if(m<n){
            int tmp = n;
            n = m;
            m = tmp;
        }
        int temp = 0;
        while(n!=0){
            temp = n;
            n = m%n;
            m = temp;
        }

        return m;
    }
}
