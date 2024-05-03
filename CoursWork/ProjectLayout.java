import java.io.EOFException;
import java.io.InterruptedIOException;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
public class ProjectLayout implements ActionListener 
{
    //Frame
    private JFrame frame;

    //Those are the variables for the textBox to retrieve the data shared for the user
    private JTextField PhoneNumberTextField;
    private JTextField CallDurationTextField;
    private JTextField CreditTextField;
    private JTextField AvailableMemoryTextField;
    private JTextField ChangeMemoryTextField;    
    private JTextField modelTextField;
    private JTextField weightTextField;
    private JTextField sizeTextField;
    private JTextField priceTextField;
    private JTextField displayButtonTextField;

    //Those are the variables for the buttons
    private JButton newMobileButton;
    private JButton addCreditButton;
    private JButton callButton;
    private JButton newMp3Button;
    private JButton downloadButton;
    private JButton deleteButton;
    private JButton displayButton;
    private JButton pruebaButton;
    private JButton clearButton;

    //Those are the variables that I need for the differents methods
    private double memory=60000;
    private int credit=0;
    private int duration;
    private int newMinutes;
    private Gadget item;

    //ArrayList<Gadget> item = new ArrayList<Gadget>();
    //This line is to declare a Arraylist In this class , in this case I do not need the class Dbase, but if we want to do a extra class is rigth as well,
    

