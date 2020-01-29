import javax.swing.*;
public class Customer 
{
    static JFrame frameObject;
    static JPanel panelObject;
    JLabel labelCustName;
    JLabel labelCustCellNo;
    JLabel labelCustPackage;
    JLabel labelCustAge;
    JTextField textCustName;
    JTextField textCustCellNo;
    JComboBox comboCustPackage;
    JTextField textCustAge;
    public static void main(String args[])
    {
        //static JFrame frameObject;
        frameObject=new JFrame("Customer Details Form");
        frameObject.setVisible(true);
        frameObject.setSize(300,300);
        
        Customer customerObject=new Customer();
    }
    public Customer()
    {
        panelObject=new JPanel();
        frameObject.getContentPane().add(panelObject);
        frameObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labelCustName=new JLabel("Customer Name:");
        labelCustCellNo=new JLabel("Cell No:");
                labelCustPackage=new JLabel("Package:");
           labelCustAge=new JLabel("Age:");   
           textCustName=new JTextField(30);
           textCustCellNo=new JTextField(30);
           textCustAge=new JTextField(30);
           String packages[]={"Executive","Standard"};
           comboCustPackage=new JComboBox(packages);
           panelObject.add(labelCustName);
           panelObject.add(textCustName);
           
            panelObject.add(labelCustCellNo);
           panelObject.add(textCustCellNo);
           
            panelObject.add(labelCustPackage);
           panelObject.add(comboCustPackage);
           
            panelObject.add(labelCustAge);
           panelObject.add(textCustAge);
           
   
    }
    }
    
    

