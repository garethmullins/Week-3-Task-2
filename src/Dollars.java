import java.util.Scanner;
public class Dollars
{
    public static void main(String[] args)
    {
        double totalDollars;
        int twoDollars;
        int oneDollars;
        int fiftyCents;
        int twentyCents;
        int tenCents;
        int fiveCents;
        int oneCents;

        Scanner inputDollars = new Scanner(System.in);
        System.out.print("Please enter the ammount >> $");
        totalDollars = inputDollars.nextDouble();

        twoDollars  = (int)          ((float)  (totalDollars/2));
        oneDollars  = (int)          ((float)  (totalDollars - twoDollars * 2));
        fiftyCents  = (int)          ((float) ((totalDollars - twoDollars * 2 - oneDollars) / 0.50));
        twentyCents = (int)          ((float) ((totalDollars - twoDollars * 2 - oneDollars - fiftyCents * 0.50) / 0.20));
        tenCents    = (int)          ((float) ((totalDollars - twoDollars * 2 - oneDollars - fiftyCents * 0.50 - twentyCents * 0.20) / 0.10));
        fiveCents   = (int)          ((float) ((totalDollars - twoDollars * 2 - oneDollars - fiftyCents * 0.50 - twentyCents * 0.20 - tenCents * 0.10) / 0.05));
        oneCents    = (int)          ((float) ((totalDollars - twoDollars * 2 - oneDollars - fiftyCents * 0.50 - twentyCents * 0.20 - tenCents * 0.10 - fiveCents * 0.05) / 0.01));

        System.out.println("\b$" + totalDollars + " can be divided into:");

        System.out.println("\t$ 2s:\t" + twoDollars);
        System.out.println("\t$ 1s:\t" + oneDollars);
        System.out.println("\t 50s:\t" + fiftyCents);
        System.out.println("\t 20s:\t" + twentyCents);
        System.out.println("\t 10s:\t" + tenCents);
        System.out.println("\t  5s:\t" + fiveCents);
        System.out.println("\t  1s:\t" + oneCents);
    }
}
