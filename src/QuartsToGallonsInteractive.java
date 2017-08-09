import java.util.Scanner;
public class QuartsToGallonsInteractive
{
    public static void main(String[] args)
    {
        float QUARTSPERGALLON = 4;
        int quarts;
        double gallons;
        int gallonsRoundedDown;
        int remainingQuarts;

        Scanner inputQuarts = new Scanner(System.in);
        System.out.print("Please enter the number of Quarts needed >> ");
        quarts = inputQuarts.nextInt();

        gallons = quarts / QUARTSPERGALLON;
        gallonsRoundedDown = (int) gallons;
        remainingQuarts = (int) ((gallons - gallonsRoundedDown) * QUARTSPERGALLON);
        System.out.println("\nFor "+ quarts +" Quarts,\n" + gallonsRoundedDown + " Gallons and " + remainingQuarts + " Quarts are needed");
    }
}