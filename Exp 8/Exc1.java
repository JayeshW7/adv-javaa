import javax.swing.*; 
public class Exc1 extends JFrame
{
    Exc1()
    {
        String data[][] = {
        {"Siddhi","99","A"},
        {"Sanika","98","A"},
        {"Esha","90","A"},
        {"Akshara","92","A"},
        {"Sonali","98","A"},
        {"Unnati","93","A"},
        {"Simran","97","A"},
        {"Mihir","97","A"},
        {"Sanhil","85","A"},
        {"Abhishek","95","A"}
    };
    String column[]={"NAME","PERCENTAGE","GRADE"};
    JTable jt=new JTable(data,column);
    JScrollPane sp=new JScrollPane(jt);
    add(sp);
    setSize(300,400);
    setVisible(true);
    }   
    public static void main(String[] args) 
    {
        new Exc1(); 
    } 
}
