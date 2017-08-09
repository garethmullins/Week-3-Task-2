public class QuartsToGallons
{
    public static void main(String[] args)
    {
        float QUARTSPERGALLON = 4;
        int QUARTS = 7;
        double gallons;
        int gallonsRoundedDown;
        int remainingQuarts;
        gallons = QUARTS / QUARTSPERGALLON;
        gallonsRoundedDown = (int) gallons;
        remainingQuarts = (int) ((gallons - gallonsRoundedDown) * QUARTSPERGALLON);
        System.out.println("\nFor "+ QUARTS +" Quarts,\n" + gallonsRoundedDown + " Gallons and " + remainingQuarts + " Quarts are needed");
    }
}
