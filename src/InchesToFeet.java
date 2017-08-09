public class InchesToFeet
{
    public static void main(String[] args)
    {
        float INCHESTOFEET = 12;
        int INCHES = 26;
        double feet;
        int feetRoundedDown;
        int remainingInches;

        feet = INCHES / INCHESTOFEET;
        feetRoundedDown = (int) feet;
        remainingInches = (int) ((feet - feetRoundedDown) * INCHESTOFEET);

        System.out.println("\nFor "+ INCHES +" Inches,\n" + feetRoundedDown + " Feet and " + remainingInches + " Inches are needed");
    }
}
