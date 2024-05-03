

public class MP3 extends Gadget
{
    // instance variables - replace the example below with your own
    private int memory;
    private int TotalMemory;
    

    /**
     * Constructor for objects of class Mobile
     */

    public MP3(String theModel,float thePrice,int theWeight, String theSize, int nMemory)
    {
        
        super(theModel,thePrice,theWeight,theSize);
        memory = nMemory;
        TotalMemory=memory;
    }

    //Accessor for memory
    public int getnMemory()
    {
        // put your code here
        return memory;
    }
    
    //Method to connect with the showAllDetails of the superClass and show the new atribute of Mobile
    public void showAllDetails()
    
    {
        super.showAllDetails();
        System.out.println("You have available " + memory+ " GB of memory.\n");
        System.out.println("#########################################################################\n");
        System.out.println();
        
                

        
    }
    
    
    //Method to download music (We should in the amount of memory to use, after we should check if there
    //memory available to complete the process, if no bring a message of error)
    public void downloadMusic(int Mnewmemory)
    {
        
        //After making this comprobation from the GUI
        if (memory >= 0 && memory>=Mnewmemory)
        {
            
            //memory have to be more than 0 but less than the current memory
            if(Mnewmemory>=0 && Mnewmemory<=TotalMemory)
            {
                memory=memory-Mnewmemory;
                
                    System.out.println("Download successful\n");
                    System.out.println("You have " +memory+ " GB of memory available\n");
                    System.out.println("#########################################################################\n");
                
                
            }
            else
            {
                System.out.println("Error, Memory insufficient, Try a number different\n");
                System.out.println("#########################################################################\n");
            }
            
        }
        
        else
        {
            System.out.println("You do not have memory available, delete first to store other song\n");
            System.out.println("#########################################################################\n");
        }
        
        
    }
    
    public void deletedMusic(int lessmemory)
    {
        System.out.println("Total memory"+TotalMemory);
        if ( lessmemory > 0 & lessmemory<= TotalMemory)
        {
            System.out.println("lessmemory is"+lessmemory);
            System.out.println("memory is"+memory);
            if (memory>=lessmemory& memory<TotalMemory)
            {
            //We must check check how to do not over pass the memory that we set at the
            //beginning when we create the item
            //for now the method and the button on the layout is working
            //Also we have to do the error checks on the layout for the memory
            
            memory=memory+lessmemory;
            
                System.out.println("Delete successful");
                System.out.println("You have " +memory+ " GB of memory available \n");
                System.out.println("#########################################################################\n");
            }
            
             else
            {
                //Newmemory=0;
                System.out.println("The Memory is empty");
                System.out.println("Error " +memory+ " GB of memory available \n");
                System.out.println("#########################################################################\n");
            }
        
        }
        else
        {
                //Newmemory=0;
                System.out.println("Try a number different \n");
                System.out.println("#########################################################################\n");
        }
    }   
        
        
    
}
