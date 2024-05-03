

public class Gadget
{
    // instance variables - replace the example below with your own
    private String model;
    private float price;
    private int weight;
    private String size;
    private boolean goIt;

    /**
     * Constructor for objects of class Gadget
     */
    public Gadget(String theModel,float thePrice, int theWeigth, String thesize)
    {
        // initialise instance variables
        //Try here to catch an error
         if(thePrice!=0 && theWeigth!=0)
        {
                model = theModel;
                price = thePrice;
                weight = theWeigth;
                size = thesize;
                goIt = false;

                DBase.addGadget(this);
        }

    }   
    
    //Accessor for model
    public String getModel()
    {
        return model;

    }

    //Seter method for mode
    public void setModel(String model)
    {
        this.model = model;

    }

    //Accessor method for price
    public float getPrice()
    {
        return price;

    }

    //Seter method for price
    public void setprice(float price)
    {
        this.price = price;

    }

    //Assessor for weight
    public double getWeight()
    {
        return weight;

    }

    //Seter method for weight
    public void setWeight(int weight)
    {
        this.weight = weight;

    }

    //Accesor for Size
    public String getSize()
    {
        return size;

    }

    //Seter method for size
    public void setSize(String size)
    {
        this.size = size;

    }

    // method for getOwn
    public void setOwn(boolean ownIt)
    {
        goIt = ownIt;
    }

    // method for getOwn
    /**
     * @return true if we own a copy of this item.
     */
    public boolean getOwn()
    {
        return goIt;
    }


    //Method to show all the attributes
    public void showAllDetails()
    {
        System.out.println("Detail of the Model:");
        System.out.println(" Model: "+ model + "\n Weight: "+weight+ "\n Size: "+size+"\n Price: "+ price+ "\n");
        
        if (goIt)
        {
            System.out.println("*");
        }

        else
        {
            System.out.println();
        }
    }
}
