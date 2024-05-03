import java.util.ArrayList;
 
public class DBase
{   // declare our array in the constructor
    // create an array to content our items 
    //Gadget it is the type and items is the name of the arraylist
    public static ArrayList<Gadget> items = new ArrayList<Gadget>();
    
    //Initializate the items array
    public static void addGadget(Gadget gadget )
    {
        items.add(gadget);
    }
    

    public void addMobile(String theModel,float thePrice,int theWeight, String theSize, int nMinutes)
    {
        //create a new item for mobil
        Gadget newMobile = new Mobile (theModel,thePrice,theWeight,theSize, nMinutes) ;
        items.add(newMobile);
    }
    
    
    public void addMP3(String theModel,float thePrice,int theWeight, String theSize, int nMemory)
    {
        //create a new item for MP3
        Gadget newMP3 = new MP3 (theModel, thePrice, theWeight, theSize, nMemory);
        items.add(newMP3);
    }
    
    
    
}
