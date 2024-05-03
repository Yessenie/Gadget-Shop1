
/**
 * Write a description of class Mobile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mobile extends Gadget
{
    // instance variables - replace the example below with your own
    private int minutes;
    private int totalCredit;
    private String noPhone;
    private String NclallNoPhone;
    private int Nitem;
    //private int Newcredit;

    /**
     * Constructor for objects of class Mobile
     */

    public Mobile(String theModel,float thePrice,int theWeight, String theSize, int nMinutes)
    {//99156146
        //Atributes from Gadget
        super(theModel,thePrice,theWeight,theSize);
        //Unic atribute of Mobile class
        minutes = nMinutes;
    }

    /**
     * @return    the sum of x and y
     */
    //Accesor for minutes
    public int getnMinutes()
    {
        
        return minutes;
    }

    //Method to connect with the showAllDetails of the superClass and show the new atribute of Mobile
    public void showAllDetails()

    {
        super.showAllDetails();
        System.out.println("You have " + minutes+ " minutes of credit.\n");
        System.out.println("#########################################################################\n");
        System.out.println();

        
    }
    
    public String getnNoPhone()
    {
        
        return noPhone;
    }
    
    

    //Method to add credit
    public void addMinutes(int Newcredit)
    {
        //totalCredit = minutes;
        if (Newcredit==0)
        {
            Newcredit=minutes ;
            System.out.println("Action cancelled, You have to input a number different than 0 \n");
            System.out.println("#########################################################################\n");
        }

        else
        {
            minutes=minutes+Newcredit;

            System.out.println("You added a new credit, your current credit is " + minutes + " minutes \n");
            System.out.println("#########################################################################\n");
        }

    }
    //Method to make a call and rest minutes of the credits
    public void makeCall(int callMinutes, String clallNoPhone)
    {
        //Line to try to catch the error for the NoPhone
        //if (clallNoPhone!=null || callMinutes==0)
        if (clallNoPhone!=null || callMinutes!=0)

        { 
            
            noPhone=clallNoPhone;
            totalCredit = minutes;
            
            if (minutes<=totalCredit && minutes > 0 && callMinutes<=totalCredit)
            {
                minutes=minutes-callMinutes;
                
                System.out.println("Call successful to " + noPhone + " phone\n" );
                System.out.println("You have " + minutes + " Available. \n");
                System.out.println("#########################################################################\n");
            }
            else
            {
                System.out.println("You do not have enough credit \n");
                System.out.println("Credit available: " + minutes + " Top up your credit \n");
                System.out.println("#########################################################################\n");
            }
        }
        else
        {
            System.out.println("Please enter a No Phone and credit for the call ");

        System.out.println("#########################################################################\n");
    }
        // System.out.println("Please enter the minute credit of your plan");
    }
}
