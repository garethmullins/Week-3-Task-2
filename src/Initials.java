import java.util.Scanner;
public class Initials
{
    public static void main(String[] args)
    {
        char firstInitial;
        char secondInitial;
        char thirdInitial;
        String initials;


        Scanner firstInput = new Scanner(System.in);
        System.out.print("Please enter the first initial >> ");
        firstInitial = firstInput.next().charAt(0);

        Scanner secondInput = new Scanner(System.in);
        System.out.print("Please enter the second initial >> ");
        secondInitial = secondInput.next().charAt(0);

        Scanner thirdInput = new Scanner(System.in);
        System.out.print("Please enter the third initial >> ");
        thirdInitial = thirdInput.next().charAt(0);

        initials = (firstInitial + "." + secondInitial + "." + thirdInitial + ".");

        System.out.println("The initials are " + initials);
    }
}
