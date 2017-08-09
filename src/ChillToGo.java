import java.util.Scanner;
public class ChillToGo
{
    public static void main(String[] args)
    {
        double ADULTPRICE = 7;
        double CHILDPRICE = 4;
        int numAdult;
        int numChild;
        double adultSales;
        double chileSales;
        double totalSales;

        Scanner inputAdult = new Scanner(System.in);
        System.out.print("Please enter the number of adult meals >> ");
        numAdult = inputAdult.nextInt();

        Scanner inputChild = new Scanner(System.in);
        System.out.print("Please enter the number of children meals >> ");
        numChild = inputChild.nextInt();

        adultSales = numAdult * ADULTPRICE;
        chileSales = numChild * CHILDPRICE;
        totalSales = adultSales + chileSales;

        System.out.printf("" + numAdult + "" + numChild + "%.2f", totalSales + ".");
    }
}
