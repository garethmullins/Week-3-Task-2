public class NauticalMiles
{
    public static void main(String[] args)
    {
        double KILOMETERSPERNUATICALMILE = 1.852;
        double MILESPERNUATICALMILE = 1.150779;
        double NAUTICALMILES = 23;
        double kilometers;
        double miles;

        kilometers = NAUTICALMILES * KILOMETERSPERNUATICALMILE;
        miles = NAUTICALMILES * MILESPERNUATICALMILE;

        System.out.println(NAUTICALMILES + " Nautical miles is equivalent to " + kilometers + " Kilometers or " + miles + " Miles.");
    }
}
