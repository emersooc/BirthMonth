import java.util.Scanner;

public class BirthMonth
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in); //creates scanner object
        System.out.println("Enter your birth month by numbers 1-12: ");
        int userMonth = userInput.nextInt(); //reads user input

        if (userMonth >=1 && userMonth <=12) //tests if input is between 1 and 12
        {
            System.out.println("Your birth month is: " + userMonth);
        }
        else
        {
            System.out.println("You entered an incorrect month value: " + userMonth);
        }
    }
}