    //Here we are going to use all the variables and we are going to ubicate on our layout.
    public ProjectLayout() 
    {
        frame=new JFrame("Gadget Shop Yessenie");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //frame.setSize(750,750); I decide to make my panel resizable
        Container contentPane= frame.getContentPane();

        //Setting my type of layout
        contentPane.setLayout(new GridLayout(3,3,10,10));

        ///////////////////////////////
        //Panel1 for the add mobile button and add credit
        JPanel panel1 = new JPanel();
        //new mobile
        newMobileButton = new JButton("Add Mobile");
        newMobileButton.addActionListener(this);
        panel1.add(newMobileButton);
        //add credit
        addCreditButton = new JButton("Add Credit");
        addCreditButton.addActionListener(this);
        panel1.add(addCreditButton);
        
        ///////////////////////////////
        //Panel2 for the Display button and text box where to put the number of the item to show the information.
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1,1));

        displayButton = new JButton("Display Gadget");
        displayButton.addActionListener(this);
        panel2.add(displayButton);
        //displayButtonTextField
        displayButtonTextField = new JTextField();
        panel2.add(displayButtonTextField);

        ///////////////////////////////
        //Panel3 for the add Mp3 button
        JPanel panel3 = new JPanel();
        newMp3Button = new JButton("Add MP3");
        newMp3Button.addActionListener(this);
        panel3.add(newMp3Button);

        downloadButton = new JButton("Download");
        downloadButton.addActionListener(this);
        panel3.add(downloadButton);

        ///////////////////////////////
        //Panel4 for different textboxes like credit,Phone No, Duration,
        JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayout(3,2));
        //we should put the value or variable of the button

        panel4.add(new JLabel("Credit available"));
        //panel4.add(new JTextField());
        CreditTextField = new JTextField();
        panel4.add(CreditTextField);

        panel4.add(new JLabel("Phone No:"));
        //panel4.add(new JTextField());
        PhoneNumberTextField = new JTextField();
        panel4.add(PhoneNumberTextField);

        panel4.add(new JLabel("Duration Call"));
        //panel4.add(new JTextField());
        CallDurationTextField = new JTextField();
        panel4.add(CallDurationTextField);

        ///////////////////////////////
        //Panel5 to nest all the general textboxes of the gadget class
        //as model,price,size,weight
        JPanel panel5 = new JPanel();
        panel5.setLayout(new GridLayout(4,2));
        panel5.add(new JLabel("Model"));
        modelTextField = new JTextField();
        panel5.add(modelTextField);

        //panel5.add(modelTextField);
        panel5.add(new JLabel("Price"));
        //panel5.add(new JTextField());
        priceTextField = new JTextField();
        panel5.add(priceTextField);
        //.add(priceTextField);

        panel5.add(new JLabel("Size"));
        //panel5.add(new JTextField());
        sizeTextField = new JTextField();
        panel5.add(sizeTextField);
        //panel5.add(sizeTextField);

        panel5.add(new JLabel("Weight"));
        //panel5.add(new JTextField());
        weightTextField = new JTextField();
        panel5.add(weightTextField);
        //panel5.add(weightTextField);

        ////////////////////////////////
        //Panel6 to nest the text box memory, and memory size
        JPanel panel6 = new JPanel();
        panel6.setLayout(new GridLayout(3,2));
        //Those empty boxes are to create some spaces
        //to make look the panel like I like
        panel6.add(new JLabel(""));

        panel6.add(new JLabel(""));

        panel6.add(new JLabel("Memory"));
        //panel6.add(new JTextField());
        AvailableMemoryTextField = new JTextField();
        panel6.add(AvailableMemoryTextField);

        panel6.add(new JLabel("Song size"));
        ChangeMemoryTextField = new JTextField();
        panel6.add(ChangeMemoryTextField);

        ////////////////////////////////
        //Panel7
        //*****Especial code panel*****X)
        //Those empty boxes are to create some spaces
        //to make look the panel like I like
        JPanel panel7 = new JPanel();
        //callButton = new JButton("");
        //.add(callButton);
        panel7.add(new JLabel(""));

        ////////////////////////////////
        //Panel8 this panel is for the button make a call
        JPanel panel8 = new JPanel();
        callButton = new JButton("Make a call");
        callButton.addActionListener(this);
        panel8.add(callButton);

        ////////////////////////////////
        //Panel9 for the download button
        //clearButton
        JPanel panel9 = new JPanel();
        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        panel9.add(clearButton);

        ////////////////////////////////
        //Panel10 for the delete button
        //*****Especial code panel*****X)
        JPanel panel10 = new JPanel();
        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(this);
        panel10.add(deleteButton);

        //for make examples whit other forms to declarate the panels
        // JPanel panel1= new JPanel();
        // JPanel panel2= new JPanel();
        // JPanel panel3= new JPanel();
        // JPanel panel4= new JPanel();
        // JPanel panel5= new JPanel();
        // JPanel panel6= new JPanel();
        // JPanel panel7= new JPanel();
        // JPanel panel8= new JPanel();
        // JPanel panel4= new JPanel();
        // JPanel panel5= new JPanel();
        
        //Those lines are to change the color of baground of each pannel
        panel1.setBackground(Color.gray);
        panel2.setBackground(Color.gray);
        panel3.setBackground(Color.gray);
        panel4.setBackground(Color.yellow);
        panel5.setBackground(Color.white);
        panel6.setBackground(Color.yellow);
        panel7.setBackground(Color.gray);
        panel8.setBackground(Color.gray);
        panel9.setBackground(Color.gray);
        panel10.setBackground(Color.gray);

        //contentPane.setLayout(new GridLayout(3,3,10,10));
        //Those lines are to add the panels to the frame(contentPane) 
        contentPane.add(panel1);
        contentPane.add(panel2);
        contentPane.add(panel3);
        contentPane.add(panel4);
        contentPane.add(panel5);
        contentPane.add(panel6);
        contentPane.add(panel8);
        contentPane.add(panel9);
        contentPane.add(panel10);

        //To build the Frame and components
        frame.pack();
        // To make the frame resizable with the mouse
        frame.setResizable(true);
        //IMPORTANT to make visible the frame
        frame.setVisible(true);

    }


    public static void main (String[] args)
    {
        //ProjectLayout project= new ProjectLayout();
        SwingUtilities.invokeLater(ProjectLayout::new);
    }

    public void actionPerformed(ActionEvent behavior)
    {
        String command=behavior.getActionCommand();
        //////////////////////////////
        //To Call the Buttons and the Methods to perform
        ////////////////////////////// 

        //Button to add a mobile in the array
        if(command.equals("Add Mobile"))
        {
            //add mobile
            //Mobile newMobile =new Mobile(getModel(),getPrice(),getWeight(),getSize(),getCredit());
            try
            {
                NewMobile();
                JOptionPane.showMessageDialog(frame, "A new mobile is added");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Invalid, Input the model","ERROR1",
                    JOptionPane.ERROR_MESSAGE);
            }

        }
        //Button to add credit to the mobile
        if(command.equals("Add Credit"))
        {
            //comprobation if the method add work
            try
            {
                AddCredit();
                JOptionPane.showMessageDialog(frame, "New credit was added");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Invalid, Input the credit to add","ERROR2",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
        //Button to Make a call
        if(command.equals("Make a call"))
        {

            //comprobation if the method make a call work
            try
            {
                makeACall();
                JOptionPane.showMessageDialog(frame, "Your call was successful");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Invalid, Input the credit, Gadget No, and a numberPhone","ERROR3",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
        //Button to add an Mp3 in the arraylist
        if(command.equals("Add MP3"))
        {

            //comprobation if the method add work
            try
            {
                NewMP3();
                JOptionPane.showMessageDialog(frame, "A new MP3 is added");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Invalid, Input the correct Values","ERROR4",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
        //Button to download a song
        if(command.equals("Download"))
        {
            //comprobation if the method download work
            try
            {
                downloadMusic();
                JOptionPane.showMessageDialog(frame, "Download Succesfull");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Invalid, Input the correct value","ERROR5",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
        //Button to delete a song
        if(command.equals("Delete"))
        {
            //comprobation if the method download work      
            try
            {
                deletedMusic();
                JOptionPane.showMessageDialog(frame, "Delete Successful");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Invalid, Input the correct value","ERROR6",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
        //Button to Display  a gadget 
        if(command.equals("Display Gadget"))
        {
            //comprobation if the method download work
            try
            {
                DisplayItem();
                JOptionPane.showMessageDialog(frame, "Display Successful");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Invalid, Input the correct value","ERROR7",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
        //Button to Clear 
        if(command.equals("Clear"))
        {

            try
            {
                ClearAll();
                JOptionPane.showMessageDialog(frame, "Clear Successful");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Invalid, Input the correct value","ERROR8",
                    JOptionPane.ERROR_MESSAGE);
            }
        }

    }
    ///////////////////////////
    //Methods to get the information of the Textbox and parse   the value of the variables if is necessary
    ///////////////////////////

    //New Item
    ////////////////////////////// 
    //Getter for the Model
    public String getModel()
    {
        String aModel="";

        try
        {
            aModel=modelTextField.getText();
            //int M=System.out.println(aModel.length());
            if(aModel.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Invalid, Input the model1","ERROR9",
                    JOptionPane.ERROR_MESSAGE);
                aModel="";

            }  

        }
        catch(Exception e)
        // else
        {
            JOptionPane.showMessageDialog(null,"Invalid, Input the model2","ERROR9",
                JOptionPane.ERROR_MESSAGE);
            aModel="";
        }
        //aModel=modelTextField.getText();
        return aModel;
    }
    //Getter for the Price
    public float getPrice()
    {   
        float aPrice=0;

        try
        {
            aPrice=Float.parseFloat(priceTextField.getText());

            if(aPrice<=0)

            {
                JOptionPane.showMessageDialog(null,"Invalid, Input a positive price","ERROR10",
                    JOptionPane.ERROR_MESSAGE);
                aPrice=0;

            }
        }

        //Comprobations to avoid errors if the user ido not in a number
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Invalid, Input a number price","ERROR10",
                JOptionPane.ERROR_MESSAGE);
            aPrice=0;
        }
        return aPrice;
    }
    //Getter for the Weight
    public int getWeight()
    {
        //I put in the try the part to executed correct and the rule
        //and in catch the part of the error 
        int aWeigth=0;

        try
        {
            aWeigth=Integer.parseInt(weightTextField.getText());
            //Comprobations to avoid errors if the user in a negative number or cero
            if(aWeigth<=0)

            {
                JOptionPane.showMessageDialog(null,"Invalid, Input a positive Weigth","ERROR11",
                    JOptionPane.ERROR_MESSAGE);
                aWeigth=0;
            }
        }

        //Comprobations to avoid errors if the user ido not in a number
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Invalid, Input a number weigth","ERROR11",
                JOptionPane.ERROR_MESSAGE);
            aWeigth=0;
        }
        return aWeigth;
    }
    //Getter for the size
    public String getSize()
    {
        String aSize="";

        try
        {
            aSize=sizeTextField .getText();
            //Comprobations to avoid errors if the user in a negative or cero
            if(aSize.equals(""))

            {
                JOptionPane.showMessageDialog(null,"Invalid, Input a size","ERROR12",
                    JOptionPane.ERROR_MESSAGE);
                aSize="";
            }
        }

        //Comprobations to avoid errors if the user do not in a number
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Invalid, Input a number size","ERROR12",
                JOptionPane.ERROR_MESSAGE);
            aSize="";
        } 

        return aSize;
    }
    //public int getNumberItem()
    public int getNumberItem()
    {
        int aNItem=0;
        aNItem=Integer.parseInt(displayButtonTextField.getText());

        try
        {
            aNItem=Integer.parseInt(displayButtonTextField.getText());
            aNItem=aNItem-1;
            //int M=System.out.println(aModel.length());
            //Here we are going to setup the verification just for amounts less than 0
            //because o is also a position in the array
            //*****************If no we must set up the first position on the array like  1********************************
            if(aNItem<0)
            {
                JOptionPane.showMessageDialog(null,"Invalid, Input the number of the item that you want to see","ERROR13",
                    JOptionPane.ERROR_MESSAGE);
                //aNItem=0;

            }  

        }
        catch(Exception e)
        // else
        {
            JOptionPane.showMessageDialog(null,"Invalid, Input the numberItem","ERROR13",
                JOptionPane.ERROR_MESSAGE);
            aNItem=0;
        }
        
        return aNItem;
    }

    //Mobile class
    //Get the NoPhone
    public String getNoPhone()
    {
        String aNPhone="";
        int N=0;
        //String aNPhone=PhoneNumberTextField.getText();
        try 
        {
            aNPhone=PhoneNumberTextField.getText();
            N=(aNPhone.length());   

            //JOptionPane.showMessageDialog(frame,"Calling to: " +aNPhone + ".");
            if(aNPhone=="" || N<10 ) 
            {
                JOptionPane.showMessageDialog(null,"Invalid Imput, Please enter the No phone to make the call","ERROR14",
                    JOptionPane.ERROR_MESSAGE);

                aNPhone="";    
            }
        }   

        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Invalid, Input a number","ERROR14",
                JOptionPane.ERROR_MESSAGE);
            aNPhone=""; 
        }

        return aNPhone;
    }
    //Get the Credit
    public int getCredit()
    {
        //I put in the try the part to executed correct and the rule
        //and in catch the part of the error 
        int aCredit=0;
        //*********We have to do it for all the methods components of the items 
        try
        {
            aCredit=Integer.parseInt(CreditTextField.getText());
            //Comprobations to avoid errors if the user in a negative or cero
            if(aCredit<=0)

            {
                JOptionPane.showMessageDialog(null,"Invalid, Input a positive credit","ERROR15",
                    JOptionPane.ERROR_MESSAGE);

                aCredit=0;
            }
        }

        //Comprobations to avoid errors if the user do not in a number
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Invalid, Input a number credit","ERROR15",
                JOptionPane.ERROR_MESSAGE);
            aCredit=0;
        }

        return aCredit;
    }
    //CallDurationTextField
    public int getnDuration()
    {
        int aDuration=0;

        aDuration=Integer.parseInt(CallDurationTextField.getText());

        return aDuration;
    }

    //MP3 Class
    //getMemory
    public int getMemory()
    {
        int aMemory=0;
        //Try and Catch to avoid Empty values
        try
        {
            aMemory=Integer.parseInt(AvailableMemoryTextField.getText());
            //Comprobations to avoid errors if the user in a negative or cero
            if(aMemory<=0)

            {
                JOptionPane.showMessageDialog(null,"Invalid, Input a positive amount of memory","ERROR17",
                    JOptionPane.ERROR_MESSAGE);
                aMemory=0;
            }
        }

        //Comprobations to avoid errors if the user do not in a number
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Invalid, Input a number memory","ERROR17",
                JOptionPane.ERROR_MESSAGE);
            aMemory=0;
        }
        return aMemory;
    }

    //ChangeMemoryTextField
    public int getsizeSong()
    {
        int aSMemory=0;
        aSMemory=Integer.parseInt(ChangeMemoryTextField.getText());

        return aSMemory;
    }
    ///////////////////////////
    //Methods to Manage the buttons
    ///////////////////////////
    //New Mobile
    public void  NewMobile() throws Exception
    {
        //item from the gadget class type declare on the constructore
        //This If work to avoid empthy values in Model, and Size Strings
        //I trow the Exception from the if

        if (getModel().equals("") || getSize().equals("") || getPrice()<=0 || getWeight()<=0 || getCredit()<=0)
        {
            throw new Exception();

        }

        else

        {
            item =new Mobile(getModel(),getPrice(),getWeight(),getSize(),getCredit());
            item.showAllDetails();

        }
    }
    //*******first the index to check wich object I want to add the credit***********
    public void AddCredit() throws Exception
    {
        //Mobile mobile= (Mobile)item;
        //mobile.addMinutes(getCredit());

        if (getCredit()<=0)
        {
            JOptionPane.showMessageDialog(null,"Invalid, Input a correct number","ERROR15",
                JOptionPane.ERROR_MESSAGE);
            throw new Exception();

        }

        else

        {
            if(getNumberItem()<0)
            {

                JOptionPane.showMessageDialog(null,"Invalid, Input a correct phone number","ERROR16",
                    JOptionPane.ERROR_MESSAGE);
                throw new Exception();
                //throw new Exception();

            }
            else
            {
                //I am casting the item from the array to a datatype Gadget
                Gadget gadget = DBase.items.get(getNumberItem());
                gadget.showAllDetails();
                
                if(gadget instanceof Mobile)
                {
                    Mobile mobile= (Mobile)gadget;           
                    mobile.addMinutes(getCredit());
                    CreditTextField.setText("" + mobile.getnMinutes());
                }
                
            }
            
        }
    }

    //Make a call method
    public void makeACall() throws Exception
    {

        if(getNoPhone().equals("") || getnDuration()<=0)
        {

            throw new Exception();

        }
        else
        {
            if(getNumberItem()<0)
            {

                JOptionPane.showMessageDialog(null,"Invalid, Input a correct phone number","ERROR16",
                    JOptionPane.ERROR_MESSAGE);
                throw new Exception();
                //throw new Exception();

            }
            else
            {
                //I am casting the item from the array to a datatype Gadget
                Gadget gadget = DBase.items.get(getNumberItem());
                gadget.showAllDetails();
                
                if(gadget instanceof Mobile)
                {
                    Mobile mobile= (Mobile)gadget;
                    JOptionPane.showMessageDialog(frame, "The no mobile is"+ getNoPhone());

                    mobile.makeCall(getnDuration(),getNoPhone());
                    CreditTextField.setText("" + mobile.getnMinutes());
                }
                
            }
            
        }

    }

    public void DisplayItem() throws Exception
    {

        //LIVE The IF <0, we need the position 0 on the array or setup the 1rst position of the array in 1 instead of 0**********
        if(getNumberItem()<0)
        {

            JOptionPane.showMessageDialog(null,"Invalid, Input a correct phone number","ERROR16",
                JOptionPane.ERROR_MESSAGE);
            throw new Exception();
            //throw new Exception();

        }
        else
        {
            //I am casting the item from the array to a datatype Gadget

            Gadget gadget = DBase.items.get(getNumberItem());
            JOptionPane.showMessageDialog(frame, "The no gadget is"+ gadget);
            //JOptionPane.showMessageDialog(frame, "The no mobile is"+ mobile);
            gadget.showAllDetails();
        }

    }
    //New Mp3
    public void  NewMP3() throws Exception
    {   
        //class to store
        //We will keep this example in case that we like to work with the array directly in this class
        //MP3 newMP3 =new MP3(getModel(),getPrice(),getWeight(),getSize(),getMemory());
        //newMP3.showAllDetails();

        //Try and Catch to avoid Empty values

        if (getModel().equals("") || getSize().equals("") || getPrice()<=0 || getWeight()<=0 || getMemory()<=0)
        {
            throw new Exception();

        }

        else

        {
            item =new MP3(getModel(),getPrice(),getWeight(),getSize(),getMemory());
            item.showAllDetails();
        }

    }
    //Download method
    public void downloadMusic() throws Exception
    {
        //Try and Catch to avoid Empty values

        if(getMemory()<=0 && getsizeSong()<=0 )
        {
            {
                JOptionPane.showMessageDialog(null,"Invalid, Input a positive amount of memory","ERROR18",
                    JOptionPane.ERROR_MESSAGE);
                throw new Exception();
            }
        }
        else
        {
            
             if(getNumberItem()<0)
            {

                JOptionPane.showMessageDialog(null,"Invalid, Input a correct phone number","ERROR16",
                    JOptionPane.ERROR_MESSAGE);
                throw new Exception();
                //throw new Exception();

            }
            else
            {
                //I am casting the item from the array to a datatype Gadget
                Gadget gadget = DBase.items.get(getNumberItem());
                gadget.showAllDetails();
                

                if(gadget instanceof MP3)
                {
                    MP3 mp3= (MP3)gadget;
                    

                    mp3.downloadMusic(getsizeSong());
                    AvailableMemoryTextField.setText("" + mp3.getnMemory());
                }
                
            }
                       
        }

    }
    //Delete a Song
    public void deletedMusic() throws Exception
    {
        //Try and Catch to avoid Empty values

        if( getsizeSong()<=0)
        {
            {
                JOptionPane.showMessageDialog(null,"Invalid, Input a positive amount of memory","ERROR19",
                    JOptionPane.ERROR_MESSAGE);
                throw new Exception();
            }
        }
        else
        {
            if(getNumberItem()<0)
            {

                JOptionPane.showMessageDialog(null,"Invalid, Input a correct phone number","ERROR16",
                    JOptionPane.ERROR_MESSAGE);
                throw new Exception();
                //throw new Exception();

            }
            else
            {
                
                Gadget gadget = DBase.items.get(getNumberItem());
                gadget.showAllDetails();
                

                if(gadget instanceof MP3)
                {
                    //I am casting the item from the array to a datatype MP3
                    MP3 mp3= (MP3)gadget;
                    
                    //after we pas the variable to work with the method delete in the
                    //MP3 class
                    mp3.deletedMusic(getsizeSong());
                    AvailableMemoryTextField.setText("" + mp3.getnMemory());
                }
                
            }
            
        }

    }
    //Clear Method
    public void ClearAll()
    {
        //Model
        modelTextField.setText("");
        //Price
        priceTextField.setText("");
        //weightTextField
        weightTextField.setText("");
        //sizeTextField
        sizeTextField.setText("");
        //displayButtonTextField: numberItem
        displayButtonTextField.setText("");
        //PhoneNumberTextField: number phone
        PhoneNumberTextField.setText("");
        //CreditTextField
        CreditTextField.setText("");
        //CallDurationTextField: duration when a call is made
        CallDurationTextField.setText("");
        //AvailableMemoryTextField: memory to create a item and make a change on the memory size
        AvailableMemoryTextField.setText("");
        //ChangeMemoryTextField: size of the memory when it is download or delete a song
        ChangeMemoryTextField.setText("");

    }
    ///

}
