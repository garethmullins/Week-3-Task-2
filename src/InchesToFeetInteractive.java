import java.util.Scanner;
public class InchesToFeetInteractive
{
    public static void main(String[] args)
    {
        int INCHESPERFEET = 12;
        int inches;
        double feet;
        int feetRoundedDown;
        int remainingInches;

        Scanner inputInches = new Scanner(System.in);
        System.out.print("Please enter the number of Inches >> ");
        inches = inputInches.nextInt();

        feet = inches / INCHESPERFEET;
        feetRoundedDown = (int) feet;
        remainingInches = (int) ((feet - feetRoundedDown) * INCHESPERFEET);

        System.out.println("\nFor "+ inches +" Inches,\n" + feetRoundedDown + " Feet and " + remainingInches + " Inches are needed");
    }
}
