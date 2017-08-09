import java.util.Scanner;
public class NauticalMilesInteractive
{
    public static void main(String[] args)
    {
        double KILOMETERSPERNUATICALMILE = 1.852;
        double MILESPERNUATICALMILE = 1.150779;
        double nauticalMiles;
        double kilometers;
        double miles;

        Scanner inputNauticalMiles = new Scanner(System.in);
        System.out.print("Please enter the number of nautical miles >> ");
        nauticalMiles = inputNauticalMiles.nextInt();

        kilometers = nauticalMiles * KILOMETERSPERNUATICALMILE;
        miles = nauticalMiles * MILESPERNUATICALMILE;

        System.out.println(nauticalMiles + " Nautical miles is equivalent to " + kilometers + " Kilometers or " + miles + " Miles.");
    }
}
