import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = in1.nextDouble();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        double N = in.nextDouble();


        if (Math.abs(x) >= 1 || N <= 0)
        {
            System.out.println("Impossible to count");
        }
        else
        {
            double res = 0;
            for (double n = 0; n < N; n++)
            {
                res += (Math.pow(-1, n + 1) * Math.pow(x, (2 * n + 1))) / (2 * n + 1);
            }

            res += Math.PI / 2;
            System.out.println("Result is: " + res);
        }
        
    }
}