import java.util.Scanner;

public class GCD {
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
                System.out.println("GCD of " + m + " and " + n + " is " + gcd(m,n));
            }
        }

    }
    public static int gcd(int m, int n){
        int retVal;
        if(m < n){
            retVal = gcd(n,m);
        }
        else if (m % n == 0){
            retVal = n;
        } else{
            retVal = gcd(n, m%n);
        }
        return retVal;

    }
}
