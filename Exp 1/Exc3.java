import java.awt.*;

public class Exc3
{
    public static void main(String[] args) 
    {
        Frame f = new Frame("Jayesh Wagh");
        f.setLayout(new FlowLayout());

        Button okButton = new Button("OK");
        Button resetButton = new Button("RESET");
        Button cancelButton = new Button("CANCEL");

        f.add(okButton);
        f.add(resetButton);
        f.add(cancelButton);

        f.setSize(300, 150);
        f.setVisible(true);
    }
}
