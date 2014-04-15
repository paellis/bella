import java.util.Scanner; //needed to get info from keyboard
/**
 * This application prints out the song "99 bottles of beer"
 * 
 * @author Trish 
 * @Lab 1
 */
class bottles2
{
    public static void main (String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        int total;//tells the no of bottles we want to start with

        System.out.println("Please enter the number of bottles you would like to start with"
            + "(from 1 to 99): ");
        total = keyboard.nextInt();

        if (total>0 && total <100)
            while (total>0) //loop to print as many verses as required
            {         
                printVerse(total--);
            }
        else 
            System.out.println("Sorry the number needed to be between 0 and 100");
    }

    /**
     * This method prints out one verse at a time 
     */
    public static void printVerse (int y)
    {
        String value = "bottles";

        if (y==1)
            value = "bottle";

        System.out.println(y +" "+ value + " of beer on the wall");
        System.out.println(y +" "+ value + " of beer");
        System.out.println("Take on down ");
        System.out.println("Pass it around");
        System.out.println("");
        if (y-1==1)  // use in second last verse
        {
            value = "bottle";
            System.out.println(y-1 +" "+ value + " of beer on the wall");   
        }
        else if (y-1==0)  //  use in last verse
            System.out.println("No more bottles of beer on the wall");
        else  //use for every other verse
            System.out.println(y-1 +" "+ value + " of beer on the wall");  
        System.out.println("");
    }
}
