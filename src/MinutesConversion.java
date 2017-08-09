import java.util.Scanner;
public class MinutesConversion
{
    public static void main(String[] args)
    {
        int MINUTESPERHOUR = 60;
        int MINUTESPERDAY = 1440;
        int minutes;
        float hours;
        float days;

        Scanner inputMinutes = new Scanner(System.in);
        System.out.print("Please enter the number of minutes >> ");
        minutes = inputMinutes.nextInt();

        hours = (float) minutes / MINUTESPERHOUR;
        days = (float) minutes / MINUTESPERDAY;

        System.out.println(minutes + " minutes is equivalent to " + hours + " hours or " + days + " days.");
    }
}
