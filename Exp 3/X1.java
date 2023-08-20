import java.awt.*;

public class X1
{
    public static void main(String[] args) 
    {
        Frame frame = new Frame("Jayesh Wagh");
        
        frame.setLayout(new GridLayout(5, 5,9,11));

        // Create 25 buttons in a 5x5 grid
        for (int i = 0; i < 25; i++) {
            Button button = new Button("Button " + (i + 1));
            frame.add(button);
            
        }

        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}




