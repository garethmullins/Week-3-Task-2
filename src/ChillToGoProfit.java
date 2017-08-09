import java.util.Scanner;
public class ChillToGoProfit
{
    public static void main(String[] args)
    {
        double ADULTPRICE = 7.00;
        double CHILDPRICE = 4.00;
        double ADULTCOST = 4.35;
        double CHILDCOST = 3.10;
        int numAdult;
        int numChild;
        double adultSales;
        double chileSales;
        double totalSales;
        double adultCost;
        double childCost;
        double totalCost;
        double adultProfit;
        double childProfit;
        double totalProfit;

        Scanner inputAdult = new Scanner(System.in);
        System.out.print("Please enter the number of adult meals >> ");
        numAdult = inputAdult.nextInt();

        Scanner inputChild = new Scanner(System.in);
        System.out.print("Please enter the number of children meals >> ");
        numChild = inputChild.nextInt();

        adultSales = numAdult * ADULTPRICE;
        chileSales = numChild * CHILDPRICE;
        totalSales = adultSales + chileSales;

        adultCost = numAdult * ADULTCOST;
        childCost = numChild * CHILDCOST;
        totalCost = adultCost + childCost;

        adultProfit = adultSales - adultCost;
        childProfit = chileSales - childCost;
        totalProfit = totalSales - totalCost;

        System.out.printf("%.2f", adultProfit);
        System.out.printf("%.2f", childProfit);
        System.out.printf("%.2f", totalProfit);
    }
}
