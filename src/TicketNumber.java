import java.util.Scanner;
public class TicketNumber
{
    public static void main(String[] args)
    {
        int DIVIDINGNUMBER = 7;
        int ticketNumber;
        int processedTicketNumber;
        int remainder;

        Scanner inputTicketNumber = new Scanner(System.in);
        System.out.print("Please enter the Ticket Number >> ");
        ticketNumber = inputTicketNumber.nextInt();

        processedTicketNumber = (ticketNumber /10);
        remainder = processedTicketNumber % DIVIDINGNUMBER;

        if(remainder == ticketNumber % 10)
        {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
