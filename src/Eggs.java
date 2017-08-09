import java.util.Scanner;
public class Eggs
{
    public static void main(String[] args)
    {
        double COSTOFINDIVIDUALEGG = 0.45;
        double COSTOFDOZENEGGS = 3.25;
        int numEggs;
        int numIndividualEggs;
        float numDozenEggs;
        int numDozenEggsRoundedDown;
        double costIndividualEggs;
        double costDozenEggs;
        double costTotal;

        Scanner inputEggs = new Scanner(System.in);
        System.out.print("Please enter the number of eggs >> ");
        numEggs = inputEggs.nextInt();

        numDozenEggs = numEggs/12f;
        numDozenEggsRoundedDown = (int) numDozenEggs;
        numIndividualEggs = (numEggs - (numDozenEggsRoundedDown * 12));
        costIndividualEggs = numIndividualEggs * COSTOFINDIVIDUALEGG;
        costDozenEggs = numDozenEggsRoundedDown * COSTOFDOZENEGGS;
        costTotal = costIndividualEggs + costDozenEggs;

        System.out.println("\nYou ordered " + numEggs + " eggs. that's " + numDozenEggsRoundedDown + " dozen at $" + COSTOFDOZENEGGS + " per dozen and " + numIndividualEggs + " loose eggs at $" + COSTOFINDIVIDUALEGG + " each for a total of $" + costTotal + ".");
    }
}
