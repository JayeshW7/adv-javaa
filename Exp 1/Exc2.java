import java.awt.*; 
public class Exc2
{
    public static void main(String[] args)
    { 
        Frame f= new Frame("Jayesh");
        Choice c=new Choice(); 
        c.setBounds(100,100, 75,75); 
        c.add("Marathi"); 
        c.add("Hindi"); 
        c.add("English"); 
        c.add("Sanskrit"); 
        f.add(c); 
        f.setSize(400,400); 
        f.setLayout(null); 
        f.setVisible(true); 
    }
} 